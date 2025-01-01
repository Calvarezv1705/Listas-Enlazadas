public class Main {
    public static void main(String[] args) {

        // creamos los nodos como objetos y despues los enlazamos
        Nodo primerNodo = new Nodo(1);
        Nodo segundoNodo = new Nodo(1);
        Nodo tercerNodo = new Nodo(2);
        Nodo cuartoNodo = new Nodo(2);
        Nodo quintoNodo = new Nodo(2);

        // se le asigna el puntero a cada nodo para volverlos una lista enlazada
        primerNodo.siguiente = segundoNodo;
        segundoNodo.siguiente = tercerNodo;
        tercerNodo.siguiente = cuartoNodo;
        cuartoNodo.siguiente = quintoNodo;

        // se crea un objeto llamado lista enlazada para poder asignarle cual nodo va a
        // ser la cabeza y ademas para usar los metodos de esta clase
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.cabeza = primerNodo;

        System.out.println("lista enlazada con elementos duplicados");
        listaEnlazada.mostrarLIstaEnlazada();

        System.out.println(" ");
        System.out.println("---------------------------------");

        listaEnlazada.eliminarDuplicados();

        System.out.println("lista enlazada con los elementos duplicados eliminados");
        listaEnlazada.mostrarLIstaEnlazada();

    }
}