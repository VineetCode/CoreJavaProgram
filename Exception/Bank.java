public interface Bank{

  public void   deposite(double amt) throws InValidAmountException;
  public double withdraw(double amt) throws InSufficientFundsException;
  public void   balanceEnquiry();

}