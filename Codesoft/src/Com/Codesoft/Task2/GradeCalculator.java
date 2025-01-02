package Com.Codesoft.Task2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("************* Grade Calculator *************");
            System.out.println("1. Enter marks and calculate grade");
            System.out.println("2. Exit");
            System.out.print("Enter your choice (1 or 2): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number of subjects:");
                    int sub = sc.nextInt();
          
                    if (sub <= 0) {
                        System.out.println("Number of subjects must be greater than 0.");
                        break;
                    }
                    
                    double totalMarksObtained = 0;
                    String grade;
                    
                    for (int i = 0; i < sub; i++) {
                       
                        double marks;
                        do {
                            System.out.print("Enter marks for subject " + (i + 1) + " (between 1 and 100): ");
                            marks = sc.nextDouble();
                            if (marks < 1 || marks > 100) {
                                System.out.println("Marks must be between 1 and 100. Please try again.");
                            }
                        } while (marks < 1 || marks > 100);
                        
                        totalMarksObtained += marks;
                    }
                    
                    double totalMarks = sub * 100;
                    double perc = (totalMarksObtained / totalMarks) * 100;

              
                    if (perc >= 90) {
                        grade = "A+";
                    } else if (perc >= 80) {
                        grade = "A";
                    } else if (perc >= 70) {
                        grade = "B";
                    } else if (perc >= 60) {
                        grade = "C";
                    } else if (perc >= 50) {
                        grade = "D";
                    } else {
                        grade = "E";
                    }

                  
                    System.out.println("*************Result************");
                    System.out.println("Total Obtained Marks: " + totalMarksObtained);
                    System.out.println("Out of Marks: " + totalMarks);
                    System.out.printf("Average Percentage: %.2f%%\n", perc);
                    System.out.println("Grade: " + grade);
                    break;
                    
                case 2:
                  
                    System.out.println("Thank you...");
                    break;

                default:
               
                    System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 2);
    }
}
