package arrays;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no of employees: ");
		int  size =sc.nextInt();
		
		Employee employee[] = new Employee[size];
		
		
		for(int i =0; i<employee.length;i++)
		{
			System.out.println("Enter employee id: ");
			int empId = sc.nextInt();
			
			System.out.println("Enter employee name: ");
			String name = sc.next();
			
			System.out.println("Enter day of joining: ");
			int day = sc.nextInt();
			
			System.out.println("Enter month of joining: ");
			int month = sc.nextInt();
			
			System.out.println("Enter year of joining: ");
			int year = sc.nextInt();
			
			System.out.println("Enter department id: ");
			int dept_Id = sc.nextInt();
			
			System.out.println("Enter department name: ");
			String dept_Name =sc.next();
			
			employee[i] = new Employee(empId,name,new DateOfJoining(day, month, year),new Department(dept_Id, dept_Name));
		}
		
//		employee[0] = new Employee(101,"Rahul",new DateOfJoining(11, 12, 1991),new Department(196, "Accounts"));
//		employee[1] = new Employee(102,"Priya",new DateOfJoining(10, 11, 1991),new Department(196, "Accounts"));
	
		
		for(int i = 0;i<employee.length;i++)
		{
			employee[i].displayData();
		}
	
	}

}
