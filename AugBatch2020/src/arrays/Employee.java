package arrays;


public class Employee {
	
	
	int empId;
	String name;
	DateOfJoining doj;
	Department dept;
	
	Employee(int empId,String name,DateOfJoining doj,Department dept)
	{
		this.empId = empId;
		this.name = name;
		this.doj = doj;
		this.dept = dept;
		
	}
	
	
	void displayData()
	{
		System.out.println("**************************");
		System.out.println("EmpId is : "+empId+"....."+"Emp Nameis : "+name);
	    System.out.println("Date of Joining of "+name+" is: "+doj);
	    System.out.println("Department details of "+name+" is : "+dept);
	}

}
