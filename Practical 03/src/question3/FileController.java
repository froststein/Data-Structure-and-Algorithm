package question3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileController {
	private String fileName;

	public FileController(String fileName) {
		this.fileName = fileName;
	}

	public ArrayList<String> readLine(){
		ArrayList<String> result=new ArrayList<String>();
		try{
			FileReader fr = new FileReader (fileName);
			Scanner sc = new Scanner(fr);

			while (sc.hasNextLine()){
				result.add(sc.nextLine());
			}
			fr.close();
		}
		catch (FileNotFoundException exception){
			System.out.println ("The file " + fileName + " was not found.");
		}
		catch (IOException exception){
			System.out.println (exception);
		}

		return result;
	}
	public void writeLine(ArrayList<String> message){
		try {
			FileWriter fw=new FileWriter(this.fileName);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter outFile=new PrintWriter(bw);
			for(String s:message){
				outFile.println(s);
			}
			outFile.close();

		}
		catch (IOException exception){
			System.out.println (exception);
		}
	}
	public void writeObject(ArrayList<Student> StudentObject){
		try {
			FileWriter fw=new FileWriter(this.fileName);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter outFile=new PrintWriter(bw);
			ArrayList<String> message = new ArrayList<String>();
			for(int i=0;i<StudentObject.size();i++){
				message.add(Student.StudentObjectToString(StudentObject.get(i)));
			}
			for(String s:message){
				outFile.println(s);
			}
			outFile.close();

		}
		catch (IOException exception){
			System.out.println (exception);
		}
	}
}
