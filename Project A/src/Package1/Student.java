package Package1;

public class Student {
	
	int RollNo;
	int Age;
	public void Display1()
	{
		System.out.println("Welcome to all of You");
		
	}
	
	public void Display2() 
	{
		System.out.println("Automation is very Easy");
	}
	
	public static void main(String[] args) 
	{
		Student xyz = new Student();
		
		xyz.RollNo = 505;
		xyz.Age = 30;
		
		System.out.println("RollNo:" +xyz.RollNo);
		System.out.println("Age:" +xyz.Age);
		xyz.Display1();
		xyz.Display2();
		
		
	}

}
