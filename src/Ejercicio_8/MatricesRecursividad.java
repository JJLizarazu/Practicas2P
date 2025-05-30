package Ejercicio_8;

public class MatricesRecursividad {
    public static void main(String[] args) {
        int[][][] matriz = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };

        int[][][] matriz2 = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };

        if(recursiveCompare(matriz, matriz2, 0, 0, 0)){
            System.out.println("Son iguales!");
        } else {
            System.out.println("No son iguales!");
        }

    }

    public static boolean recursiveCompare(int[][][] matriz, int[][][] matriz2, int row, int column, int z) {

        if(row == matriz.length - 1 && column == matriz.length - 1 && z == matriz.length - 1) {
            return true;
        }

        if(column == 2){
            return recursiveCompare(matriz, matriz2, row + 1, 0, 0);
        }

        if(z == 2){
            return recursiveCompare(matriz, matriz2, row, column + 1, 0);
        }

        if(matriz[row][column][z] != matriz2[row][column][z]) {
            return false;
        }

        return recursiveCompare(matriz, matriz2, row, column, z + 1);

    }


}
