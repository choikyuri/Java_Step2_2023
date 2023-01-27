package chapter09;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//this.customerID=customerID;
		//this.customerName=customerName;
		customerGrade="VIP";
		bonusRatio=0.05;
		this.agentID=agentID;//전문 상담원
		saleRatio=0.1;
	}
    //포인트적립 & 물건가격
	@Override
	public int calcPrice(int price) {
		bonusPoint=(price-(int)(price*saleRatio))*bonusRatio;
		return price-(int)(price*saleRatio); //물건가격
	}

	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n전문상담원은 "+agentID+"입니다";
	}

	public int getAgentID() {
		return agentID;
	}
	
	
	
	
	

}
