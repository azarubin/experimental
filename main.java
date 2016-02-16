public class Main
 {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, Olga and Alexey");
	System.out.println("One more line here");
	int a = 4;
	int b = 5;
	System.out.println("3 * 3 = " + mult(3, 3));
	System.out.println("Sum of " + a + " and " + a + " equals " + sum(a, a) + ".");
	System.out.println("Sum of " + b + " and " + b + " equals " + sum(b, b) + ".");
	System.out.println("Sum of " + x + " and " + x + " equals " + sum(x, x) + ".");
	System.out.println("4 * 4 = " + mult(4, 4));
    }

    public static int sum(int a, int b) {
    	return a + b;
    }

    public static int mult(int a, int b) {
	return a * b;
    }
}
