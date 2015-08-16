//Avraham Moryosef
//CS 420
//7/17/15

package myclasses;

public class SvgsAcct extends BankAcct
{
	private static double interestRate = 0.04;
	
	public SvgsAcct(int acctNbr, double balance)
	{
		super(acctNbr, balance);
	}

	public static double getInterestRate()
	{
		return interestRate;
	}

	public static void setInterestRate(double InterestRate)
	{
		SvgsAcct.interestRate = InterestRate;
	}

	@Override
	public void monthEnd()
	{
		double svgsBal = getBalance() + (getBalance() * getInterestRate() / 12); 
		svgsBal = Math.round(svgsBal * 100) / 100.0;
		setBalance(svgsBal);
	}
}
