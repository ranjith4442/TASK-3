package task_3;
import java.util.*;
public class Library {
	int capacity = 10;
	int noofbooks = 2;
	Library()
	{
		 Book[] books = new Book[10];
		
	}
	
	public void addBook(Book books)
	{
	
		if(noofbooks < capacity)
		{
			books[noofbooks] = books;
			noofbooks++;
			System.out.println("Book added");
		}
		else 
			System.out.println("The library limit is exceeded...");
		}
	public void removebook(int a)
	{
		int s = a;
		for(int i=0;i<=noofbooks;i++)
		{
			if(books[i].getBookID() == s)
			{	books[i]=null;
			System.out.println("The book is removed....");	
			}
			else System.out.println("Invalid BookID....");
			
		
		}
		
		
		
	}

	public void displaybooks() {
		for (Book i : books)
		{
			System.out.println("BookID :" + i.getBookID() + " \n Title :  "+i.gettitle() + "\n Author : "+ i.getauthor()+ "\n Availability :" + i.getisAvailable());
		}
		
	}
	
	
	
	
	
	
	
	
}
