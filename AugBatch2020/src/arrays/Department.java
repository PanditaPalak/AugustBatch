package arrays;

public class Department {
	
	int dept_Id;
	String dept_Name;
	
	Department(int dept_Id,String dept_Name)
	{
		this.dept_Id = dept_Id;
		this.dept_Name = dept_Name;
		
	}
	
	@Override
	public String toString() {
		
		return " Department Id is: "+dept_Id+" Department Name is: "+dept_Name;
	}

}
