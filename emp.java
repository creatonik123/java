
import java.util.Scanner;

class Employee {
	public String empId;
	public String empName;
	public Integer salary;
	public String desig;
	public String dept;

	Employee(String id, String empName, Integer salary, String designation, String dept){

		this.empId = id;
		this.empName = empName;
		this.salary = salary;
		this.desig = designation;
		this.dept = dept;

	}

}



class Solution {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		String empId = sc.next();
		String empName = sc.next();
		Integer sal = sc.nextInt();
		String des = sc.next();
		String dept = sc.next();

		Employee emp = new Employee(empId, empName, sal, des, dept);

		System.out.println(emp.empId + " " + emp.empName + " " + emp.salary + " " + emp.desig+ " " + emp.dept);

	}

}