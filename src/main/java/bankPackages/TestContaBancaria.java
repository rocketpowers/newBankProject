package bankPackages;

import bankPackages.model.ContaBancaria;

public class TestContaBancaria {

	public static void main(String[] args) {

		System.out.println("      *** teste conta bancaria ***");

		ContaBancaria simpleAccount = new ContaBancaria();
		simpleAccount.setNameClient(" jackson");
		simpleAccount.setNumberAccount("01");

		simpleAccount.deposit( 100);
		makeWithdraw(simpleAccount, 50);
		makeWithdraw(simpleAccount, 70);

		System.out.println(simpleAccount);

		// if (simpleAccount.withdraw(40)) {
		// System.out.println("withdraw sucessfull, new balance = " +
		// simpleAccount.getBalance());
		// } else {
		// System.out.println("insufficient balance to withdraw ");
		// }

	}

	private static void makeWithdraw(ContaBancaria account, double value) {
		if (account.withdraw(value)) {
			System.out.println("withdraw sucessfull, \nnew balance = $ " + account.getBalance());
		} else {
			System.out.println("insufficient balance to withdraw $ " + value);
		}

	}

}
