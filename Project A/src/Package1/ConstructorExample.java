package Package1;

public class ConstructorExample {
	
	public ConstructorExample() {
		// TODO Auto-generated constructor stub
		this(11,12,13);
		System.out.println("Default Constructor");
	}
	
	public ConstructorExample(int a) {
		// TODO Auto-generated constructor stub
		this(11,12);
		System.out.println("One Parameterized Constructor");
	}
	
	public ConstructorExample(int a,int b) {
		// TODO Auto-generated constructor stub
	this();
		System.out.println("Two Parameterized Constructor");
	}
	
	public ConstructorExample(int a,int b,int c) {
		// TODO Auto-generated constructor stub
	
		System.out.println("Three Parameterized Constructor");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorExample ob2 = new ConstructorExample(13);
		
		//ConstructorExample ob = new ConstructorExample();
		//ConstructorExample ob1 = new ConstructorExample(13);
		
	}

}
