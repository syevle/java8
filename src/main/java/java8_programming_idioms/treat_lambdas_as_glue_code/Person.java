package java8_programming_idioms.treat_lambdas_as_glue_code;

public class Person {
  private final String name;
  private final Gender gender;
  private final int age;
  
  public Person(String theName, Gender theGender, int theAge) {
    name = theName;
    gender = theGender;
    age = theAge;
  }
  
  public String getName() { 
    return name; 
  }
  public int getAge() { 
    return age; 
  }
  public Gender getGender() { return gender; }
  
  public String toString() {
    return String.format("%s -- %s -- %d", name, gender, age);
  }  
}