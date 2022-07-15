package Converter;
public class Currency {
	private String currency;
	private double amount;

	//constructor
	public Currency() {
		super();
	}
	public Currency(String currency, double amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	//getters and setters
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}