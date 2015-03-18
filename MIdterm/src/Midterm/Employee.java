package Midterm;

	public class Employee extends Person{
		 private String office,salary;
		 private MyDate DATE_HIRED;

		 /**
		  * Create an Employee
		  */
		 public Employee(){
		 }

		 /**
		  * An employee has an office, salary, and date hired
		  * @param name 
		  * @param address
		  * @param phone
		  * @param email
		  */
		 public Employee(String name, String address, String phone, String email){
			 super(name,address,phone,email);
		 }

		 /**
		  * 
		  * @param office 
		  * @param salary
		  * @param DATE_HIRED
		  */
		 public Employee(String office, String salary, MyDate DATE_HIRED){
		 this.office = office;
		 this.salary = salary;
		 this.DATE_HIRED = DATE_HIRED;
		 }
		 public String office(){
		 return office;
		 }

		 public void setOffice(String office){
		 this.office = office;
		 }

		 public String getSalary(){
		 return salary;
		 }

		 public void setSalary(String salary){
		 this.salary = salary;
		 }

		 public MyDate getMyDate(){
		 return DATE_HIRED;
		 }
	 }

