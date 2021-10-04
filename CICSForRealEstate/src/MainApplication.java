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
	String fileName = "C:\\Users\\longe\\Desktop\\2nd_Semester\\Java\\JavaProgrammingWorkspace\\CICSForRealEstate\\Files\\redata.csv";
	String line = null;
	
	

	
	public void importDataFile() {
		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
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

class RealEstateDataRecord {
	String HouseType;
	String Description;
	String Community;
	double ListPrice;
	double SoldPrice;
	String StreetName;
	String StNumber;
	int NoOfBedroom;
	int BedPlus;
	float NumberOfBaths;
	double Front;
	int ParkingDriveSpaces;
	double Depth;
	String GarageType;
	String Pool;
	String RemarksForBrokers;
	String RemarksForClients;
	String ExtraDetails;
	String BasementDescription1;
	String BasementDescription2;

}