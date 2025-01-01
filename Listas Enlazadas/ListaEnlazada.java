public class ListaEnlazada {

    // este es el punto de inicio de la lista enlazada
    Nodo cabeza;

    // este constructor crea una listaEnlazada vacia
    public ListaEnlazada() {
        cabeza = null;
    }

    public void mostrarLIstaEnlazada() {
        // se crea un nodo auxiliar y se le asigna cabeza
        Nodo aux = cabeza;

        // el ciclo while lo que
        // hace es que mientras este nodo no sea null se va a imprimir el dato de ese
        // nodo y despues se le vuelve a asignar a aux el valor del nodo siguiente para
        // que siga evaluando los datos de los otros nodos hasta que encuentre el nodo =
        // null y ahi para por que llego al final
        while (aux != null) {
            System.out.print(aux.dato + " ");
            aux = aux.siguiente;
        }
    }

    public void eliminarDuplicados() {
        // se crea un nodo auxiliar y se le asigna cabeza
        Nodo aux = cabeza;

        // este while lo que hace es que mira que aux no sea null y que el nodo
        // siguiente a aux tampoco sea null lo que asegura que el ciclo se ejecutara
        // mientras haya dos nodos consecutivos
        // despues en el if si aux.dato es igual al dato del nodo siguiente a aux el
        // valor de este se saltara y se le asignara el del siguiente del sigueinte
        // y si no son iguales se avanza al siguiente nodo de la lista siguiendo el
        // ciclo
        while (aux != null && aux.siguiente != null) {
            if (aux.dato == aux.siguiente.dato) {
                aux.siguiente = aux.siguiente.siguiente;
            } else {
                aux = aux.siguiente;
            }
        }
    }

}
