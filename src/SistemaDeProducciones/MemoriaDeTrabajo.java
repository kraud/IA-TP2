package SistemaDeProducciones;

        import java.util.HashSet;
        import java.util.Set;
        import java.util.StringTokenizer;

public class MemoriaDeTrabajo {
    private static final String conTildes = "��������������";
    private static final String sinTildes = "AaEeIiOoUuNnUu";
    private static final String puntuacion = ",.;:�?�!()'$%&";

    public static Set<String> convertir(String oracion){
        Set<String> listaClaves = new HashSet<String>();
        String siguiente;
        System.out.println(oracion);
        oracion = normalizar(oracion);
        System.out.println(oracion);
        StringTokenizer tokens = new StringTokenizer(oracion);
        while(tokens.hasMoreTokens()){
            siguiente = tokens.nextToken();

            if(siguiente.equals("ENCONTRAR") || siguiente.equals("ENCUENTRO") || siguiente.equals("ENCUENTRA")){
                listaClaves.add("ENCONTRAR");
            }

            else if(siguiente.equals("DONDE")){
                listaClaves.add("DONDE");
            }
            else if(siguiente.equals("BIEN")|| siguiente.equals("JOYA")|| siguiente.equals("PERFECTO")){
                listaClaves.add("BIEN");
            }
            else if(siguiente.equals("MAL")){
                listaClaves.add("MAL");
            }
            else if(siguiente.equals("COMO")){
                listaClaves.add("COMO");
            }
            else if(siguiente.equals("ESTA")||siguiente.equals("ESTAS")||siguiente.equals("VA")||siguiente.equals("ANDAS")){
                listaClaves.add("ESTAR");
            }
            else if(siguiente.equals("CURSA")||siguiente.equals("CURSO")||siguiente.equals("CURSAR")){
                listaClaves.add("CURSAR");
            }
            else if(siguiente.equals("LLEGAR")|| siguiente.equals("LLEGO")){
                listaClaves.add("LLEGAR");
            }
            else if(siguiente.equals("RENDIR")|| siguiente.equals("RINDE")|| siguiente.equals("RINDO")){
                listaClaves.add("RENDIR");
            }
            else if(siguiente.equals("HAY")){
                listaClaves.add("HABER");
            }
            else if(siguiente.equals("OFICINA")){
                listaClaves.add("OFICINA");
            }
            else if(siguiente.equals("FACULTAD")||siguiente.equals("UNIVERSIDAD")){
                listaClaves.add("FACULTAD");
            }
            else if(siguiente.equals("HOLA")|| siguiente.equals("BUENOS")|| siguiente.equals("DIAS")|| siguiente.equals("BUENAS")|| siguiente.equals("TARDES")|| siguiente.equals("NOCHES")|| siguiente.equals("BUEN")|| siguiente.equals("DIA")){
                listaClaves.add("HOLA");
            }
            else if(siguiente.equals("CHAU")|| siguiente.equals("ADIOS")|| siguiente.equals("VEMOS")|| siguiente.equals("HASTA")|| siguiente.equals("LUEGO")){
                listaClaves.add("CHAU");
            }
            else if(siguiente.equals("INTELIGENCIA") || siguiente.equals("ARTIFICIAL")){
                listaClaves.add("IA");
            }
            else if(siguiente.equals("TEORIA") || siguiente.equals("CONTROL")){
                listaClaves.add("TC");
            }
            else if(siguiente.equals("INGENIERIA") || siguiente.equals("SOFTWARE")){
                listaClaves.add("ISW");
            }
            else if(siguiente.equals("FISICA")){
                listaClaves.add("FISICA");
            }
            else if(siguiente.equals("ANALISIS") || siguiente.equals("MATEMATICO")){
                listaClaves.add("AMII");
            }
            else if(siguiente.equals("GESTION")){
                listaClaves.add("SG");
            }
            else if(siguiente.equals("QUIMICA")){
                listaClaves.add("QUIMICA");
            }
            else if(siguiente.equals("METODOS") || siguiente.equals("AGILES")){
                listaClaves.add("MA");
            }
            else if(siguiente.equals("MATEMATICA") || siguiente.equals("SUPERIOR")){
                listaClaves.add("MS");
            }
            else if(siguiente.equals("GUTIERREZ")){
                listaClaves.add("MILGUT");
            }
            else if(siguiente.equals("VEGA")){
                listaClaves.add("JORGEVEGA");
            }
            else if(siguiente.equals("ROA")){
                listaClaves.add("JORGEROA");
            }
            else if(siguiente.equals("VILLAREAL")){
                listaClaves.add("PABLOVILLAREAL");
            }
            else if(siguiente.equals("LEDESMA")){
                listaClaves.add("RODRIGOLEDESMA");
            }
            else if(siguiente.equals("ROMANIZ")){
                listaClaves.add("SUSANAROMANIZ");
            }
            else if(siguiente.equals("CASTELLARO")){
                listaClaves.add("MARTACASTELLARO");
            }
            else if(siguiente.equals("MALVA") || siguiente.equals("TOSO")){
                listaClaves.add("MALVA");
            }
            else if(siguiente.equals("CALIUSCO")){
                listaClaves.add("LAURACALIUSCO");
            }
            else if(siguiente.equals("BALLEJOS")){
                listaClaves.add("LUCIANABALLEJOS");
            }
            else if(siguiente.equals("CIDISI")){
                listaClaves.add("CIDISI");
            }
            else if(siguiente.equals("AULA")){
                listaClaves.add("AULA18");
            }
            else if(siguiente.equals("POSGRADO")){
                listaClaves.add("POSGRADO");
            }
            else if(siguiente.equals("DEPARTAMENTO")){
                listaClaves.add("DPTOSISTEMAS");
            }
            else if(siguiente.equals("BANCO")){
                listaClaves.add("BANCO");
            }
            else if(siguiente.equals("ASCENSOR")){
                listaClaves.add("ASCENSOR");
            }

        }
        System.out.println(listaClaves);
        return listaClaves;
    }

    public static String normalizar(String oracion){
        char[] temporal = oracion.toCharArray();
        for (int i = 0; i < temporal.length; i++) {
            int pos = conTildes.indexOf(temporal[i]);
            if (pos > -1) {
                temporal[i] = sinTildes.charAt(pos);
            }
            pos = puntuacion.indexOf(temporal[i]);
            if(pos > -1){
                for(int j = i; j < temporal.length-1; j++){
                    temporal[j] = temporal[j+1];
                }
                temporal[temporal.length-1] = ' ';
            }
        }
        return new String(temporal);
    }
}
