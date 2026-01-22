//use case 6: b}Bank Account:Allow only secure(private) deposit/Withdrawal
package ashwini.cm;
class BackAccount1{
	private int deposit;
	private int withdrawal;
	
	public void setDeposit(int deposit) {
		this.deposit= deposit;
	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal= withdrawal;
	}
	public int getDeposit() {
		return deposit;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
}

public class BankAccount {
	public static void main(String[] args) {
		BackAccount1 acc = new BackAccount1();
		acc.setDeposit(20000);
		acc.setWithdrawal(10000);
		System.out.println("Deposited amount: "+acc.getDeposit());
		System.out.println("Withdrawal Amount: "+acc.getWithdrawal());
	}

}

