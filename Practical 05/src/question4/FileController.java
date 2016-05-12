package question4;

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
	
	
	
	public String readLine() {
        FileReader fr;
        Scanner sc;
        String str = null;
		try {
			fr = new FileReader(fileName);
	        sc = new Scanner(fr);
	        str = new String();
	        if (sc.hasNextLine()){
	        	str = sc.nextLine();
	        }
	        fr.close();
	        sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);
		return str;
	}
	
	public ArrayList<String> readLines() {
        FileReader fr;
        Scanner sc;
        ArrayList<String> str = new ArrayList<String>();
		try {
			fr = new FileReader(fileName);
	        sc = new Scanner(fr);
	        while (sc.hasNextLine()){
	        	str.add(sc.nextLine());
	        }
	        fr.close();
	        sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
	
	public void writeLine(String str) {
      try{
  		FileWriter fw = new FileWriter(fileName);
  		BufferedWriter bw = new BufferedWriter(fw);
  		PrintWriter outFile = new PrintWriter(bw);
  		outFile.println(str);	  		
  		outFile.close();
  		System.out.println("File created: " + fileName);
        }
        catch (IOException exception){
           System.out.println (exception);
        }
	}
	
	public void writeLine(ArrayList<String> str) {
	      try{
	    		FileWriter fw = new FileWriter(fileName);
	    		BufferedWriter bw = new BufferedWriter(fw);
	    		PrintWriter outFile = new PrintWriter(bw);
	    		for(String eachstr : str)
	    			outFile.println(eachstr);	  		
	    		outFile.close();
	    		System.out.println("File created: " + fileName);
	          }
	          catch (IOException exception){
	             System.out.println (exception);
	          }
	}
	
	public static void main(String[] args) {
		FileController fc = new FileController("output.txt");
		fc.readLine();
	}
	
	
	
}
