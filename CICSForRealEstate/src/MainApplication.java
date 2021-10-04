import java.io.*;


public class MainApplication {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		HyperVisor programController = new HyperVisor();
		programController.Director();
//		PracticeCode practiceCode = new PracticeCode();
//		practiceCode.Test();

	}

}

class HyperVisor {
	// gets called first
	// issues all the method calls to make the application
	public void Director() {
		FileHandler fileHandler = new FileHandler();
		fileHandler.importDataFile();
		// Import our Data File
		
	}
}



class FileHandler {
	// responsible for reading/writing into files
	String fileName = "C:\\Users\\longe\\Desktop\\2nd_Semester\\Java\\JavaProgrammingWorkspace\\CICSForRealEstate\\Files\\real_state.csv";
	
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