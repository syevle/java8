package the_good_bad_and_ugly_of_generics_java_one;

import java.util.*;

class Fruit {}
class Banana extends Fruit {}
class Orange extends Fruit {}

public class Sample {
  public static void receiveFruit(Fruit fruit) {
    System.out.println("received " + fruit);
  }
  
  public static void receiveFruitBasket(List<Fruit> fruits) {
    System.out.println("Received " + fruits);
    fruits.add(new Orange());
  }
  
  public static void main(String[] args) {
    Banana banana = new Banana();
    Orange orange = new Orange();
    
    receiveFruit(banana);
    receiveFruit(orange);
    
    List<Fruit> fruits = new ArrayList<>();
    fruits.add(banana);
    
    receiveFruitBasket(fruits);
    
    List<Banana> bananas = new ArrayList<>();
    bananas.add(banana);
    //receiveFruitBasket(bananas); //Compiler won't allow this, it protects
      //us from accidentally putting an orange or something else into a basket
      //of bananas.
  }
}
