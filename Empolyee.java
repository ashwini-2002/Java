//use case 6: a}Employee class:hide salary and allow access only through getter/setter
package ashwini.cm;

public class Empolyee {
	private int salary;
	void setSalary(int sal) {
		salary=sal;
	}
	int getSalary() {
		return salary;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empolyee emp = new Empolyee();
		emp.setSalary(60000);
		System.out.println(emp.getSalary());
		
 
	}
}

