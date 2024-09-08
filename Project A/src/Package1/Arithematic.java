package Package1;

public class Arithematic {  // (((((10+2)+2)-2)*2)/2)
	
	public int sum(int a, int b)
	
	{
		int c;
		c= a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	
	public int sub(int x, int y)
	
	{
		int z;
		z = x-y;
		System.out.println("Sub result is "+z);
		return z;
	}
	
	public int mult(int a1,int a2 )
	{
		int m;
		m=a1*a2;
		
		System.out.println("Multi result is "+m);
		return m;
	}
	
	public void div(int d1, int d2)
	
	{
		float d;
		d = d1/d2;
		System.out.println("Div result is "+d);
	}
	
	public static void main(String[] args) {
		
		Arithematic obj = new Arithematic();
		int sumResult = obj.sum(10,2);
		int sumResult2= obj.sum(sumResult,2);
		int subResult=	obj.sub(sumResult2, 2);
		int multResult=	obj.mult(subResult, 2);
		obj.div(multResult, 2);
		
				}

}
