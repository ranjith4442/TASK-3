package task_2;

public class Employee {
	private String EmpName;
    private int EmpID;
    private int Salary;
Employee(String a, int b, int c)
{
	this.EmpName=a;
	this.EmpID=b;
	this.Salary=c;
	}

public double calctax(double a)
{
	return (Salary * a/100);
}

	

    
    
    
}
