package SistemaDeProducciones.criteria;

import domain.Regla;

import java.util.List;

/**
 * Clase que engloba el comportamiento de los criterios del sistema de produccion.
 * @author Grupo 12: Blas,Mar�a Julia / Diaz Ferreyra,Nicolas/ Sarli, Juan Leonardo.
 */
public abstract class Criteria {

    public abstract List<Regla> apply(List<Regla> list);
    public abstract String toString();

}
