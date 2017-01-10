package prob05;

public class Account {

	private String accountNo;
	private int balance;
	
	public Account() {
	}
	
	public Account(String acc) {
		this.accountNo = acc;
		System.out.println(acc + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void save (int bal) {
		this.balance += bal;
		System.out.println(this.accountNo + " 계좌에 " + bal + "만원이 입금되었습니다.");
	}
	
	public void deposit ( int dep) {
		this.balance -= dep;
		System.out.println(this.accountNo + " 계좌에 " + dep + "만원이 출금되었습니다.");
	}
	
	
}
