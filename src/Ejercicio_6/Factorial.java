package Ejercicio_6;

public class Factorial {

    public static int factorial(int n){
        int fact = 0;
        if(n == 1){
            fact = 1;
        } else {
            fact = n * factorial(n-1);
        }
        return fact;
    }

}
