
public class Student extends Person {

	private int grade;

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String myType() {
		return "Student";
	}
	public String myType(String name) {
		return name+" is a student";
	}

	@Override
	public void eyeColor() {
		System.out.println("Student eye is brown");
		
	}
}
