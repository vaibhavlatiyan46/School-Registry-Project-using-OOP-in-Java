
public class Teacher extends Person implements Outfit {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String myType() {
		return "Teacher";
	}

	@Override
	public void eyeColor() {
		System.out.println("Teacher eye is green");
		
	}

	@Override
	public void pantsColor() {
		System.out.println("black pants");
		
	}

}
