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

        listaReglas.add(new Regla(Arrays.asList("HOLA", "COMO", "ESTAR"), "HOLA, �COMO VA?", 1, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("HOLA", "COMO", "ESTAR"), "HOLA", 2, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("COMO", "ESTAR"), "TODO BIEN, �VOS?", 48, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("COMO", "ESTAR"), "ACA ANDAMOS, TRABAJANDO COMO SE DEBE :)", 49, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("BIEN"), "ME ALEGRO ENTONCES!)", 50, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("MAL"), "UUH, PONELE ONDA!", 51, 1, 1, 1));


        listaReglas.add(new Regla(Arrays.asList("HOLA"), "HOLA, �COMO VA?", 1, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("HOLA"), "HOLA", 46, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("CHAU"), "CHAU", 47, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("CHAU"), "HASTA LUEGO", 4, 1, 1, 1));

        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "IA"), "INTELIGENCIA ARTIFICIAL SE RINDE EN EL AULA 01", 5, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "IA"), "INTELIGENCIA ARTIFICIAL SE RINDE EN EL AULA MM5", 6, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "IA"), "INTELIGENCIA ARTIFICIAL SE RINDE EN EL AULA E03", 7, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "AMII"), "AN�LISIS MATEM�TICO II SE RINDE EN EL AULA 20", 8, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "AMII"), "AN�LISIS MATEM�TICO II SE RINDE EN EL AULA 21", 9, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "AMII"), "AN�LISIS MATEM�TICO II SE RINDE EN EL AULA 22", 10, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "TC"), "TEOR�A DE CONTROL SE RINDE EN EL AULA 11", 11, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "TC"), "TEOR�A DE CONTROL SE RINDE EN EL AULA MM5", 12, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "ISW"), "INGENIER�A DE SOFTWARE SE RINDE EN EL AULA 01", 13, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "ISW"), "INGENIER�A DE SOFTWARE SE RINDE EN EL AULA 10", 14, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "FISICA"), "F�SICA SE RINDE EN EL AULA 18", 15, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "RENDIR", "FISICA"), "F�SICA SE RINDE EN EL AULA 20", 16, 1, 1, 1));

        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "IA"), "HOY ES EN EL LABORATORIO 4", 17, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "SG"), "SI NO ES EN LA MULTIMEDIOS 5, PEGA EN EL PALO JAJA", 18, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "SG"), "EN EL LABORATORIO 4", 19, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "QUIMICA"), "EN EL LABORATORIO DE QU�MICA, �D�NDE SINO?", 20, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "MS"), "�EN EL AULA 20!", 21, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "MA"), "CREO QUE ES EN EL AULA E03 PORQUE HAY PR�CTICA", 22, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "CURSAR", "MA"), "LA TEOR�A ES EN EL AULA 16", 23, 1, 1, 1));

        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "MILGUT"), "A MILAGROS LA POD�S ENCONTRAR EN EL CIDISI", 24, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "MILGUT"), "ESTA DANDO CLASES DE INTELIGENCIA ARTIFICIAL", 25, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "JORGEROA"), "EN EL CIDISI SEGURO EST�", 26, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "LAURACALIUSCO"), "A ESTA HORA LA ENCONTR�S EN RELACIONES INTERNACIONALES", 27, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("CIDISI", "ENCONTRAR", "LUCIANABALLEJOS"), "SI, LLEG� HACE UN RATITO", 28, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("CIDISI", "ENCONTRAR", "LUCIANABALLEJOS"), "NO, SE FUE RECI�N", 29, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("CIDISI", "ENCONTRAR", "LUCIANABALLEJOS"), "NO, EST� EN EL AULA 10 DANDO CLASES", 30, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("OFICINA", "ENCONTRAR", "MARTACASTELLARO"), "CREO QUE SI", 31, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("OFICINA", "ENCONTRAR", "MARTACASTELLARO"), "ESTABA EN UNA REUNI�N CON HORACIO LEONE", 32, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "MALVA"), "ES DIF�CIL SABERLO, SE JUBIL�", 33, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "PABLOVILLAREAL"), "LA VERDAD, NO SE SI SE ENCUENTRA EN LA FACULTAD", 34, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DONDE", "ENCONTRAR", "PABLOVILLAREAL"), "CREO QUE EST� EN EL AULA MULTIMEDIOS 5", 35, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("POSGRADO", "ENCONTRAR", "JORGEVEGA"), "SI, ENTR� Y NUNCA SALI�, AS� QUE S�", 36, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DPTOSISTEMAS", "ESTAR", "RODRIGOLEDESMA"), "EN VINCULACI�N TECNOL�GICA, CON RA�L", 37, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("DPTOSISTEMAS", "ESTAR", "RODRIGOLEDESMA"), "NO, NO EST�", 38, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("FACULTAD", "ESTAR", "SUSANAROMANIZ"), "SI, EST� EN SU OFICINA", 39, 1, 1, 1));

        listaReglas.add(new Regla(Arrays.asList("COMO", "LLEGAR", "CIDISI"), "VAMOS QUE TE LLEVO", 40, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("COMO", "LLEGAR", "POSGRADO"), "VAMOS QUE TE LLEVO", 41, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("COMO", "LLEGAR", "AULA18"), "VAMOS QUE TE LLEVO", 42, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("COMO", "LLEGAR", "BANCO"), "VAMOS QUE TE LLEVO", 43, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("COMO", "LLEGAR", "DPTOSISTEMAS"), "VAMOS QUE TE LLEVO", 52, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("HABER", "ASCENSOR"), "SI SI", 44, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("HABER", "ASCENSOR"), "SI, PERO EST� ROTO", 45, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("HABER", "ASCENSOR","FACULTAD"), "SI SI", 53, 1, 1, 1));
        listaReglas.add(new Regla(Arrays.asList("HABER", "ASCENSOR","FACULTAD"), "SI, PERO EST� ROTO", 54, 1, 1, 1));





        return listaReglas;
    }

}