package the_good_bad_and_ugly_of_generics_java_one

import java.util.*;

//Given
//class MyList {
//  public void add(Object instance) {}
//  public void addAll(MyList list) {}
//}

//It's not a simple change Object to T.

class MyList<T> {
  public void add(T instance) {}
  public void addAll(MyList<T> list) {}
  //public void addAll(MyList<? extends T> list) {}
}

class Fruit {}
class Orange extends Fruit {}

public class Sample {    
  public static void main(String[] args) {
    MyList<Fruit> list1 = new MyList<>();
    
    MyList<Fruit> list2 = new MyList<>();

    list2.add(new Orange());
    list2.addAll(list1);
  
    //The following will not compile with a mere Object to T conversion.
    MyList<Orange> oranges = new MyList<>();
    list2.addAll(oranges);
    System.out.println("ok");
    
    //To make the above work, we need to change 
    //addAll to take MyList<? extends T>. See the commented code above.
  }
}
