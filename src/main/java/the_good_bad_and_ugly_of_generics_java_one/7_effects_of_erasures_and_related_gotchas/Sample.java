package the_good_bad_and_ugly_of_generics_java_one;

import java.util.*;

class MyClass<T> {
  private static int count; // Not different for each parametric type
  
  public MyClass() { count++; }
  
  public static int getCount() { return count; }
}

public class Sample {    
  @SuppressWarnings("unchecked") //legacy code
  public static void foo(List duh) {
    duh.add(1.0);
  }
  
  public static <T> void use(T instance) {
    
    //List<int> list = new ArrayList<>(); /
    //parametric type can't be primitive.
    
    //new T(); // not allowed, can't instantiate the type
  }

  public static <T> T getMatching(T matcher) {
    //assume not found.
    return null;
  }
  
  interface Event<T> {}
  
  //class MyClass implements Event<String>, Event<Integer> {} // not allowed
  
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    
    //list.add(1.0); // not allowed, 
      //but the following is not stopped by the compiler
    
    try {
      foo(list);
      int value = list.get(0); //Runtime ClassCastException      
    } catch(Exception ex) {
      System.out.println(ex);
    }
    
    try {
      int result = getMatching(1); //Runtime NullPointerException
    } catch(Exception ex) {
      System.out.println(ex);
    }    
    
    MyClass<Integer> list1 = new MyClass<>();
    MyClass<Integer> list2 = new MyClass<>();
    MyClass<Double> list3 = new MyClass<>();
    
    System.out.println(list3.getCount());
      //we don't want to call static methods on instances, though.
      
    System.out.println(MyClass.getCount()); 
    //Notice the class name here does not include any parametric type
  }
}
