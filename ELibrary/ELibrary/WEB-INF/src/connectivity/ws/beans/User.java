package connectivity.ws.beans;

import java.util.List;

public class User {
	private int customerId;
	private String customerPassword;
	private String customerName;
	private List<BookCart> bookCartId;
	private List<BillingClass> billId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public List<BookCart> getBookCartId() {
		return bookCartId;
	}

	public void setBookCartId(List<BookCart> bookCartId) {
		this.bookCartId = bookCartId;
	}

	public List<BillingClass> getBillId() {
		return billId;
	}

	public void setBillId(List<BillingClass> billId) {
		this.billId = billId;
	}

}
