
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2500.5; //Type mismatch: cannot convert from double to float
		//float sal = 2500.5f;
		//float sal = 2500.5F;
		float sal = (float) 2500.5;
		System.out.println("My Salary is " + sal);
		
		double data = 2500.5;
		System.out.println(data);		
		
		System.out.println(10/3); //3
		System.out.println(10.0f/3); //3.3333333
		System.out.println(10.0/3); //3.3333333333333335
		
		System.out.println(Integer.toHexString(65));	
		
		float mysal = 2575.84756f;
		//System.out.println(mysal);
		System.out.printf("MySalary is %f \n", mysal);
		System.out.printf("MySalary is %.2f", mysal);
	}

}
