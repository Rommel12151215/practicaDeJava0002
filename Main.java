abstract class Animal {
 public abstract void hablar();
}

class Perro extends Animal {
 @Override
 public void hablar() {
  System.out.println("Guau!");
 }
}

class Gato extends Animal {
 @Override
 public void hablar() {
  System.out.println("Miau!");
 }
}

public class Main {
 public static void main(String[] args) {
 Animal miAnimal = new Perro();
 miAnimal.hablar(); // Llama al método de Perro

 miAnimal = new Gato();
 miAnimal.hablar(); // Llama al método de Gato

 System.out.println("El código funciona correctamente.");
 }
}
