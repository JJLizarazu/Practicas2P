package Ejercicio_7;

public class PromedioRecursividad {
    public static void main(String[] args) {
        int[] vector = {0, 100};
        System.out.println(" | EL PROMEDIO ES | " + recursiveAverage(vector.length, vector) + " | ");
    }

    public static float recursiveAverage(int n, int[] vector) {
        if(n <= 0){
            return 0;
        }
        return (vector[n - 1] + (recursiveAverage(n - 1, vector) * (n - 1))) / n;
    }

}
