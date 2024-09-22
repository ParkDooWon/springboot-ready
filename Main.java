import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Dog();
    Animal cat = new Cat();
    List<Animal> list = Arrays.asList(dog, cat);

    for (Animal animal : list) {
      if (animal instanceof Dog) {
        Dog dd = (Dog)animal;
        System.err.println(dd.dogNum);
        dd.say();
      }
      else if (animal instanceof Cat) {
        Cat cc = (Cat)animal;
        System.err.println(cc.catNum);
        cc.say();
      }
      else {
        System.err.println("ELSE : ");
        animal.say();
      }
    }

    Animal animal = new Animal();
    Dog dog2 = (Dog) animal;  // compile error : Exception in thread "main" java.lang.ClassCastException
  }
}
