package bankPackages.model;

import lombok.Data;

@Data
public class SpecialAccount extends ContaBancaria {

	private double limite;

	@Override
	public String toString() {
		return "SpecialAccount [limite=" + limite + "]";
	}

	public boolean withdraw(double value) {

		double balanceMoreLimite = this.getBalance() + limite;

		if ((balanceMoreLimite - value) >= 0) {
			this.setBalance(this.getBalance() - value);
			return true;
		}

		return false;
	}

}
