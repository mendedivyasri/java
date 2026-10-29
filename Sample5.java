package first;

public class Sample5 {
	void display()
	{
		System.out.println("no parameters");
	}
	void display(String name)
	{
		System.out.println(name);
		
	}
	void display(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Sample5 s=new Sample5();
		s.display();
		s.display("sindhu");
		s.display(36,"divya");
	}

}
