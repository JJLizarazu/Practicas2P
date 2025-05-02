package Ejercicio_2;

public class ListaDoblementeEnlazada {
    static Nodo inicio;

    public ListaDoblementeEnlazada() {
        inicio = null;
    }

    public static boolean isEmpty() {
        return inicio == null;
    }

    public static void insertarDato(Object dato) {
        if (isEmpty()) {
            Nodo nuevo = new Nodo(null, null, dato);
            inicio = nuevo;
        } else {
            Nodo nuevo = new Nodo(null,inicio, dato);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public static void eliminarDato() {
        if (!isEmpty()) {
            if(inicio.getSiguiente() == null){
                inicio = inicio.getSiguiente();
            } else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);

            }
        }
    }

    public static void mostrarAdelante(){
        if(!isEmpty()){
            Nodo tmp = inicio;
            while(tmp != null){
                System.out.print(tmp.getDato() + "  |  ");
                tmp = tmp.getSiguiente();
            }
            System.out.println();
        }
    }

    public static void mostrarAtras(){
        if(!isEmpty()){
            Nodo ultimo = inicio;
            while(ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();

            }

            Nodo tmp = ultimo;
            while(tmp != null){
                System.out.print(tmp.getDato() + "  |  ");
                tmp = tmp.getAnterior();
            }
            System.out.println();
        }
    }

}
