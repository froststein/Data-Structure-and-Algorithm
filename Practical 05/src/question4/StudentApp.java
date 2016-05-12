package question4;

import java.util.ArrayList;
import java.util.Collections;

public class StudentApp {
	public static void main(String[] args) {
		FileController fc = new FileController("testing.txt");
		ArrayList<String> studstrls = fc.readLines();
		System.out.println("====== Before Sorting ======");
		ArrayList<Student> stuarr = new ArrayList<Student>();
		for (String studstr : studstrls) {
			Student stud = new Student(studstr);
			stuarr.add(stud);
			System.out.println(stud);
		}
		System.out.println("====== After Sorting ======");
		Collections.sort(stuarr);
		for (Student stud :stuarr) {
			System.out.println(stud);
		}

		
	}
}
