class Employee 
{
	int empno;
	String name;
	float sal;
	
	Employee(){
		System.out.println("*****");
		empno = 101;
		name = "Sanjay";
		sal = 5500.5f;
	}

	void displayDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

} 

class ConstructorTest
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		System.out.println("--------------------------------------");

		emp1.displayDetails();
		System.out.println("--------------------------------------");

		emp2.displayDetails();
		System.out.println("--------------------------------------");

		emp3.displayDetails();
		System.out.println("--------------------------------------");
	}
}
