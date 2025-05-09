package Ejercicio_4;

public class Nodo {
    private Nodo next;
    private Nodo before;
    private Object data;

    public Nodo(){

    }


    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getBefore() {
        return before;
    }

    public void setBefore(Nodo before) {
        this.before = before;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
