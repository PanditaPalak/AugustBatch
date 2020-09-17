package arrays;

public class DateOfJoining {
	
	
	int day,month,year;
	
	DateOfJoining(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
				
	}
	
	@Override
	public String toString() {
		
		return day+"/"+month+"/"+year;
	}

}
