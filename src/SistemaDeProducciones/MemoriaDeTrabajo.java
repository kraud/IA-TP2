package SistemaDeProducciones;

        import java.util.HashSet;
        import java.util.Set;
        import java.util.StringTokenizer;

public class MemoriaDeTrabajo {
    private static final String conTildes = "ÁáÉéÍíÓóÚúÑñÜü";
    private static final String sinTildes = "AaEeIiOoUuNnUu";
    private static final String puntuacion = ",.;:¿?¡!()'$%&";

    public static Set<String> convertir(String oracion){
        Set<String> listaClaves = new HashSet<String>();
        String siguiente;
        System.out.println(oracion);
        oracion = normalizar(oracion);
        System.out.println(oracion);
        StringTokenizer tokens = new StringTokenizer(oracion);
        while(tokens.hasMoreTokens()){
            siguiente = tokens.nextToken();

            if(siguiente.equals("FAMILY") || siguiente.equals("MOTHER") || siguiente.equals("MOM")|| siguiente.equals("MOMMY")|| siguiente.equals("FATHER")|| siguiente.equals("DAD")|| siguiente.equals("DADDY")|| siguiente.equals("BROTHER")|| siguiente.equals("SISTER")|| siguiente.equals("PARENTS")|| siguiente.equals("DADS")|| siguiente.equals("MOMS")|| siguiente.equals("BROTHERS")|| siguiente.equals("SISTERS")){
                listaClaves.add("FAMILY");
            }

            else if(siguiente.equals("PET")|| siguiente.equals("DOG")|| siguiente.equals("CAT")|| siguiente.equals("PUPPY")){
                listaClaves.add("PET");
            }
            else if(siguiente.equals("HOUSE")|| siguiente.equals("HOME")|| siguiente.equals("SCHOOL")|| siguiente.equals("JOB")|| siguiente.equals("NEIGHBORHOOD")|| siguiente.equals("STREET")|| siguiente.equals("TOWN")|| siguiente.equals("CITY")|| siguiente.equals("ADDRESS")|| siguiente.equals("LIVE")|| siguiente.equals("APARTMENT")){
                listaClaves.add("PLACE");
            }
            else if(siguiente.equals("WHAT")|| siguiente.equals("WHATS")|| siguiente.equals("WHERE")|| siguiente.equals("WHERES")|| siguiente.equals("HOW")|| siguiente.equals("WHEN")|| siguiente.equals("WHICH")|| siguiente.equals("WHOSE")|| siguiente.equals("WHOM")|| siguiente.equals("WHY")){
                listaClaves.add("WHAT");
            }
            else if(siguiente.equals("YOU")|| siguiente.equals("YOUR")|| siguiente.equals("HIS")|| siguiente.equals("HER")|| siguiente.equals("THEY")|| siguiente.equals("THEM")|| siguiente.equals("SHE")|| siguiente.equals("HE")|| siguiente.equals("OUR")|| siguiente.equals("THOSE")|| siguiente.equals("IT")){
                listaClaves.add("SOMEONE");
            }
            else if(siguiente.equals("NAME")||siguiente.equals("LASTNAME")||siguiente.equals("NICKNAME")){
                listaClaves.add("NAME");
            }
            else if(siguiente.equals("OLD")){
                listaClaves.add("OLD");
            }
            else if(siguiente.equals("BORN")||siguiente.equals("FROM")){
                listaClaves.add("BORN");
            }
            else if(siguiente.equals("TEACHER")){
                listaClaves.add("TEACHER");
            }
            else if(siguiente.equals("BANK")||siguiente.equals("MONEY")||siguiente.equals("CASH")||siguiente.equals("CREDITCARD")||siguiente.equals("CARD")||siguiente.equals("DEBITCARD")||siguiente.equals("MONEY")||siguiente.equals("BILL")||siguiente.equals("DOLLAR")||siguiente.equals("GOLD")||siguiente.equals("EXPENSIVE")){
                listaClaves.add("MONEY");
            }
            else if(siguiente.equals("JEWELLERY")||siguiente.equals("NECKLACE")||siguiente.equals("RING")){
                listaClaves.add("JEWELLERY");
            }
            else if(siguiente.equals("HOBBY")||siguiente.equals("ACTIVITY")||siguiente.equals("DOING")){
                listaClaves.add("ACTIVITY");
            }
            else if(siguiente.equals("WEAR")||siguiente.equals("CLOTHES")||siguiente.equals("WEARING")){
                listaClaves.add("WEAR");
            }
            else if(siguiente.equals("TAKE")){
                listaClaves.add("TAKE");
            }
            else if(siguiente.equals("PICTURE")||siguiente.equals("PHOTO")||siguiente.equals("SELFIE")){
                listaClaves.add("PHOTO");
            }
            else if(siguiente.equals("SEX")||siguiente.equals("PORN")||siguiente.equals("TRIPLEX")||siguiente.equals("XXX")){
                listaClaves.add("XXX");
            }
            else if(siguiente.equals("GO")||siguiente.equals("WENT")||siguiente.equals("GONE")||siguiente.equals("GOING")) {
                listaClaves.add("GO");
            }
            else if(siguiente.equals("OUT")||siguiente.equals("OFF")) {
                listaClaves.add("OUT");
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
