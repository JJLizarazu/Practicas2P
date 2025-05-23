package Ejercicio_7;

public class CadenaRecursividad {
    public static void main(String[] args) {
        String cadena = "FABRICIO";
        String invertString = recursiveString(cadena);
        System.out.println(" | CADENA ORIGINAL | ");
        System.out.println(" | " + cadena + " | ");
        System.out.println(" -------------------");
        System.out.println(" | CADENA INVERTIDA | ");
        System.out.println(" | " + invertString + " | ");
    }

    public static String recursiveString(String cadena){
        if(cadena.isEmpty()){
            return cadena;
        }
        return cadena.charAt(cadena.length() - 1) + recursiveString(cadena.substring(0, cadena.length() - 1));
    }

    // H O L A
    // 0 1 2 3
    // A + H O L
    // A L + H O
    // A L O + H
    // A L O H

}
