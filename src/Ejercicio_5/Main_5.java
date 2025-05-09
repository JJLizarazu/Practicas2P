package Ejercicio_5;

public class Main_5 {
    public static void main(String[] args) {
        Cola cola = new Cola();
        System.out.println(cola.estaVacia());

        for (int i = 1; i <= 5 ; i++) {
            cola.insertar(i);
        }

        cola.mostrar();

        cola.eliminar();
        cola.eliminar();
        cola.eliminar();

        cola.mostrar();


        // FILAS

        Pila pila = new Pila();
        System.out.println(pila.estaVacia());
        for (int i = 1; i <= 5 ; i++) {
            pila.insertar(i);
        }

        pila.mostrar();
        pila.eliminar();
        pila.eliminar();
        pila.eliminar();
        pila.mostrar();

    }
}
