package SistemaDeProducciones.criteria;

import java.util.ArrayList;
import java.util.List;

import domain.Regla;

public class Novelty extends Criteria{

    @Override
    public List<Regla> apply(List<Regla> list) {

        int novelty, mayor = 0;
        for(Regla r : list){
            novelty = r.getNovelty();
            if(novelty > mayor){
                mayor = novelty;
            }
        }
        List<Regla> ret = new ArrayList<Regla>();
        for(Regla i : list){
            if(i.getNovelty()==mayor){
                ret.add(i);
            }
        }
        return ret; //Se retornan las reglas con mayor novedad

    }

    @Override
    public String toString() {
        return "Novelty";
    }

}
