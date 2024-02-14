package task_2;
import java.util.*;

public class Taxcalc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.Employee \n 2.product");
		int input= s.nextInt();
		if(input == 1)
		{
			System.out.println("Enter the Employee ID");
			int a= s.nextInt();
			System.out.println("Enter the Name :");
			String b  = s.next();
			System.out.println("Enter the yearly salary : ");
			int c = s.nextInt();
			System.out.println("Enter the income tax in percentage : ");
			double d = s.nextDouble();
			Employee e1 = new Employee(b,a,c);
			System.out.println("The taxable amount is : " + e1.calctax(d)); 
			
		}
		else if (input == 2)
		{
			System.out.println("Enter product ID : ");
			int a = s.nextInt();
			System.out.println("Enter price : ");
			int b = s.nextInt();
			System.out.println("Enter the quantity : ");
			int c = s.nextInt();
			Product p1 = new Product(a,b,c);
			System.out.println("Enter the sales tax in percentage : ");
			double d = s.nextDouble();
			System.out.println("The taxable amount is : " + p1.calctax(d));
			
			
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
