package newproject;

public class TestThrow2 {

	public static void main(String[] args) {
		 try {
	            divide(10, 0); // Calling the divide method that throws an ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("An ArithmeticException occurred: " + e.getMessage());
	        }
	    }

	    public static void divide(int dividend, int divisor) throws ArithmeticException {
	        if (divisor == 0) {
	            throw new ArithmeticException("Division by zero is not allowed.");
	        }
	        int result = dividend / divisor;
	        System.out.println("Result: " + result);
	    }


	}


