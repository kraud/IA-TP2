package SistemaDeProducciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import SistemaDeProducciones.criteria.Criteria;
import domain.Regla;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.solver.Solve;

public class MaquinaDeInferencia extends Solve{

    private List<Criteria> criteria;
    public List<Regla> listaDeReglas;
    //reglasUsadas contiene la lista de reglas utilizadas. Sirve para el criterio de no duplicidad
    public static List<Regla> reglasUsadas = new ArrayList<Regla>();
    //El problema en este agente es, mediante una lista de palabras claves ver que regla aplicar.
    //El problema contiene la lista de palabras claves percibidas desde el ambiente.
    public Problema problema;

    public MaquinaDeInferencia(List<Criteria> s, List<Regla> reglas){
        criteria = s;
        listaDeReglas = reglas;
    }

    @Override
    public void showSolution() {
    }

    @Override
    public Action solve(Object[] params) throws Exception {


        problema = (Problema) params[0]; //Aca tiene las palabras claves detectadas
        Regla r;
        String logDeFases = "";

        // TODO: Agregar en cada etapa un String detallando lo sucedido y añadirlo al log de la Action
        /////////////////////////////
        // PRIMERA FASE:    Cotejo //
        /////////////////////////////
        //Se obtienen las reglas activas, es decir las que se pueden aplicar.
        List<Regla> activeRules = match();

        if(activeRules.isEmpty()) {
            return null;
        }
        else{
            logDeFases = "Reglas activas: " + activeRules.toString();
        }

        /////////////////////////////////////////////
        // SEGUNDA FASE:    Solucion de conflictos //
        /////////////////////////////////////////////
        for(Criteria i : criteria){
            Criteria actualCriteria = i;
            System.out.println("Criterio: " + actualCriteria.toString());
            logDeFases = logDeFases + "\nCriterio:" + actualCriteria.toString();
            List<Regla> finalRules = actualCriteria.apply(activeRules);
            if(finalRules.size()==0){
                //System.out.print("Reglas en Conflicto: -");
                System.out.print("No hay reglas para aplicar");
            }
            else{
                System.out.print("\nReglas en Conflicto: ");
                logDeFases = logDeFases + "\nReglas en Conflicto: ";
                for(Regla j : finalRules){
                    System.out.print("("+j.getId()+")");
                    logDeFases = logDeFases + "("+j.getId()+")";
                }
                activeRules = finalRules;
                if(activeRules.size()==1){
                    break;
                }
            }
        }
        ////////////////////////////////
        // TERCERA FASE:    Ejecucion //
        ////////////////////////////////
        r = activeRules.get(0);
        this.ejecutar(r);
        logDeFases = logDeFases + "\nRegla a ejecutar: " + r.getId();
        return new ProductionSystemAction(r,logDeFases);
    }

    protected List<Regla> match(){
        //ACA SE DEBE HACER EL MACHEO ENTRE LA LISTA DE PALABRAS CLAVES CON TODAS LAS REGLAS PARA VER CUALES SE
        //PUEDEN EJECUTAR
        List<Regla> listaReglasAplicables = new ArrayList<Regla>();
        Set<String> palabrasPercibidas = problema.getPalabrasClaves();

        for(Regla r : listaDeReglas){
            //Por cada regla tengo que verificar que la secuencia de palabras sea la misma.
            //Si es la misma entonces hay que agregar la regla a la lista a devolver.
            List<String> condiciones = r.getCondiciones();
            if(palabrasPercibidas.containsAll(condiciones)){
                // if((condiciones.containsAll(palabrasPercibidas))&&(condiciones.size()==palabrasPercibidas.size())){
                listaReglasAplicables.add(r);
            }
        }
        return listaReglasAplicables;
    }

    protected void ejecutar(Regla r){
        reglasUsadas.add(r);

    }

}
