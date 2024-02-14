package task_2;

public class Product {
	private int pID;
	private int price;
	private int quantity;


Product(int a, int b, int c)
{
	this.pID=a;
	this.price=b;
	this.quantity=c;
	
}



	public double calctax(double d)
	{
		double unitprice = price/quantity;
		return(unitprice*d/100);
	}




}












