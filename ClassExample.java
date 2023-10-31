package newproject;

public class ClassExample {

	    private String name;
	    private int age;

	    // Constructor
	    public ClassExample(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // toString() method
	    @Override
	    public String toString() {
	        return "ClassExample{" +
	                "name='" + name + '\'' +
	                ", age=" + age +
	                '}';
	    }

	    public static void main(String[] args) {
	        // Create a new object of the ClassExample class
	        ClassExample person1 = new ClassExample("Alice", 25);

	        // Call the getters and setters to access and modify the object's properties
	        System.out.println(person1.getName()); // Prints "Alice"
	        person1.setAge(30);

	        // Print the object's toString() representation
	        System.out.println(person1); // Prints "ClassExample{name='Alice', age=30}"
	    }
	
		
  }


