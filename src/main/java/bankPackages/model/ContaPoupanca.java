package bankPackages.model;

import java.util.Calendar;

import lombok.Data;

@Data
public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}

	public boolean calcularNewBalance(double taxaRendimento) {

		Calendar today = Calendar.getInstance();
		if (diaRendimento == today.get(Calendar.DAY_OF_MONTH)) {
			// balance += balance * taxaRendimento;
			this.setBalance(this.getBalance() + this.getBalance() * taxaRendimento);
			return  true;
		}
		return false;
	}

}
