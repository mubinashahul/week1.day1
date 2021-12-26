package week1.day2;

public class EmployeeInfo {
	//Pass name : "Mubi" ; emp id :"10";
	public void getEmployeeDetails(String name, int empid)
	{
		System.out.println("Employee Id  "+empid+ " And Employee Name" + name );
	}
	public void printCompanyAddress() {
		System.out.println("Chennai");
	}
	public String getCompanyAddress() {
		System.out.println("I am giving company address");
		return "UAE";
	}
	
	public static void main(String[] args) {
	EmployeeInfo ei = new EmployeeInfo();
	ei.printCompanyAddress();
	ei.getEmployeeDetails("Mubi", 100);
	//System.out.println(ei.getCompanyAddress());
	String temp = ei.getCompanyAddress();
	System.out.println(temp);
	}

}


