package Ejercicio_5;

import Ejercicio_1.Nodo;

public class Pila extends Cola{
    @Override
    public void eliminar() {
        if(!estaVacia()){
            Nodo ulitmo = primero;
            Nodo penultimo = null;
            while(ulitmo.getSiguiente() != null){
                penultimo = ulitmo;
                ulitmo = ulitmo.getSiguiente();

            }

            penultimo.setSiguiente(null);
        }
    }
}
