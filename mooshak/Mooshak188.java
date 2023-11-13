public class Mooshak188 {
    public static void main(String[] args) {

        // Criacao de lista de inteiros
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();  
        
        // Adicionando numeros de 1 a 5 ao final da lista
        for (int i=1; i<=5; i++)
            list.addLast(i);
        System.out.println(list);
  
        System.out.println(list.get(6));
    }
}


class Node<T> {
    private T value;      // Valor guardado no no
    private Node<T> next; // Referencia para o proximo no da lista

    // Construtor
    Node(T v, Node<T> n) {
        value = v;
        next = n;
    }

    // Getters e Setters
    public T getValue() { return value; }
    public Node<T> getNext()  { return next; }
    public void setValue(T v) { value=v; }
    public void setNext(Node<T> n) { next = n; }
}

class SinglyLinkedList<T> {
    private Node<T> first;    // Primeiro no da lista
    private int size;         // Tamanho da lista

    // Construtor (cria lista vazia)
    SinglyLinkedList() {
        first = null;
        size = 0;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Devolve true se a lista estiver vazia ou falso caso contrario
    public boolean isEmpty() {
        return (size == 0);
    }
    
    // Adiciona v ao inicio da lista
    public void addFirst(T v) {
        Node<T> newNode = new Node<T>(v, first); 
        first = newNode;
        size++;
    }

    // Adiciona v ao final da lista
    public void addLast(T v) {
        Node<T> newNode = new Node<T>(v, null); 
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<T> cur = first;
            while (cur.getNext() != null)
                cur = cur.getNext();
            cur.setNext(newNode);         
        }
        size++;
    }

    // Retorna o primeiro valor da lista (ou null se a lista for vazia)
    public T getFirst() {
        if (isEmpty()) return null;
        return first.getValue();
    }

    // Retorna o ultimo valor da lista (ou null se a lista for vazia)
    public T getLast() {
        if (isEmpty()) return null;
        Node<T> cur = first;
        while (cur.getNext() != null)
            cur = cur.getNext();
        return cur.getValue();      
    }

    // Remove o primeiro elemento da lista (se for vazia nao faz nada)
    public void removeFirst() {
        if (isEmpty()) return;
        first = first.getNext();
        size--;
    }

    // Remove o ultimo elemento da lista (se for vazia nao faz nada)
    public void removeLast() {
        if (isEmpty()) return;
        if (size == 1) {
            first = null;
        } else {
            // Ciclo com for e uso de de size para mostrar alternativa ao while
            Node<T> cur = first;
            for (int i=0; i<size-2; i++)
                cur = cur.getNext();
            cur.setNext(cur.getNext().getNext());
        }
        size--;
    }
    
    // Converte a lista para uma String
    public String toString() {
        String str = "{";      
        Node<T> cur = first;
        while (cur != null) {
            str += cur.getValue();
            cur = cur.getNext();
            if (cur != null) str += ",";                     
        }      
        str += "}";
        return str;
    }

    public T get(int pos){
        if(pos >= this.size){
            return null;
        }

        if(pos < 0){
            return null;
        }

        Node<T> cur = first;
        for(int i=0; i<pos; i++){
            cur = cur.getNext();
        }
        return cur.getValue();
    }

    public T remove(int pos) {
        if (pos >= this.size || pos < 0 || isEmpty()) {
            return null;
        }

        Node<T> removedItem;

        if (pos == 0) {
            removedItem = first;
            first = first.getNext();
        } else {
            Node<T> cur = first;
            for (int i = 0; i < pos - 1; i++) {
                cur = cur.getNext();
            }

            removedItem = cur.getNext();
            cur.setNext(removedItem.getNext());
        }

        size--;
        return removedItem.getValue();
    }

}