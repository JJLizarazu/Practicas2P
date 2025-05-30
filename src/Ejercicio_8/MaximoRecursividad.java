package Ejercicio_8;

public class MaximoRecursividad {
    public static void main(String[] args) {
        int[] vector = {0, 0, 1, 8, 0, 9};

        System.out.println(maximoRecursividad(vector, 0, vector[0]));

    }

    public static int maximoRecursividad(int[] vector, int n, int max) {

        if (n == vector.length) {
            return max;
        }

        if(vector[n] > max){
            max = vector[n];
        }

        return maximoRecursividad(vector, n + 1, max);

    }

}
