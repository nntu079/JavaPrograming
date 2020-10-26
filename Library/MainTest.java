package Tu;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book java = new Book("001","007","Java");
		Book csharp = new Book("002","007","C#");
		//java.display();
		
		Library hcmusLib= new Library("HCMUS Library");
		
		//Test case 2: Add one book
		hcmusLib.addOneBook(java);
		hcmusLib.addOneBook(csharp);
		hcmusLib.display();
		
		//Test case 3: display books available for Loan
		hcmusLib.displayBooksAvailableForLoan();
	}

}