package the_good_bad_and_ugly_of_generics_java_one;

import java.util.*;

public class Sample {
  public static void main(String[] args) {
//    ArrayList numbers = new ArrayList();
//    
//    numbers.add(1);
//    numbers.add(2);
//    numbers.add(3);
//    numbers.add(1.0);
//    
//    int total = 0;
//    for(Object number : numbers) {
//      total += (Integer)(number);      
//    }
//    
//    System.out.println(total);

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    //numbers.add(1.0); // error
    
    int total = 0;
    for(int number : numbers) {
      total += number;
    }
    
    System.out.println(total);
  }
}
