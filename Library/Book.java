package Tu;

public class Book {
	private String theCatalogNumber;
	private String theAuthor;
	private String theTitle;
	
	private BorrowerRecord theBorrower;


	public void display() {
		System.out.println("Number: "+this.gettheCatalogNumber());
		System.out.println("Author: "+this.getTheAuthor());
		System.out.println("Title: "+this.getTheTitle());
	}
	
	public boolean isAvailableForLoan() {
		return this.theBorrower ==null; // Neu this.theBorrower = null ==> return true. Khac null ==> return false
	}
	
	public Book(String theCatalogNumber, String theAuthor, String theTitle) {
		super();
		this.theCatalogNumber = theCatalogNumber; // co thuoc tinh ==> constructor phai khoi gan 
		this.theAuthor = theAuthor;
		this.theTitle = theTitle;
		this.theBorrower = null; // khoi gan: null <-> chua co nguoi muon sach. Trong java, cac bien deu la con tro
	}
	
	//auto generate
	public String gettheCatalogNumber() {
		return theCatalogNumber;
	}
	public void settheCatalogNumber(String theCatalogNumber) {
		this.theCatalogNumber = theCatalogNumber;
	}
	public String getTheAuthor() {
		return theAuthor;
	}
	public void setTheAuthor(String theAuthor) {
		this.theAuthor = theAuthor;
	}
	public String getTheTitle() {
		return theTitle;
	}
	public void setTheTitle(String theTitle) {
		this.theTitle = theTitle;
	}

}
