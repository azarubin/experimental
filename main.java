public class Main
 {
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, Olga and Alexey");
	System.out.println("One more line here");
	int z = 1;
	int x = 2;
	int y = 3;
	int a = 4;
	System.out.println("Sum of " + z + " and " + x + " equals " + sum(z, x) + ".");
	System.out.println("2 * 2 = " + mult(2, 2));
	System.out.println("Sum of " + y + " and " + y + " equals " + sum(y, y) + ".");
	System.out.println("Sum of " + a + " and " + a + " equals " + sum(a, a) + ".");
    }
    
    public static int sum(int a, int b) {
    	return a + b;
    }

    public static int mult(int a, int b) {
	return a * b;
    }
}
