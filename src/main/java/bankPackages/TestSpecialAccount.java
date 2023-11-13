package bankPackages;

import bankPackages.model.ContaBancaria;
import bankPackages.model.SpecialAccount;

public class TestSpecialAccount {

	public static void main(String[] args) {

		System.out.println("*** test special Account ***");

		SpecialAccount specialAccount = new SpecialAccount();
		specialAccount.setNameClient("special account");
		specialAccount.setNumberAccount("1");
		specialAccount.setLimite(50);

		specialAccount.deposit(100);

		makeWithdraw(specialAccount, 50);

		makeWithdraw(specialAccount, 70);
		
		makeWithdraw(specialAccount, 80);


		System.out.println(specialAccount);

	}
	
	private static void makeWithdraw(ContaBancaria account, double value) {
		if (account.withdraw(value)) {
			System.out.println("withdraw sucessfull, new balance =R$" + account.getBalance());
		} else {
			System.out.println("insufficient balance to withdraw R$" + value + "\nbalance= R$" + account.getBalance());
			
		}
 }
	
}
	
	
	