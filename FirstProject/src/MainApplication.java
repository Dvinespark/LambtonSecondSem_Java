
public class MainApplication {
	// This class is not the part of algorithm designer
	// This class is just a container for static void main method
	// This function is the entry point
	static String[] cars = {"Ford", "Tesla", "BMW"};
	public static void main(String[] args) {
		
		System.out.println("Hello world!");
		System.out.println(args[0]);
		System.out.println(args[1]);
		for (int counter=0; counter <3; counter++) {
			System.out.println(cars[counter]);
		}
	}
}
