package the_good_bad_and_ugly_of_generics_java_one

import java.util.*;

class MyList<T> {
  public void add(T instance) {
    System.out.println("added...");
  }
}

public class Sample {
  public static void main(String[] args) {
    MyList<Integer> list = new MyList<>();
    
    list.add(1);
  }
}
