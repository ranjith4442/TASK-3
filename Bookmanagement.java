package task_3;
import java.util.*;
public class Bookmanagement {

	public static void main(String[] args) {
		
		Library l1 = new Library();
		Library[] library = new Library[10];
		ArrayList<Book> book = new ArrayList<Book>();
		book[0]= new Book(1,"one","two",true);
		book[1]=new Book(2,"three","four",false);
		Scanner s = new Scanner(System.in);
		System.out.println("select the below option\n 1.Add Book \n 2.Remove Book \n 3.Display All Books");
		int input = s.nextInt();
		if(input ==1)
		{
			System.out.println("ENter the BookID : ");
			int a = s.nextInt();
			System.out.println("ENter the Book name : ");
			String b = s.next();
			System.out.println("ENter the author : ");
			String c = s.next();
			boolean d = true;
			Book books = new Book(a,b,c,d);
			l1.addBook(books);
		}
		else if(input ==2)
		{
			System.out.println("ENter the BookId to removed : ");
			int a = s.nextInt();
			l1.removebook(a); 
		}
		else if (input == 3)
		{
			l1.displaybooks();
		}
		else System.out.println();
		
		

	}

}
