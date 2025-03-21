package project;

public class MyClass
{
	int i;
	int j;
	MyClass(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	int show()
	{
		System.out.println(i);
		System.out.println(j);
		return i+j;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method");
		MyClass obj=new MyClass(2, 4);
		int k = obj.show();
		System.out.println(k);
	}

}
