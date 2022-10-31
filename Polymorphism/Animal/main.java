package Animal;

//   Remember from the Inheritance chapter that we use the extends keyword to inherit from a class.
  
//   Now we can create Pig and Dog objects and call the animalSound() method on both of them:
  
//   Example
  
  
  
  
  class Main {
    public static void main(String[] args) {
      Animal myAnimal = new Animal();  // Create a Animal object
      Animal myPig = new Pig();  // Create a Pig object
      Animal myDog = new Dog();  // Create a Dog object
      myAnimal.animalSound();
      myPig.animalSound();
      myDog.animalSound();
    }
  }
    

