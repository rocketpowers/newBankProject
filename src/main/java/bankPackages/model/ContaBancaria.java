package bankPackages.model;

import lombok.Data;

@Data
public class ContaBancaria {

	private String nameClient;
	private String numberAccount;
	private double balance;

	@Override
	public String toString() {
		return 
				"       *** ContaBancaria *** "
				+ "\nnameClient= " + nameClient 
				+ "\nnumberAccount= " + numberAccount 
				+ "\nbalance= " + balance + "";
	}
 
	
	public void deposit(double value) {
		balance += value;

		
	}

	public boolean withdraw(double value) {

		if ((balance - value) >= 0) {
			balance -= value;
			return true;
		}

		return false;

	}

}
