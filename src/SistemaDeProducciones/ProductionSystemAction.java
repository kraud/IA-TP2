package SistemaDeProducciones;

import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

import simulator.EstadoAmbiente;
import domain.Regla;

/**
 * Clase que implementa las acciones que el sistema de produccion puede
 * devolverle al ambiente.
 */
public class ProductionSystemAction extends frsf.cidisi.faia.agent.Action {

    Regla rule;

    public ProductionSystemAction(Regla r){
        rule = r;
    }

    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est){
        //TODO Futuro: Esto esta armado para el Chatbot pero deber�a incorporarse en la clase Enviroment el metodo update.
        EstadoAmbiente cest = (EstadoAmbiente) est;
        cest.update(ast,rule);
        return cest;
    }

    @Override
    public String toString() {
        return "Ejecutar";
    }

    public Regla getRegla(){
        return rule;
    }

}