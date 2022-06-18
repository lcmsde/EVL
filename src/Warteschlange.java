public interface Warteschlange<T> {

     T front();

     Boolean isEmpty();

     int size();

     int capacity();

     void push(T e);

     T pop();

     







}
