import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EVLTest {
    EVL<String> strListe = new EVL();
    EVL<Integer> intListe = new EVL();




    @Test
    void isEmpty() {
        assertTrue(intListe.isEmpty());
        intListe.addFirst(2);
        assertFalse(intListe.isEmpty());
    }

    @Test
    void addFirst() {
        assertTrue(strListe.isEmpty());
        strListe.addFirst("b");
        assertFalse(strListe.isEmpty());
        strListe.addFirst("a");
        assertEquals(strListe.first.data,"a");
        assertEquals(strListe.first.next.data,"b");
    }

    @Test
    void removeLast() {
        intListe.addFirst(2);
        intListe.addFirst(25);
        intListe.addFirst(42);
        assertEquals(intListe.removeLast(), 2);
        assertEquals(intListe.removeLast(), 25);
        assertEquals(intListe.removeLast(), 42);
        assertTrue(intListe.isEmpty());
    }

    @Test
    void getFirst() {
        intListe.addFirst(2);
        assertEquals(intListe.getFirst(),2);
        intListe.addFirst(25);
        assertEquals(intListe.getFirst(),25);
        intListe.addFirst(42);
        assertEquals(intListe.getFirst(),42);
    }

    @Test
    void getLast() {
        intListe.addFirst(2);
        assertEquals(intListe.getLast(),2);
        intListe.addFirst(25);
        assertEquals(intListe.getLast(),2);
        intListe.addLast(42);
        assertEquals(intListe.getLast(),42);
    }

    @Test
    void addLast() {
        intListe.addLast(2);
        assertEquals(intListe.getLast(),2);
        intListe.addLast(25);
        assertEquals(intListe.getLast(),25);
        intListe.addLast(42);
        assertEquals(intListe.getLast(),42);
    }

    @Test
    void contains() {
        intListe.addFirst(2);
        intListe.addFirst(25);
        intListe.addFirst(42);
        assertTrue(intListe.contains(2));
        assertTrue(intListe.contains(25));
        assertTrue(intListe.contains(42));
        assertFalse(intListe.contains(100));
    }

    @Test
    void size() {
        assertEquals(intListe.size(), 0);
        intListe.addFirst(2);
        assertEquals(intListe.size(), 1);
        intListe.addFirst(25);
        assertEquals(intListe.size(), 2);
        intListe.addFirst(42);
        assertEquals(intListe.size(), 3);
    }
}