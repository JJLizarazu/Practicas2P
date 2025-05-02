package Ejercicio_2;

public class Nodo {
    private Nodo anterior;
    private Nodo siguiente;
    private Object dato;

    public Nodo(Nodo anterior, Nodo siguiente, Object dato) {
        this.setAnterior(anterior);
        this.setSiguiente(siguiente);
        this.setDato(dato);
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
}
