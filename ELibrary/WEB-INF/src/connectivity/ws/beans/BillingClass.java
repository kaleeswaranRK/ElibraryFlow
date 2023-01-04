package connectivity.ws.beans;

import java.util.Date;
import java.util.List;

public class BillingClass {
	private int billId;
	private double totalAmount;
	private Date billDate;
	private User customerId;
	private List<BillingItem> billItem;
	
	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public List<BillingItem> getBillItem() {
		return billItem;
	}

	public void setBillItem(List<BillingItem> billItem) {
		this.billItem = billItem;
	}

	public User getCustomerId() {
		return customerId;
	}

	public void setCustomerId(User customerId) {
		this.customerId = customerId;
	}

}
