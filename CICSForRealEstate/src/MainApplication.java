
public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		HyperVisor programController = new HyperVisor();
		programController.Director();
		PracticeCode practiceCode = new PracticeCode();
		practiceCode.Test();

	}

}

class HyperVisor {
	// gets called first
	// issues all the method calls to make the application
	public void Director() {
		System.out.println("Hello again");
		// Import our Data File
		
	}
}

class FileHandling {
	// responsible for reading/writing into files
	
	public void importDataFile() {
		
	}
}

class PracticeCode{
	int a = -999; // special marker value
	
	public void Test() {
		// lets handle some exception without crashing the program
		try {
			int a = 1/0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(a);
		
	}
}