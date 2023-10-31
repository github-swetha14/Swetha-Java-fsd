package newproject;

public class AccessModifiers {

		    // A public variable can be accessed from anywhere
		    public int publicVar = 10;

		    // A protected variable can be accessed within the same package or subclass
		    protected int protectedVar = 20;

		    // A default (package-private) variable can be accessed only within the same package
		    int defaultVar = 30;

		    // A private variable can be accessed only within the same class
		    private int privateVar = 40;

		    // A public method can be accessed from anywhere
		    public void publicMethod() {
		        System.out.println("This is a public method.");
		    }

		    // A protected method can be accessed within the same package or subclass
		    protected void protectedMethod() {
		        System.out.println("This is a protected method.");
		    }

		    // A default (package-private) method can be accessed only within the same package
		    void defaultMethod() {
		        System.out.println("This is a default (package-private) method.");
		    }

		    // A private method can be accessed only within the same class
		    private void privateMethod() {
		        System.out.println("This is a private method.");
		    }

		    public static void main(String[] args) {
		        AccessModifiers demo = new AccessModifiers();

		        // Accessing variables and methods from the same class
		        System.out.println(demo.publicVar);
		        System.out.println(demo.protectedVar);
		        System.out.println(demo.defaultVar);
		        System.out.println(demo.privateVar);

		        demo.publicMethod();
		        demo.protectedMethod();
		        demo.defaultMethod();
		        demo.privateMethod();
		    }
		}



