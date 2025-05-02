package Ejercicio_3;

public class Main_3 {
    public static void main(String[] args) {
        ListaCircularSimplementeEnlazada lista = new ListaCircularSimplementeEnlazada();
        System.out.println(lista.isEmpty());

        System.out.println(lista.tamaño());

        for (int i = 1; i <= 12 ; i++) {
            lista.insertLast(i);
        }

        lista.print();
        System.out.println(lista.tamaño());

        lista.deleteLast();
        lista.deleteLast();

        lista.print();

        lista.printCircle(2);
    }
}
