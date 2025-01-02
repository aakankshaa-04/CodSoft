package Com.Codesoft.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> pStud=new ArrayList<Student>();
		int choice=0;
		while(choice!=7) {
			System.out.println("\t\t1.Add Student\n\t\t2.Display Student\n\t\t3.Search Student\n\t\t4.Update Student\n\t\t5.Remove Student\n\t\t6.Sort Student\n\t\t7.Exit");
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			{
				StudentManagement.addStudent(pStud,sc);
			}
			break;
			case 2:
			{
				StudentManagement.displayStudent(pStud);
			}
			break;
			case 3:
			{
				System.out.println("1.Search By RollNo\n2.Search By Name");
				System.out.println("Enter Choice:");
				int subChoice=sc.nextInt();
				if(StudentManagement.searchStudent(pStud,sc,subChoice)==1) {
					System.out.println("Student Found Successfully!!!!!!!!!!!");
				}else {
					System.out.println("Student Not Found!!!!!!!!!!!!!");
				}
			}
			break;
			case 4:
			{
				if(StudentManagement.updateStudent(pStud,sc)==1) {
					System.out.println("Student Updated Successfully!!!!!!!!!!");
				}else {
					System.out.println("Student Not Updated!!!!!!!!!!!!");
				}
			}
			break;
			case 5:
			{
				if(StudentManagement.removeStudent(pStud,sc)==1) {
					System.out.println("Student Removed Successfully!!!!!!!!!!");
				}else {
					System.out.println("Student Not Removed!!!!!!!!!!!");
				}
			}
			break;
			case 6:
			{
				StudentManagement.sortStudent(pStud,sc);
			}
			break;
			case 7:
			{
				System.out.println("Thank You!!!!!!!!!!!!!!!");
			}
			break;
			default:
			{
				System.out.println("Invalid Choice!Please Try Again");
			}
			break;
			}
		}
	}

}
