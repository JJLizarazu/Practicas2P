package Ejercicio_8;

public class VectoresRecursividad {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vector2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        if(recursiveCompare(vector1, vector2, 0)){
            System.out.println("Son iguales !");
        } else {
            System.out.println("No son iguales !");
        }

    }

    public static boolean recursiveCompare(int[] vector1, int[] vector2, int n) {
        if(n == vector1.length && n == vector2.length) {
            return true;
        }

        if (n >= vector1.length || n >= vector2.length) {
            return false;
        }

        if(vector1[n] != vector2[n]) {
            return false;
        }

        return recursiveCompare(vector1, vector2, n + 1);

    }

}
