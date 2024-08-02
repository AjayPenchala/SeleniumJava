package Arrays;

public class VoidTest {

	public void printMessage() {
        System.out.println("Hello, this is a void method!");
    }

	public static void main(String[] args) {
    	VoidTest example = new VoidTest();
        example.printMessage(); // Calls the void method.
    }
}
