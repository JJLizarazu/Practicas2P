package Ejercicio_4;

public class ListaCircularDoblementeEnlazada {
    Nodo begin;

    public ListaCircularDoblementeEnlazada(){
        begin = null;
    }

    public boolean isEmpty(){
        return begin == null;
    }

    public void insertLast(Object data){
        if(isEmpty()){
            Nodo nuevo = new Nodo();
            nuevo.setBefore(nuevo);
            nuevo.setData(data);
            nuevo.setNext(nuevo);
            begin = nuevo;
        } else {
            Nodo last = begin;
            while(last.getNext() != begin){
                last = last.getNext();
            }

            Nodo nuevo = new Nodo();
            nuevo.setBefore(last);
            nuevo.setData(data);
            nuevo.setNext(begin);

            last.setNext(nuevo);
            begin.setBefore(nuevo);
        }
    }

    public void deleteLast(){
        if(!isEmpty()){
            Nodo last = begin;
            while(last.getNext() != begin){
                last = last.getNext();
            }
            Nodo penultimate = last.getBefore();
            penultimate.setNext(begin);
            begin.setBefore(penultimate);
        }
    }

    public void show() {
        if(!isEmpty()){
            Nodo temp = begin;
            while(temp.getNext() != begin){
                System.out.print(temp.getData() + "  ");
                temp = temp.getNext();
            }
            System.out.println(temp.getData());
        }
    }

    public void showForward(int lap){
        if(!isEmpty()){
            Nodo temp = begin;
            int counter = 0;
            while(counter < lap){

                if(temp.getNext() == begin){
                    counter++;
                }

                System.out.print(temp.getData() + "  ");
                temp = temp.getNext();
            }
            System.out.println();
        }
    }

    public void showBackward(int lap){
        if(!isEmpty()){
            Nodo temp = begin.getBefore();
            int counter = 0;
            while(counter < lap){

                if(temp.getBefore() == begin){
                    counter++;
                }

                System.out.print(temp.getData() + "  ");
                temp = temp.getBefore();
            }
            System.out.print(temp.getData());
        }
    }

}
