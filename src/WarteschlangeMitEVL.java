public class WarteschlangeMitEVL<T> implements Warteschlange<T> {

    EVL<T> Speicher;

    public WarteschlangeMitEVL(){
        Speicher = new EVL<T>();
    }

    public T front() {
        return Speicher.first.data;
    }

    public Boolean isEmpty() {
        return Speicher.isEmpty();
    }

    public int size() {
        return Speicher.size();
    }

    public int capacity() {
        return Integer.MAX_VALUE;
    }

    public void push(T e) {
        Speicher.addFirst(e);
    }

    public T pop() {
        return Speicher.removeLast();
    }
}
