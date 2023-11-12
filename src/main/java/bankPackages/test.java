package bankPackages;

public class test {

	public static void main(String[] args) {

		System.out.println("*** test bank ***");

		
		//setando nome e numer da conta na mao
		ContaBancaria simpleAccount = new ContaBancaria();
		simpleAccount.setNameClient("client simple account");
		simpleAccount.setNumberAccount("01");
		
		
		//usando metodo do deposito mais metodo condicional de saque
		simpleAccount.deposit(100);
		makeWithdraw(simpleAccount, 40);
		makeWithdraw(simpleAccount, 70);
		
		 System.out.println(simpleAccount);


	//	if (simpleAccount.withdraw(40)) {
		//	System.out.println("withdraw sucessfull, new balance = " + simpleAccount.getBalance());
	//	} else {
		//	System.out.println("insufficient balance to withdraw ");
		//}

	
	}

	private static void makeWithdraw(ContaBancaria account, double value) {
		if (account.withdraw(value)) {
			System.out.println("withdraw sucessfull, new balance = " + account.getBalance());
		} else {
			System.out.println("insufficient balance to withdraw " + value);
		}

	}

}
