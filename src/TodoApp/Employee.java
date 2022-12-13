package TodoApp;
import java.util.*;
public class Employee {
	public String name;
	
	private Double salary;
	
	public Employee(String nameEmp) {
	  name=nameEmp;
	}
  public void setSalary(Double empsalary) {
	  salary = empsalary;
	}
  public void printEmployees() {
     System.out.print(name);
     System.out.print(salary);
    }
  public static void main(String[] args) {
	Employee variable = new Employee("vimal");
    variable.setSalary(20.0);
    variable.printEmployees();
}
}