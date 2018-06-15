package SistemaDeProducciones;

import domain.Regla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemoriaDeProduccion {
    private List<Regla> listaReglas;

    public MemoriaDeProduccion(){
        listaReglas = new ArrayList<Regla>();
    }
    public List<Regla> crearReglas(){

        //NOMBRE DE ALGUIEN
        listaReglas.add(new Regla(Arrays.asList("NAME","SOMEONE","FAMILY"), "DO NOT ANSWER THIS", 1, 3, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("NAME","WHAT","FAMILY"), "DO NOT ANSWER THIS", 2, 3, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("NAME","SOMEONE","WHAT","FAMILY"), "DO NOT ANSWER THIS", 3, 3, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("NAME","TEACHER"), "DO NOT ANSWER THIS", 4, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("NAME","PET"), "DO NOT ANSWER THIS", 5, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("NAME","PET","SOMEONE","WHAT"), "DO NOT ANSWER THIS", 6, 1, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("NAME","PET","WHAT"), "DO NOT ANSWER THIS", 7, 3, 4, 1));

        //INFO DE LUGARES
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","GO"), "DO NOT ANSWER THIS", 8, 3, 6, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","SOMEONE"), "DO NOT ANSWER THIS", 9, 3, 6, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","BORN"), "DO NOT ANSWER THIS", 10, 3, 7, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","SOMEONE","BORN"), "DO NOT ANSWER THIS", 11, 4, 7, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","FAMILY"), "DO NOT ANSWER THIS", 12, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","FAMILY"), "DO NOT ANSWER THIS", 13, 3, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","FAMILY","SOMEONE"), "DO NOT ANSWER THIS", 14, 4, 6, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PLACE","NAME"), "DO NOT ANSWER THIS", 15, 3, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PET","PLACE"), "DO NOT ANSWER THIS", 16, 3, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("WHAT","PET"), "DO NOT ANSWER THIS", 17, 2, 3, 1));

        //DINERO Y OBJETOS
        listaReglas.add(new Regla(Arrays.asList("MONEY","WHAT","FAMILY"), "CALLING PARENTS", 18, 3, 6, 1));
        listaReglas.add(new Regla(Arrays.asList("MONEY","WHAT","SOMEONE"), "CALLING PARENTS", 19, 3, 6, 1));
        listaReglas.add(new Regla(Arrays.asList("MONEY","WHAT","SOMEONE","FAMILY"), "CALLING PARENTS", 20, 3, 7, 1));
        listaReglas.add(new Regla(Arrays.asList("MONEY","PLACE"), "CALLING PARENTS", 21, 2, 7, 1));
        listaReglas.add(new Regla(Arrays.asList("MONEY","PLACE","WHAT"), "CALLING PARENTS", 22, 3, 8, 1));
        listaReglas.add(new Regla(Arrays.asList("MONEY","NAME"), "CALLING PARENTS", 23, 2, 6, 1));

        //EDAD
        listaReglas.add(new Regla(Arrays.asList("OLD","FAMILY"), "DO NOT ANSWER THIS", 24, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("OLD","FAMILY","SOMEONE"), "DO NOT ANSWER THIS", 25, 6, 5, 1));

        //ACTIVIDADES FAMILIARES
        listaReglas.add(new Regla(Arrays.asList("ACTIVITY","FAMILY","SOMEONE"), "RECORDING CHAT", 26, 3, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("ACTIVITY","FAMILY"), "RECORDING CHAT", 27, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("ACTIVITY","FAMILY","WEAR","SOMEONE"), "RECORDING CHAT", 28, 4, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("ACTIVITY","FAMILY","WEAR"), "RECORDING CHAT", 29, 3, 4, 1));

        //ORDENES PELIGROSAS
        listaReglas.add(new Regla(Arrays.asList("TAKE","PHOTO","SOMEONE"), "RECORDING CHAT, CALLING PARENTS", 30, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("TAKE","PHOTO"), "RECORDING CHAT, CALLING PARENTS", 31, 2, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("TAKE","WEAR","OUT"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 32, 3, 6, 1));
        listaReglas.add(new Regla(Arrays.asList("XXX"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 33, 1, 8, 1));
        listaReglas.add(new Regla(Arrays.asList("XXX","SOMEONE","FAMILY"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 34, 3, 8, 1));
        listaReglas.add(new Regla(Arrays.asList("XXX","SOMEONE"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 35, 2, 8, 1));
        listaReglas.add(new Regla(Arrays.asList("XXX","PHOTO"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 36, 2, 9, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","OUT"), "RECORDING CHAT", 37, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","OUT","FAMILY","SOMEONE"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 38, 4, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","OUT","FAMILY","PLACE"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 39, 4, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","OUT","FAMILY"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 40, 3, 5, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","FAMILY"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 41, 2, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","PLACE","FAMILY"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 42, 3, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","PLACE","FAMILY","SOMEONE"), "DO NOT ANSWER THIS, RECORDING CHAT, CALLING PARENTS", 43, 4, 4, 1));
        listaReglas.add(new Regla(Arrays.asList("GO","OUT","PET"), "DO NOT ANSWER THIS", 44, 3, 3, 1));

        return listaReglas;
    }

}