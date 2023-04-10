package Task9;

import java.util.*;
import java.util.concurrent.Callable;

public class MyArray<E> {

   private int COPASITY = 2;

   Object[] objects = new Object[COPASITY];

   private int currentSize = 0;


   void add(E element) {

      if (objects.length >= COPASITY) {
         COPASITY *= 2;
         System.arraycopy(objects,currentSize,objects,currentSize,objects.length+1);
         //objects = Arrays.copyOf(objects, currentSize + 2);
      }


      objects[currentSize] = element;


      currentSize++;


   }

   @Override
   public String toString() {
      return Arrays.toString(objects);
   }


   void remove(E elm) {
 Arrays.copyOf(objects,objects.length-1);
   }
}
class ArrayTest {
   public static void main(String[] args) {

      MyArray<String> words = new MyArray<>();
      words.add("hello");
      words.add("from");
      words.add("Java");
      words.add("and");
      words.add("hello");
      words.add("from");
      words.add("hello");
      words.add("from");
      words.add("Java");
      words.add("and");
      words.add("hello");
      words.add("from");

      System.out.println(words.toString());

   }
}

