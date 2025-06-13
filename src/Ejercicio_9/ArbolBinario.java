package Ejercicio_9;

public class ArbolBinario {

    Nodo raiz;

    public static void main(String[] args) {
        ArbolBinario agesTree = new ArbolBinario();
        agesTree.insert(19);
        agesTree.insert(25);
        agesTree.insert(29);
        agesTree.insert(29);
        agesTree.insert(23);
        agesTree.insert(21);
        agesTree.insert(40);
        agesTree.insert(18);
        agesTree.insert(20);

        agesTree.print();
    }

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insert(int data) {
        this.raiz = recursiveInsert(this.raiz, data);
    }

    public static Nodo recursiveInsert(Nodo actual, int data) {
        if(actual == null){
            return new Nodo(data);
        }

        if(data < actual.data){
            actual.left = recursiveInsert(actual.left, data);
        } else if(data >= actual.data){
            actual.right = recursiveInsert(actual.right, data);
        }

        return actual;
    }

    public void print(){
        System.out.println("IMPRIMIR LAS EDADES EN ORDEN");
        printRecursive(this.raiz);
        System.out.println();
    }

    public static void printRecursive(Nodo actual){
        if(actual != null){
            printRecursive(actual.left);
            System.out.print(actual.data + " ");
            printRecursive(actual.right);
        }
    }

}

class Nodo {

    Nodo left, right;
    int data;


    public Nodo(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}