package Com.Codesoft.Task5;

public class Student {
	int studRollNo;
	String studName;
	int studAge;
	double studMarks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studRollNo, String studName, int studAge, double studMarks) {
		super();
		this.studRollNo = studRollNo;
		this.studName = studName;
		this.studAge = studAge;
		this.studMarks = studMarks;
	}
	public int getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public double getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(double studMarks) {
		this.studMarks = studMarks;
	}
	void display() {
		System.out.println("------------------------------");
		System.out.println("Roll No :"+studRollNo);
		System.out.println("Name    :"+studName);
		System.out.println("Age     :"+studAge);
		System.out.println("Marks   :"+studMarks);
		System.out.println("------------------------------");
	}
}
