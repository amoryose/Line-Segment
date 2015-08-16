//Avraham Moryosef
//CS 420
//7/17/15

package myclasses;

public class ChkgAcct extends BankAcct
{
	private static double monthlyFee = 3.00;
	private static double perCheckFee = 0.15;
	private int nbrOfChecks = 0;
	
	private void setNbrOfChecks(int NbrOfChecks)
	{
		this.nbrOfChecks = NbrOfChecks;
	}

	public int getNbrOfChecks()
	{
		return nbrOfChecks;
	}

	public static double getPerCheckFee()
	{
		return perCheckFee;
	}

	public static void setPerCheckFee(double PerCheckFee)
	{
		ChkgAcct.perCheckFee = PerCheckFee;
	}

	public ChkgAcct(int acctNbr, double balance)
	{
		super(acctNbr, balance);
	}

	public static double getMonthlyFee()
	{
		return monthlyFee;
	}

	public static void setMonthlyFee(double MonthlyFee)
	{
		ChkgAcct.monthlyFee = MonthlyFee;
	}
	
	public void withdraw(double withdraw)
	{
		double chkgBal = getBalance() - withdraw;
		setBalance(chkgBal);
		nbrOfChecks = getNbrOfChecks() + 1;
	}

	@Override
	public void monthEnd()
	{
		double fees = getMonthlyFee() + getNbrOfChecks() * getPerCheckFee();
		double chkgBal = getBalance() - fees;
		chkgBal = Math.round(chkgBal * 100) / 100.0;
		setBalance(chkgBal);
		setNbrOfChecks(0);
	}
}
