package Ejercicio_1;

public class Main_1 {
    public static void main(String[] args) {
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();

        // MOSTRAR LISTA VACÍA

        System.out.println(lista.estaVacia());

        // INSERTAR O ELIMINAR DATOS DE LA LISTA

        lista.insertar(5);
        lista.insertar(4);
        lista.insertar(3);
        lista.insertar(2);
        lista.insertar(1);
        lista.insertar(0);

        // MOSTRAMOS NUESTRA LISTA

        lista.mostrar();

        // ELIMINAR ALGUNOS ELEMENTOS

        lista.eliminar();
        lista.eliminar();

        // MOSTRAR NUEVAMENTE LA LISTA

        lista.mostrar();

    }
}
