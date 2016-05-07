package question3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileController {
	private String fileName;

	public FileController(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String readLine(){
		try{
	         FileReader fr = new FileReader (fileName);
	         Scanner sc = new Scanner(fr);

			 //read in the file line by line
	         while (sc.hasNextLine()){
	            return sc.nextLine();
	         }

	         fr.close();
	      }
	      catch (FileNotFoundException exception){
	         System.out.println ("The file " + fileName + " was not found.");
	      }
	      catch (IOException exception){
	         System.out.println (exception);
	      }

		return null;
	}
	public void writeLine(String message){
		try{
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);
			outFile.println(message);
			
			outFile.close();
			System.out.println("File created: " + fileName);
		}
		catch (IOException exception){
			System.out.println (exception);
		}
	}
	public static void main(String[] args) {
		FileController f1 = new FileController("testing.txt");
		f1.writeLine("Hello");
		System.out.println(f1.readLine());
	}
}
