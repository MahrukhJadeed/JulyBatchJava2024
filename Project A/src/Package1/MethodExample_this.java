package Package1;

public class MethodExample_this {
	
	public void DefaultMethod()
	{	
	
		System.out.println("Default parameterized method");
	}
	
	public void Method1(int a)
	{	
		Method3(1,1,1);
		System.out.println("One parameterized Method");
		Method2(1,1);
	}
	public void Method2(int a,int b)
	{
	
		
		System.out.println("Two parameterized Method");
		this.Method4(1, 2, 3, 4);
	}
	
	public void Method3(int a,int b,int c)
	{
	
		System.out.println("Three parameterized Method");
		this.DefaultMethod();
	}
	
	public void Method4(int a,int b,int c, int d)
	{
		
		System.out.println("Four parameterized Method");
	}
	
	
	public static void main(String[] args) {
	
		MethodExample_this ob1 = new MethodExample_this();
		
		ob1.Method1(3);
		
}
}
