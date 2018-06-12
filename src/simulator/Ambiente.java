package simulator;

import frsf.cidisi.faia.environment.Environment;

public class Ambiente extends Environment {

    public Ambiente(String oracion) {
        this.environmentState = new EstadoAmbiente(oracion);

    }

    public EstadoAmbiente getEnvironmentState() {
        return (EstadoAmbiente) super.getEnvironmentState();
    }
    @Override
    public  ChatbotPerception getPercept() {
        // Create a new perception to return
        ChatbotPerception perception = new ChatbotPerception();

        perception.setOracion(this.getEnvironmentState().getOracion());

        return perception;
    }

    public String toString() {
        return environmentState.toString();
    }
}
