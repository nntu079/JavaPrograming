package Tu;

import java.util.ArrayList;

public class Library {
	private String theName;
	private ArrayList<Book> theLoanStock;
	private ArrayList<BorrowerRecord> theBorrowers;
	
	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		this.theName = theName;
	}

	public Library(String theName) {
		super();
		this.theName = theName;
		this.theLoanStock= new ArrayList<Book>();
		this.theBorrowers= new ArrayList<BorrowerRecord>();
		
	}

	public void addOneBook(Book aBook) {
		// TODO Auto-generated method stub
		this.theLoanStock.add(aBook);
	}
	
	public void registerOneBorrower(String aBorrowerName) {
		BorrowerRecord br = new BorrowerRecord(aBorrowerName);
		this.theBorrowers.add(br);
	}
	public void displayBooksAvailableForLoan() {
		System.out.println("Book is available");
		for(Book book: this.theLoanStock) {
			if(book.isAvailableForLoan()) {
				book.display();
			}
		}
	}
	public void display() {
		System.out.println("Name: "+this.getTheName());
		System.out.println("Borrowers: ");
		System.out.println("Books: ");
		for(Book book: this.theLoanStock) {
			book.display();
		}
	}
	
	
}
