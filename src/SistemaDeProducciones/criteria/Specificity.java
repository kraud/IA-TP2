package SistemaDeProducciones.criteria;

import java.util.ArrayList;
import java.util.List;

import domain.Regla;

public class Specificity extends Criteria {

    @Override
    public List<Regla> apply(List<Regla> list) {

        int specifity, mayor = 0;
        for(Regla r : list){
            specifity = r.getSpecificity();
            if(specifity > mayor){
                mayor = specifity;
            }
        }
        List<Regla> ret = new ArrayList<Regla>();
        for(Regla i : list){
            if(i.getSpecificity() == mayor){
                ret.add(i);
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Specificity";
    }
}
