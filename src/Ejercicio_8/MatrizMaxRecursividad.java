package Ejercicio_8;

public class MatrizMaxRecursividad {
    public static void main(String[] args) {
        int[][][] matriz = {
                {
                        {1, 8},
                        {6, 0}
                },
                {
                        {4, 7},
                        {2, 9}
                }
        };

        System.out.println(maximoRecursividad(matriz, 0, 0, 0, matriz[0][0][0]));

    }

    public static int maximoRecursividad(int[][][] matriz, int row, int column, int z, int max) {
        if(row == matriz.length - 1 && column == matriz.length - 1 && z == matriz.length - 1) {
            if(matriz[row][column][z] > max) {
                max = matriz[row][column][z];
            }
            return max;
        }

        if(column == 2){
            return maximoRecursividad(matriz, row + 1, 0, 0, max);
        }

        if(z == 2){
            return maximoRecursividad(matriz, row, column + 1, 0, max);
        }

        if(matriz[row][column][z] > max) {
            max = matriz[row][column][z];
        }

        return maximoRecursividad(matriz, row, column, z + 1, max);

    }

}
