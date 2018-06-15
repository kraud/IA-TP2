package simulator;


import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import SistemaDeProducciones.BaseDeConocimiento;
import SistemaDeProducciones.Problema;
import SistemaDeProducciones.MaquinaDeInferencia;
import SistemaDeProducciones.criteria.*;
import domain.Regla;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Perception;


public class ChatbotAgent extends KnowledgeBasedAgent{

    EstadoChatbot agState;
    List<Criteria> listaCriterios;
    List<Regla> listaReglas;
    MaquinaDeInferencia mdi;
    Problema problema;

    public ChatbotAgent(){

        agState = new EstadoChatbot();
        this.setAgentState(agState);

        listaCriterios = new ArrayList<Criteria>();
        listaCriterios.add(new NoDuplication());
        listaCriterios.add(new Specificity());
        listaCriterios.add(new Priority());
        listaCriterios.add(new Random());
        listaCriterios.add(new Novelty());

        listaReglas = new ArrayList<Regla>();
        cargarReglas();

        mdi = new MaquinaDeInferencia(listaCriterios, listaReglas);

        problema = new Problema();
    }

    @Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }

    public Action learn() throws Exception{

        Action selectedAction = null;
        problema.setPalabrasClaves(agState.getListaClaves());
        //Problema[] list = {problema};
        //Aca se deben pasar las palabras claves, se pasan como un problema para que sea del tipo Object
        //selectedAction = mdi.solve(list);

        try {
            selectedAction = mdi.solve(new Object[]{problema});
        } catch (Exception ex) {
            Logger.getLogger(ChatbotAgent.class.getName(), null).log(Level.SEVERE, null, ex);
        }

        // Return the selected action
        return selectedAction;

    }

    public void cargarReglas(){//ACA SE CARGAN LAS REGLAS
		/*Estructura de una regla:
		Condiciones - Then - id - specificity - priority - novelty*/
        listaReglas = new BaseDeConocimiento().crearReglas();
    }

    @Override
    public Action selectAction() {
        // TODO Auto-generated method stub
        return null;
    }
}