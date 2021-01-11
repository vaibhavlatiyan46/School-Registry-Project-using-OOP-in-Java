
public class Test {

	public static void main(String[] args) {
	    
	    Teacher teacher=new Teacher();
	    Student student=new Student();
	    teacher.setName("Michael");
	    teacher.setAge(30);
	    teacher.setGender("male");
	    student.setName("Clara");
	    student.setAge(13);
	    student.setGender("female");
	    System.out.println(teacher.getName()+ " "+ teacher.getAge()+" "+teacher.getGender());
	    System.out.println(student.getName()+ " "+ student.getAge()+" "+student.getGender());
	    teacher.setSalary(100);
	    student.setGrade(5);
	    System.out.println("Teacher Salary: "+teacher.getSalary());
	    System.out.println("Student Grade: "+student.getGrade());
	    
	    System.out.println(teacher.myType());
	    System.out.println(student.myType());
	    System.out.println(student.myType("Ahmed"));
	    
	    teacher.eyeColor();
	    student.eyeColor();
	    teacher.pantsColor();
	    
	}
}
