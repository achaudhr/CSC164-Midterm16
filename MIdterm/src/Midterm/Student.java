package Midterm;

	public class Student extends Person{
		 
		private final String CLASS_STATUS;
		static int numStudent;
		
		 public Student(String name, String address, String phone, String email,String CLASS_STATUS){
			
			 super(name,address,phone,email);
			 this.CLASS_STATUS=CLASS_STATUS;
			 numStudent++;
		 }

		 public Student(String CLASS_STATUS)
		 
		 {
			 
			 this.CLASS_STATUS =CLASS_STATUS;
		 
		 }
		 
		 	public String getClassStatus()
		 
		 {
			 
		 	return CLASS_STATUS;
		 
		 }
		 
		 public Student finalizeS()
		 {
			 numStudent--;
			 return null;
			 
		 }
		
 }

