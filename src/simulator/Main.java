package simulator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Main extends JFrame{

    ChatbotAgent agent;
    Ambiente environment;
    KnowledgeBasedAgentSimulator simulator;

    private static final long serialVersionUID = 1L;

    private JTextArea mensaje = new JTextArea();

    private JLabel labelRta = new JLabel("MONITOR:");
    private JTextArea respuesta = new JTextArea();
    private JScrollPane sp = new JScrollPane(respuesta);

    private JLabel labelLog = new JLabel("LOG:");
    private JTextArea logFases = new JTextArea();
    private JScrollPane logSP = new JScrollPane(logFases);

    JButton enviar = new JButton("ENVIAR");


    public Main() {
        setResizable(false);

        // INICIALIZACION
        agent = new ChatbotAgent();
        environment = new Ambiente("");
        simulator = new KnowledgeBasedAgentSimulator(environment, agent);

        getContentPane().setLayout(null);

        // Panel de respuesta
        labelRta.setFont(new Font("Century Gothic", Font.BOLD, 16));
        getContentPane().add(labelRta);
        labelRta.setLocation(25,5);
        labelRta.setSize(200,15);

        respuesta.setFont(new Font("Tahoma", Font.PLAIN, 11));
        respuesta.setRows(1);
        respuesta.setEditable(false);
        respuesta.setBounds(25, 25, 350, 250);
        respuesta.setColumns(10);
        respuesta.setBackground(Color.WHITE);

        sp.setBounds(25, 25, 529, 334);
        getContentPane().add(sp);
        sp.setViewportView(respuesta);

        // Panel de informacion sobre las fases
        labelLog.setFont(new Font("Century Gothic", Font.BOLD, 16));
        getContentPane().add(labelLog);
        labelLog.setLocation(560,5);
        labelLog.setSize(200,15);

        logFases.setFont(new Font("Courier New", Font.PLAIN, 11));
        logFases.setRows(1);
        logFases.setEditable(false);
        logFases.setBounds(560,25,350,250);
        logFases.setColumns(10);
        logFases.setBackground(new Color(192, 192, 192));

        logSP.setBounds(560,25,400,334);
        getContentPane().add(logSP);
        logSP.setViewportView(logFases);

        // Panel de cargado de mensaje
        mensaje.setText("Ingrese aqui la percepcion del agente.");
        mensaje.setBounds(25, 370, 529, 91);
        getContentPane().add(mensaje);
        mensaje.setColumns(10);

        // Formato del boton de enviar
        enviar.setBounds(610, 377, 300, 69);
        enviar.setFont(new Font("Century Gothic", Font.BOLD, 20));
        enviar.setBackground(new Color(217, 217, 217));
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

        mensaje.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent fe) {
                mensaje.setText("");
            }
        });

        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Fin");
                System.exit(EXIT_ON_CLOSE);
            }
        });
        this.setBounds(300,100,990,500);

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

            if(rta.equals("** no privacy violations detected **")){ // para que cuando no existan problemas, no diga "accion a realizar"
                respuesta.setText(respuesta.getText()+time+" :\n      " + rta);
            }
            else{
                respuesta.setText(respuesta.getText()+time+"    Accion a realizar:\n      " + rta);
            }
            logFases.setText(log + "\n");

            respuesta.setText(respuesta.getText()+"\n");
            mensaje.setText("Ingrese una nueva percepcion.");
            enviar.setFocusPainted(true);

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