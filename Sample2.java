package first;

public class Sample2 { 
	float calculate()
	{
		float hra=21000;
		float basic=56000;
		float allowances=6000;
		float totalSalary = hra+basic+allowances;
		return totalSalary;
		
	}
	public static void main(String[] args) {
		Sample2 obj=new Sample2();
		System.out.println("total salary=>"+obj.calculate());
	}

}
