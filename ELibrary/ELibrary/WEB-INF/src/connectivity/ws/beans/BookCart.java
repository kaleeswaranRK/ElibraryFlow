package connectivity.ws.beans;
public class BookCart {
	private int bookCartId;
	private BookProduct bookName;
	private int bookQuantity;
	private double bookPrice;
	private User customerId;

	public int getBookCartId() {
		return bookCartId;
	}

	public void setBookCartId(int bookCartId) {
		this.bookCartId = bookCartId;
	}

	public BookProduct getBookName() {
		return bookName;
	}

	public void setBookName(BookProduct bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public User getCustomerId() {
		return customerId;
	}

	public void setCustomerId(User customerId) {
		this.customerId = customerId;
	}


	
}
