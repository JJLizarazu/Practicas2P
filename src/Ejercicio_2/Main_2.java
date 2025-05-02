package Ejercicio_2;

public class Main_2 {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        System.out.println(lista.isEmpty());

        for(int i = 20 ; i > 0 ; i--){
            lista.insertarDato(i);
        }

        System.out.println(lista.isEmpty());

        lista.mostrarAdelante();
        lista.mostrarAtras();

        lista.eliminarDato();
        lista.eliminarDato();

        lista.mostrarAdelante();
        lista.mostrarAtras();

    }
}
