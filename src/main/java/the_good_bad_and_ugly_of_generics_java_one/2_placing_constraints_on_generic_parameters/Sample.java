package the_good_bad_and_ugly_of_generics_java_one

import java.util.*;

public class Sample {
  public static <T extends Comparable<T>> void copy(List<T> source, List<T> destination) {
    if(source.get(0).compareTo(destination.get(0)) != 0) {
      //..
    }
  }
  
  public static void main(String[] args) {
    System.out.println("ok");
  }
}
