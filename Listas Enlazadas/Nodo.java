public class Nodo {

    // atributos del nodo
    int dato;
    Nodo siguiente;

    // constructor el cual va a inicializar el nodo para agregarle un valor
    public Nodo(int dato) {
        this.dato = dato;

        // se pone el siguiente = null para cuando se creen los nodos se sepa que el
        // ultimo nodo que se cree es el final
        this.siguiente = null;
    }

}
