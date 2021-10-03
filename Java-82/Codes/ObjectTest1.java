class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay";
		sal = 5500.5f;
	}

	void displayDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

} //Employee

class ObjectTest1
{
	public static void main(String[] args) 
	{
		/*--- create an instance of Employee ---*/
		Employee emp = new Employee();

		/*--- access the state of instance with reference---*/
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		/*--- access the state of instance with method---*/
		emp.displayDetails();
		System.out.println("--------------------------------------");

		/*---change the state of object using reference ---*/
		emp.empno = 101;
		emp.name = "Praveen";
		emp.sal = 2500f;

		emp.displayDetails();
		System.out.println("--------------------------------------");
		
		/*--- change the state of object using method ---*/
		emp.setDetails();
		emp.displayDetails();
		System.out.println("--------------------------------------");
	}
}
