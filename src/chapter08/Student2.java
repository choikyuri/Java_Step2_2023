package chapter08;

public class Student2 {
	
	public static int serialNum=9999;
	int studentID;
	String StudentName;
	int grade;
	String address;
	
	public Student2() {
		//후위연산
		serialNum++;
		this.studentID=serialNum;
		//전위연산
		//studentID = ++serialNum;
	}
	
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public static int getSerialNum() {
		return serialNum;
	}

}
