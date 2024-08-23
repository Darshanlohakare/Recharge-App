package rec.model;

public class Recharge {
	
	public String planId;
	public String provider;
	public String planName;
	public String planDetails;
	public String planPrice;
	
	public Recharge(String planId, String provider, String planName, String planDetails, String planPrice) {
		super();
		this.planId = planId;
		this.provider = provider;
		this.planName = planName;
		this.planDetails = planDetails;
		this.planPrice = planPrice;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanDetails() {
		return planDetails;
	}

	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}

	public String getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}
	

}
