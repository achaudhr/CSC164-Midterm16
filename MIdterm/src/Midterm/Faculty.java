package Midterm;


	public class Faculty extends Employee {
		 private String office_hours, rank;
		 public Faculty(){
		 }
		 public Faculty(String name, String address, String phone, String email){
			 super(name,address,phone,email);
		 }

		 public Faculty(String office_hours, String rank){
		 this.office_hours = office_hours;
		 this.rank = rank;
		 }
		 public String getOfficeHours(){
		 return office_hours;
		 }

		 public void setOfficeHours(String office_hours){
		 this.office_hours = office_hours;
		 }

		 public String getRank(){
		 return rank;
		 }

		 public void setRank(String rank){
		 this.rank = rank;
		 }
		 
}
