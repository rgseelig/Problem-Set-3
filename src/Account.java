import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	Account(){
	}
	
	Account(int id,double balance,double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
	}
	
	public void setId(int id){
		this.id = id;
		
	}
	
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public String getDateCreated(){
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		return df.format(dateobj);
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	public String Withdraw(double amountWithdrawn){

		if ((balance - amountWithdrawn) >= 0){
			balance = balance - amountWithdrawn;
			return "";
		} else{
			return "Insufficient Funds";
		}
	}
	
	public void Deposit(double amountDeposited){
		balance = balance + amountDeposited;
	}
	

}

