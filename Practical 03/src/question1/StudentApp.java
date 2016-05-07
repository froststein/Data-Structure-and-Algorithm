package question1;

import java.util.ArrayList;

public class StudentApp {
	public static void main(String[] args) {

		ArrayList<String> recs=new ArrayList<String>();
		ArrayList<String> recsReturn;

		recs.add("031121A;Mary Tan;19/01/1981;100;100;90");
		recs.add("033111H;John Tan;21/09/1961;100;100;100");
		recs.add("031113A;Kelly Tan;11/10/1981;80;100;90");
		
		FileController f1 = new FileController("testing.txt");
	
		f1.writeLine(recs);
		
		recsReturn=f1.readLine();
		for(String s:recsReturn){
			System.out.println(s);
		}
	}
}
