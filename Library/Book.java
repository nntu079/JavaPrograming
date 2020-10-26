package Tu;

public class Book {
	private String theCatalog;
	private String theAuthor;
	private String theTitle;
	private BorrowerRecord theBorrower;


	public void display() {
		System.out.println("Number: "+this.getTheCatalog());
		System.out.println("Author: "+this.getTheAuthor());
		System.out.println("Title: "+this.getTheTitle());
	}
	public boolean isAvailableForLoan() {
		return this.theBorrower ==null; // Neu this.theBorrower = null ==> return true. Khac null ==> return false
	}
	public Book(String theCatalog, String theAuthor, String theTitle) {
		super();
		this.theCatalog = theCatalog; // co thuoc tinh ==> constructor phai khoi gan 
		this.theAuthor = theAuthor;
		this.theTitle = theTitle;
		this.theBorrower = null; // khoi gan: null <-> chua co nguoi muon sach. Trong java, cac bien deu la con tro
	}
	public String getTheCatalog() {
		return theCatalog;
	}
	public void setTheCatalog(String theCatalog) {
		this.theCatalog = theCatalog;
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
