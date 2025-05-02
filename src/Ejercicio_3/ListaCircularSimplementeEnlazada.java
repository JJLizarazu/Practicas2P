package Ejercicio_3;

public class ListaCircularSimplementeEnlazada {
    private static Nodo head;

    public ListaCircularSimplementeEnlazada() {
        head = null;
    }

    public static boolean isEmpty() {
        return head == null;
    }

    public static int tamaño(){
        int count = 0;
        if(!isEmpty()){
            Nodo last = head;
            while(last.getNext() != head){
                last = last.getNext();
                count++;
            }
            count++;
        }
        return count;
    }

    public static void insertLast(Object data) {
        if(isEmpty()){
            Nodo nuevo = new Nodo();
            nuevo.setData(data);
            nuevo.setNext(nuevo);
            head = nuevo;
        } else {
            Nodo nuevo = new Nodo();
            nuevo.setData(data);
            nuevo.setNext(head);

            Nodo last = head;
            while(last.getNext() != head){
                last = last.getNext();
            }
            last.setNext(nuevo);
        }
    }

    public static void deleteLast() {
        if(!isEmpty()){
            Nodo penultimo = head;
            while(penultimo.getNext().getNext() != head){
                penultimo = penultimo.getNext();
            }
            penultimo.setNext(head);
        }
    }

    public static void print() {
        if(!isEmpty()){
            Nodo last = head;
            while(last.getNext() != head){
                System.out.print(last.getData() + " | ");
                last = last.getNext();
            }
            System.out.print(last.getData() + " | ");
            System.out.println();
        }
    }
    public static void printCircle(int vueltas) {
        if(!isEmpty()){
            int count = 0;
            Nodo tmp = head;
            while(tmp != null && count < (tamaño() * vueltas)){
                System.out.print(tmp.getData() + " | ");
                tmp = tmp.getNext();
                count++;
            }
            System.out.println();
        }
    }

}
