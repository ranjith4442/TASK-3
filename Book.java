package task_3;

public class Book {
	private int BookID;
	private String title;
	private String author;
	private boolean isAvailable;

Book(int a,String b,String c,boolean d){
	this.BookID=a;
	this.title=b;
	this.author=c;
	this.isAvailable=d;
}

public int getBookID() {return BookID;}
public String gettitle() {return title;}
public String getauthor() {return author;}
public boolean getisAvailable() {return isAvailable;}
	
	
public void setBookID(int a) {BookID=a;}
public void settitle(String a) {title=a;}
public void setauthor(String a) {author=a;}
public void setisAvailable(boolean a) {isAvailable=a;}
	
	
}


