package SistemaDeProducciones.criteria;

import java.util.ArrayList;
import java.util.List;

import domain.Regla;

/**
 * Clase que implementa el criterio aleatorio.
 * @author Grupo 12: Blas,Mar�a Julia / Diaz Ferreyra,Nicolas/ Sarli, Juan Leonardo.
 */
public class Random extends Criteria {

    @Override
    public List<Regla> apply(List<Regla> list) {

        java.util.Random r = new java.util.Random(System.currentTimeMillis());
        int valor = r.nextInt(list.size());
        List<Regla> ret = new ArrayList<Regla>();
        ret.add(list.get(valor));
        return ret;
    }

    @Override
    public String toString() {
        return "Random";
    }

}
