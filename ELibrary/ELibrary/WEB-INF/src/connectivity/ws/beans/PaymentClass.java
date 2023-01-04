package connectivity.ws.beans;

import java.util.Date;

public class PaymentClass {
	private int paymentID;
	private String status;
	private Date paymentDate;
	private BillingClass billId;

	public int getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BillingClass getBillId() {
		return billId;
	}

	public void setBillId(BillingClass billId) {
		this.billId = billId;
	}
}
