package Assignment_5_1;

import java.util.Scanner;
public class  BankAccount{
	protected float Current_balance;
	protected float deposit;
	protected float withdraw;
	static final int Paswword =9905;
	public void deposit()
	{
		this.Current_balance=Current_balance+deposit;
		setCurrent_balance(this.Current_balance);
	}
	public void withdraw()
	{
		Current_balance=Current_balance-withdraw;
		setCurrent_balance(Current_balance);
	}
	
	public float getCurrent_balance() {
		return Current_balance;
	}
	public void setCurrent_balance(float current_balance) {
		Current_balance = current_balance;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}
}

class SavingAccount extends BankAccount
{
	static Scanner sc =new Scanner(System.in);
	//SavingAccount save = new SavingAccount();
	
	public SavingAccount(){
		
	}	
	public void deposit()
	{
		System.out.println("Enter Amount To Deposit:   ");
		setDeposit(sc.nextFloat());		
		if(getDeposit()>0) {
			super.deposit();
			System.out.println("Current Balance: "+getCurrent_balance());
//		this.Current_balance=Current_balance+deposit;
//		setCurrent_balance(this.Current_balance);
		}
	}
	public void withdraw()
	{
		System.out.println("Enter Amount To Withdraw:   ");
		setWithdraw(sc.nextFloat());
		if(getWithdraw()<=100000 && getWithdraw()<=Current_balance)
		{
			super.withdraw();
			System.out.println("Current Balance: "+getCurrent_balance());
//		Current_balance=Current_balance-withdraw;
//		setCurrent_balance(Current_balance);
		}else 
			System.out.print("Insufficent Balance !!!!\nPlease Add Balance to Your Account\nCurrent Balance: "+getCurrent_balance()+"\n\n\n");
	}
	public int security_check()
	{		
		System.out.print("Enter Password: ");
		return sc.nextInt();
	}
	public static int choise()
			{
		      System.out.println("Select Operation: \n0.Exit\n1.Deposit\n2.Withdraw");
		      return sc.nextInt();
			}
 
	public void MasterMind()
	{
			
		if (security_check()==SavingAccount.Paswword)
		{
			int ch;
			while((ch=SavingAccount.choise())!=0) {
			switch (ch) {
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;

			default:
				break;
			}
	     }
      }else 
     {
    	  System.out.println("Invalid Password!!!");   	
    	
      }		
	}
}

