package designing_with_lambda_expressions_javaone.method_composition;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Ben", "Brad", "Bill", "Kara", "Sara", "Jil", "Brenda");
    
    //Create a collection of people whose name start with B or K and have 3 or 4 letters
    
    List<String> result = new ArrayList<>();
    for(String name : names) {
      if((name.startsWith("B") || name.startsWith("K")) && (name.length() == 3 || name.length() == 4))
        result.add(name);
    }
    
    System.out.println(result);
    
    System.out.println(
      names.stream()
           .filter(name -> name.startsWith("B") || name.startsWith("K"))
           .filter(name -> name.length() == 3 || name.length() == 4)
           .collect(toList()));
  }
}

