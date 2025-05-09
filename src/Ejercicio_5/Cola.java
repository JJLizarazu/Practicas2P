package Ejercicio_5;

import Ejercicio_1.ListaSimplementeEnlazada;
import Ejercicio_1.Nodo;

public class Cola extends ListaSimplementeEnlazada {

    @Override
    public void insertar(Object dato) {
        if(estaVacia()){
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else {
            Nodo ultimo = primero;
            while(ultimo.getSiguiente() != null){
                ultimo = ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }
}
