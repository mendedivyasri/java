package first;

class Sample3 {
	

		void showStudentDetails(int studentid, String studentName,String studentCity)
		{
			System.out.println(studentid);
			System.out.println(studentName);
			System.out.println(studentCity);
			System.out.println("=================");
			System.out.println(studentid+" "+studentName+" "+studentCity);
		
		}
		
		public static void main(String[] args) {
			Sample3 obj=new Sample3();
			obj.showStudentDetails(36, "Divya", "Hyd");
		}

	}
