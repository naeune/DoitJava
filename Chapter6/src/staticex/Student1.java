package staticex;

public class Student1 {
	
	public static int serialNum = 1000;	// static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;			// 학생이 증가할 때마다 증가
		studentID = serialNum;	// 증가된 값을 학번 인스턴스에 부여
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
}
