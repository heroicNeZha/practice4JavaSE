package blog;


import javax.swing.MenuSelectionManager;

public class Test1 {
	public static void main(String[] args) {
		Employee empl = new Manager("lzw", 0);
		empl.setSalary(1000);
		System.out.println(empl.getSalary());
	}
}

class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Manager extends Employee {

	private double bouns;

	public Manager(String name, double salary) {
		super(name, salary);
		bouns = 10;
	}

	@Override
	public double getSalary() {
		return super.getSalary()+bouns;
	}

}
