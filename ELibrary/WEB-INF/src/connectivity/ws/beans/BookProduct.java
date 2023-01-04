package connectivity.ws.beans;

public class BookProduct {
	private int bookID;
	private String bookName;
	private String authorName;
	private int bookQuantity;
	private double bookPrice;
	private Category categoryName;

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Category getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(Category categoryName) {
		this.categoryName = categoryName;
	}

}
