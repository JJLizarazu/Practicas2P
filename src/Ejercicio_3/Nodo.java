package Ejercicio_3;

public class Nodo {
    private Object data;
    private Nodo next;

    public Nodo() {
    }


    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
