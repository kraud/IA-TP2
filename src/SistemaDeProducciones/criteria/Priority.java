package SistemaDeProducciones.criteria;

import java.util.ArrayList;
import java.util.List;

import domain.Regla;

public class Priority extends Criteria {

    @Override
    public List<Regla> apply(List<Regla> list) {

        int priority, mayor = 0;
        for(Regla r : list){
            priority = r.getPriority();
            if(priority > mayor){
                mayor = priority;
            }
        }
        List<Regla> ret = new ArrayList<Regla>();
        for(Regla i : list){
            if(i.getPriority() == mayor){
                ret.add(i);
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Priority";
    }

}

