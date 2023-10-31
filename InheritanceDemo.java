package newproject;
	  
		// Base class (Parent class)
		class Animal {
		    void eat() {
		        System.out.println("Animal is eating.");
		    }
		}

		// Single inheritance: Dog is a subclass of Animal
		class Dog extends Animal {
		    void bark() {
		        System.out.println("Dog is barking.");
		    }
		}

		// Multiple inheritance using interfaces
		interface Carnivore {
		    void hunt();
		}

		interface Herbivore {
		    void graze();
		}

		// Hierarchical inheritance: Cow and Lion are subclasses of Animal
		class Cow extends Animal implements Herbivore {
		    @Override
		    void eat() {
		        System.out.println("Cow is grazing.");
		    }

		    public void graze() {
		        System.out.println("Cow is a herbivore.");
		    }
		}

		class Lion extends Animal implements Carnivore {
		    @Override
		    void eat() {
		        System.out.println("Lion is hunting.");
		    }

		    public void hunt() {
		        System.out.println("Lion is a carnivore.");
		    }
		}

		public class InheritanceDemo {

		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        dog.eat();  // Inherited from Animal class
		        dog.bark();

		        Cow cow = new Cow();
		        cow.eat();  // Overridden method in Cow class
		        cow.graze();

		        Lion lion = new Lion();
		        lion.eat();  // Overridden method in Lion class
		        lion.hunt();
		    }
		}	
	
	
