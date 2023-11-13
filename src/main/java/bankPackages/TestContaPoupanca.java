package bankPackages;

import bankPackages.model.ContaBancaria;
import bankPackages.model.ContaPoupanca;

public class TestContaPoupanca {

	public static void main(String[] args) {

		System.out.println("*** test bank ***");

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNameClient("client poupança account");
		contaPoupanca.setNumberAccount("1");
		contaPoupanca.setDiaRendimento(12);

		contaPoupanca.deposit(100);
		makeWithdraw(contaPoupanca, 40);
		makeWithdraw(contaPoupanca, 70);

		if (contaPoupanca.calcularNewBalance(0.5)) {

			System.out.println("rendimento aplicado, new balance this= " + contaPoupanca.getBalance());
		} else {

			System.out.println("nao e o dia do rendimento, novo saldo nao inserido e calculado");

		}

	}

	private static void makeWithdraw(ContaBancaria account, double value) {
		if (account.withdraw(value)) {
			System.out.println("withdraw sucessfull, \nnew balance = " + account.getBalance());
		} else {
			System.out.println("insufficient balance to withdraw " + value);

		}

	}

}