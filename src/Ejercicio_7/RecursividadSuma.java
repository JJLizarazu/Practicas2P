package Ejercicio_7;

public class RecursividadSuma {
    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6 ,7, 8, 9};

        System.out.println(" | LA SUMA DEL VECTOR ES: " + recursiveSum(vector.length, vector) + " | ");

    }

    public static int recursiveSum(int n, int[] vector) {
        if(n <= 0){
            return 0;
        }
        return recursiveSum(n - 1, vector) + vector[n - 1];
    }

}
