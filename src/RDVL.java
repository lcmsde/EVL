public class RDVL<T> {

    Listenelement entry = null;
    int size = 0;

    class Listenelement {
        T data;
        Listenelement next = null;
        Listenelement prev = null;

        Listenelement(T data) {
            this.data = data;
        }
    }


    public boolean isEmpty() {
        return entry == null;
    }

    public int size() {
        return this.size;
    }

    public void add(T e) {
        if (isEmpty()) {
            Listenelement element = new Listenelement(e);
            element.next = element;
            element.prev = element;
            entry = element;
        } else {
            Listenelement element = new Listenelement(e);
            element.next = entry;
            element.prev = entry.prev;
            entry = element;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Listenelement temp = entry;
        entry.prev.next = entry.next;
        entry = entry.next;
        size--;
        return temp.data;
    }

    public T element() {
        return entry.data;
    }

    public void next(int s) {
        for (int i = 0; i < s; i++) {
            Listenelement temp = entry;
            entry.next = temp.next.next;
            entry.prev = temp.next;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void next2(int s) {
        T temp = this.remove();
        for (int i = 1; i < (s % this.size); i++) {
            entry = entry.next;
        }
        this.add(temp);
    }

    public void prev(int s) {
        for (int i = 0; i < s; i++) {
            Listenelement temp = entry; //trivial
            entry.next = temp.prev.next;
            entry.prev = temp.prev.prev;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void prev2(int s) {
        T temp = this.remove();
        for (int i = 1; i < (s % this.size); i++) {
            entry = entry.prev;
        }
        this.add(temp);
    }
}
