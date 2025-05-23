package Ejercicio_7;

public class PotenciaRecurisividad {
    public static void main(String[] args) {
        int base = 2, pow = 3;
        System.out.println(" | LA POTENCIA DE | " + base + " | ELEVADO A | " + pow + " | ES | ");
        System.out.println(" | " + recursivePow(base, pow) + " | ");
    }

    public static int recursivePow(int base, int pow) {
        if(pow <  1){
            return 1;
        }
        return base * recursivePow(base, pow - 1);
    }

}
