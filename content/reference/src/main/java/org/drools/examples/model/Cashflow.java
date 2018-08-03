package org.drools.examples.model;

import java.util.Date;

public class Cashflow {

	private Date date;

	private double amount;
	
	public Cashflow() {
		
	}

	public Cashflow(Date date, double amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Cashflow [date=" + date + ", amount=" + amount + "]";
	}
}
