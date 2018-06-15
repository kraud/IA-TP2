package simulator;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;

public class Main extends JFrame{

    ChatbotAgent agent;
    Ambiente environment;
    KnowledgeBasedAgentSimulator simulator;

    private static final long serialVersionUID = 1L;

    private JTextField mensaje = new JTextField();

    private JTextArea respuesta = new JTextArea();
    private JScrollPane sp = new JScrollPane(respuesta);

    private JTextArea logFases = new JTextArea();
    private JScrollPane logSP = new JScrollPane(logFases);

    JButton enviar = new JButton("Enviar");

    public Main() {
        setResizable(false);

        agent = new ChatbotAgent();
        environment = new Ambiente("");
        simulator = new KnowledgeBasedAgentSimulator(environment, agent);

        getContentPane().setLayout(null);
        respuesta.setFont(new Font("Tahoma", Font.PLAIN, 11));
        respuesta.setRows(1);
        respuesta.setEditable(false);
        respuesta.setBounds(25, 25, 650, 300);
        respuesta.setColumns(10);
        respuesta.setBackground(Color.WHITE);

        sp.setBounds(25, 25, 679, 384);
        getContentPane().add(sp);
        sp.setViewportView(respuesta);

        logFases.setFont(new Font("Courier New", Font.PLAIN, 11));
        logFases.setRows(1);
        logFases.setEditable(false);
        logFases.setBounds(725,25,350,300);
        logFases.setColumns(10);
        logFases.setBackground(Color.CYAN);

        logSP.setBounds(710,25,400,384);
        getContentPane().add(logSP);
        logSP.setViewportView(logFases);

        mensaje.setBounds(25, 420, 569, 41);
        getContentPane().add(mensaje);
        mensaje.setColumns(10);

        enviar.setBounds(604, 420, 100, 41);
        getContentPane().add(enviar);




        enviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buscarRespuesta();
            }
        });

        mensaje.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                mensaje.setText(mensaje.getText());
            }
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    buscarRespuesta();
                }
            }

        });

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Fin");
                System.exit(EXIT_ON_CLOSE);
            }
        });
        this.setBounds(300,100,1140,500);

    }

    public void buscarRespuesta(){
        if(!mensaje.getText().isEmpty()){
            Calendar calendario = Calendar.getInstance();
            int hora =calendario.get(Calendar.HOUR_OF_DAY);
            int minutos = calendario.get(Calendar.MINUTE);
            int segundos = calendario.get(Calendar.SECOND);
            String time = hora+":"+minutos+":"+segundos;
            String oracionAux = mensaje.getText();
            environment.getEnvironmentState().setOracion(mensaje.getText().toUpperCase());

            ArrayList<String> resultados = simulator.start();
            String log = "";
            // Operacion a realizar por el ChatBot
            String rta = resultados.get(0);
            // Log con detalles sobre las 3 fases que realiza el ChatBot para decidir que hacer
            if(resultados.size()>1) {
                log = resultados.get(1);
            }


            respuesta.setText(respuesta.getText()+time+"    El agente detecta la siguiente interaccion:\n      " + oracionAux);
            respuesta.setText(respuesta.getText()+"\n");

            // Ingresar aca la solucion de conflictos (las reglas que matchean y los criterios que las filtran)


            if(rta.equals("** no privacy violations detected **")){ // para que cuando no existan problemas, no diga "accion a realizar"
                respuesta.setText(respuesta.getText()+time+" :\n      " + rta);
            }
            else{
                respuesta.setText(respuesta.getText()+time+"    Accion a realizar:\n      " + rta);
            }
            logFases.setText(time+":\n" + log + "\n");

            respuesta.setText(respuesta.getText()+"\n");
            mensaje.setText("");

        }
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main frame = new Main();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }
}