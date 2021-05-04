package Package3;

public class ProductionDepartment  implements Employee 
{
	   /* This class must have to implement both the methods
	    * else you will get compilation error
	    */
	@Override
	public void enroll(int id, String name, char gender, long phno, double salary ) {
		
		System.out.println("Employee enrolled to production department");
		System.out.println("Employee Id : " +id+ "/n Employee Id : "+name+ ""
				+ "Employee Gender : "+gender+"Employee Phone Number : "+phno+ "Employee Salary : "
						+""+salary);
		System.out.println("=====================================================");
	}
	@Override
	public void terminate() 
	{
		String name = "Wu Kong";
		int id = 777;
		System.out.println("Employee Record Deleted from production department");
		System.out.println("Employee Name is : " +name);
		System.out.println("Employee Id : " +id);
		System.out.println("=====================================================");
	}
	@Override
	public void calculatePay() {
		double salary = 25000.50;
		System.out.println("Salary of Employee of production department is " +salary);
		System.out.println("=====================================================");
	}	
}

