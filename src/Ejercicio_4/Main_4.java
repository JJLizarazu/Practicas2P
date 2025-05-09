package Ejercicio_4;

public class Main_4 {
    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada lista = new ListaCircularDoblementeEnlazada();
        System.out.println(lista.isEmpty());
        for (int i = 1; i <= 5; i++) {
            lista.insertLast(i);
        }

        lista.show();

        lista.deleteLast();
        lista.show();

        lista.showForward(4);
        lista.showBackward(4);
    }
}
