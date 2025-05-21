package com.constructor;

public class BankAccount {
	public double balance;
	public String customerName;
	public String address;
	
	public BankAccount(double bal,String custName,String add) {
		balance=bal;
		customerName=custName;
		address=add;
	}
	public void setData() {
		System.out.println("Balance in Account :" +balance);
		System.out.println("CustomerName :");
	}
	public BankAccount() {
		balance=0;
		customerName="NA";
		address="NA";
	}
	public void deposit(double amount) {
		if(amount>0) {
			System.out.println("Total Amount :" +(balance+amount));
		}
		else {
			System.out.println("Invalid amount,Deposit failed");
		}
	}
	
		public void withdraw(double amount) {
			if(amount<0) {
				System.out.println("Invalid amount.withdraw failed");
			}
			else if(balance<amount) {
				System.out.println("Insufficient funds. Withdrawal failed");
			}
			else {
				System.out.println(balance-amount);
			}
		}
		
		public void updateAddress(String newAddress) {
			address="Guntur";
			System.out.println("Address updated successfully :" + address);
		}
		public void updateCustomerName(String newCustomerName) {
			customerName="Ganesh";
			System.out.println("Customer name successfully to :" + customerName);
		}
		public static void main(String[] args) {
			BankAccount b1 = new BankAccount(20000,"sai","hyderabad");
			b1.setData();
			b1.deposit(1000);
			b1.withdraw(5000000);
			b1.updateAddress("Guntur");
			b1.updateCustomerName("Ganesh");
			
		}
}