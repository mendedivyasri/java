package first;

public class Sample4{ 
	float calculate(int hra,int basic,int allowances)
	{
		
		float totalSalary = hra+basic+allowances;
		return totalSalary;
		
	}
	public static void main(String[] args) {
		Sample4 obj=new Sample4();
		System.out.println("total salary=>"+obj.calculate(12000,54000,6000));
	}

}
