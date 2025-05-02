package Ejercicio_1;

public class ListaSimplementeEnlazada {
    static Nodo primero;

    public ListaSimplementeEnlazada() {
        primero = null;
    }

    public static boolean estaVacia() {
        return primero == null;
    }

    public static void insertar(Object dato) {
        if (estaVacia()) {
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }
    }

    public static void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();
        }
    }

    public static void mostrar() {
        Nodo tmp = primero;
        while (tmp != null) {
            System.out.print(tmp.getDato() + " | | ");
            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }

}
