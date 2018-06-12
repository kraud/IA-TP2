package domain;

import java.util.List;

public class Regla{

    private List<String> condiciones; 	//Contiene las palabras claves de la condicion
    private String respuesta; 			//Contiene la frase que va a contestar
    private int id;						//Es el id de la regla. Sirve para compararlas
    private int specificity;
    private int priority;
    private int novelty;

    public Regla (List<String> condiciones, String respuesta, int id, int specificity, int priority, int novelty){
        //super();
        this.setCondiciones(condiciones);
        this.setRespuesta(respuesta);
        this.setId(id);
        this.setSpecificity(specificity);
        this.setPriority(priority);
        this.setNovelty(novelty);
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setCondiciones(List<String> condiciones) {
        this.condiciones = condiciones;
    }

    public List<String> getCondiciones() {
        return condiciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSpecificity(int specificity) {
        this.specificity = specificity;
    }

    public int getSpecificity() {
        return specificity;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setNovelty(int novelty) {
        this.novelty = novelty;
    }

    public int getNovelty() {
        return novelty;
    }

}