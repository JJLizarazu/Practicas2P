package Ejercicio_1;

public class Main_1 {
    public static void main(String[] args) {
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();

        // MOSTRAR LISTA VACÍA

        System.out.println(ListaSimplementeEnlazada.estaVacia());

        // INSERTAR O ELIMINAR DATOS DE LA LISTA

        ListaSimplementeEnlazada.insertar(5);
        ListaSimplementeEnlazada.insertar(4);
        ListaSimplementeEnlazada.insertar(3);
        ListaSimplementeEnlazada.insertar(2);
        ListaSimplementeEnlazada.insertar(1);
        ListaSimplementeEnlazada.insertar(0);

        // MOSTRAMOS NUESTRA LISTA

        ListaSimplementeEnlazada.mostrar();

        // ELIMINAR ALGUNOS ELEMENTOS

        ListaSimplementeEnlazada.eliminar();
        ListaSimplementeEnlazada.eliminar();

        // MOSTRAR NUEVAMENTE LA LISTA

        ListaSimplementeEnlazada.mostrar();

    }
}
