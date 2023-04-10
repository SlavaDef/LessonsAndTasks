package Task9;

public class MyHashMap<K,V> {

    private int size;

void put(K key,V value){

    Node<K,V> newNode = new Node<>(key, value);

}

int size(){
    return size;
}


    private static class Node<K,V>{

        private K key;
        private V value;

        private Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node<K, V> getNext() {
            return next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

}
