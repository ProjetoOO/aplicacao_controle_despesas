package model;

import java.util.Date;


public abstract class PaymentMethod {
	private Date payDate;
	private String bank;
	private String payer;

	public PaymentMethod(Date payDate, String bank, String payer) {
		super();
		this.payDate = payDate;
		this.bank = bank;
		this.payer = payer;
	}

	public Double CalculateExpense(Group group) {
		Double expenseValue = group.totalValue(group.getExpenses());
		int integers = group.getMembers().size();
		Double calculateExpense = expenseValue / integers;
		return calculateExpense;
	}

	public Date getPayDate() {
		return payDate;
	}
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	
}
