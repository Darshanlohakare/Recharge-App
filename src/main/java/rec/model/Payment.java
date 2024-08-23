package rec.model;

public class Payment {
	
	public String cardno;
	public String cardname;
	public String expdate;
	public String cvv;
	
	public Payment(String cardno, String cardname, String expdate, String cvv) {
		super();
		this.cardno = cardno;
		this.cardname = cardname;
		this.expdate = expdate;
		this.cvv = cvv;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	
	
	
	

}
