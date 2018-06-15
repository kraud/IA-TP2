package simulator;

import domain.Regla;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class EstadoAmbiente extends EnvironmentState {

    //Se deben definir las variables del estado del ambiente

    private String oracion;

    public EstadoAmbiente(String oracion) {
        this.oracion=oracion;
    }

    @Override
    public void initState() {

    }

    @Override
    public String toString() {
        String str = "Se escribio: "+this.oracion;
        return str;
    }

    public void update(AgentState ast, Regla rule) {
        //ACA TIENE QUE ACTUALIZAR EL ESTADO DEL AMBIENTE, ES DECIR LA PANTALLA
        //System.out.println(rule.toString());
        System.out.println("Agente dice: "+rule.getRespuesta());
    }
    public String getOracion() {
        return oracion;
    }
    public void setOracion(String oracion) {
        this.oracion = oracion;
    }
}