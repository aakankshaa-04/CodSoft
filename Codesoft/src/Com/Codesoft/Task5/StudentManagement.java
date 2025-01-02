package Com.Codesoft.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

	public static void addStudent(List<Student> pStud, Scanner sc) {
		System.out.println("Enter RollNo:");
		int rollNo=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String studName=sc.nextLine();
		System.out.println("Enter Age:");
		int studAge=sc.nextInt();
		System.out.println("Enter Marks:");
		double studMarks=sc.nextDouble();
		pStud.add(new Student(rollNo, studName, studAge, studMarks));
		System.out.println("Student Added Successfully!!!!!!!!!");
	}

	public static void displayStudent(List<Student> pStud) {
		if(pStud.isEmpty()) {
			System.out.println("Empty List!!!!!!!");
		}else {
			System.out.println("**********Information Of Student's********");
			for(Student studObj:pStud) {
				studObj.display();
			}
		}
	}

	public static int searchStudent(List<Student> pStud, Scanner sc, int subChoice) {
	    if (subChoice == 1) {
	        System.out.println("Enter RollNo:");
	        int rollNo = sc.nextInt();
	        for (Student studObj : pStud) {
	            if (studObj.getStudRollNo() == rollNo) {
	                studObj.display();
	                return rollNo;
	            }
	        }
	    } else if (subChoice == 2) {
	        sc.nextLine();
	        System.out.println("Enter Name:");
	        String studName = sc.nextLine();
	        for (Student studObj : pStud) {
	            if (studObj.getStudName().equals(studName)) {
	                studObj.display();
	                return 1;
	            }
	        }
	    } else {
	        System.out.println("Invalid Choice!!!!!!!!");
	        return 0;
	    }
	    return 0;
	}


	public static int updateStudent(List<Student> pStud, Scanner sc) {
	    if(pStud.isEmpty()) {
	        System.out.println("Empty List!!!!!!!!!!");
	        return 0;
	    } else {
	        int x = searchStudent(pStud, sc, 1);
	        if(x == 0) {
	            System.out.println("Student Not Present! No Update Performed.!!!!!");
	            return 0;
	        } else {
	            System.out.println("Which Data You Want To Update:\n1.Name\n2.Age\n3.Marks");
	            System.out.println("Enter Choice:");
	            int subChoice = sc.nextInt();
	            sc.nextLine();  
	            for (Student stud : pStud) {
	                if (stud.getStudRollNo() == x) {  
	                    switch (subChoice) {
	                        case 1:
	                            System.out.println("Enter New Name:");
	                            stud.setStudName(sc.nextLine());
	                            break;
	                        case 2:
	                            System.out.println("Enter New Age:");
	                            stud.setStudAge(sc.nextInt());
	                            break;
	                        case 3:
	                            System.out.println("Enter New Marks:");
	                            stud.setStudMarks(sc.nextDouble());
	                            break;
	                        default:
	                            System.out.println("Invalid Choice!!!!!!!");
	                            return 0;
	                    }
	                    return 1;
	                }
	            }
	        }
	    }
	    return 0;
	}

	public static int removeStudent(List<Student> pStud, Scanner sc) {
		if(pStud.isEmpty()) {
			System.out.println("Empty List!!!!!!!!!");
			return 0;
		}else {
			int x=searchStudent(pStud, sc, 1);
			if(x==0) {
				System.out.println("Student Not Present!No Remove Performed!!!!!!!!!!!!");
				return 0;
			}else {
				for(int i=0;i<pStud.size();i++) {
					if(pStud.get(i).getStudRollNo()==x) {
						pStud.remove(i);
						return 1;
					}
				}
			}
		}
		return 0;
	}

	public static void sortStudent(List<Student> pStud, Scanner sc) {
		if(pStud.isEmpty()) {
			System.out.println("Empty List!!!!!!!!");
		}else {
		System.out.println("1.Sort By RollNo\n2.Sort By Age\n3.Sort By Marks");
		System.out.println("Enter Choice:");
		int subChoice=sc.nextInt();
		List<Student> newList=new ArrayList<Student>(pStud);
		if(subChoice==1) {
			newList.sort((student1,student2) ->Integer.compare(student1.getStudRollNo(),student2.getStudRollNo()));
		}else if(subChoice==2) {
			newList.sort((student1,student2) ->Integer.compare(student1.getStudAge(),student2.getStudAge()));
		}else if(subChoice==3) {
			newList.sort((student1,student2) ->Double.compare(student1.getStudMarks(),student2.getStudMarks()));
		}else {
			System.out.println("Invalid Choice!!!!!!!");
		}
		displayStudent(newList);
		System.out.println("Sorted Successfully!!!!!!!!!!!!!!");
		}
	}
	
}
