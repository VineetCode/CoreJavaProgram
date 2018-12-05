public class HDFCBank implements Bank{
    
    private double balance;

    public void deposite(double amt) throws InValidAmountException{
      if(amt < 0){
          throw new InValidAmountException(amt+ " is invalid amount...");
      }
      balance =balance +amt;
    } 

    public double withdraw(double amt) throws InSufficientFundsException{
      if(amt > balance){
          throw new InSufficientFundsException("InSufficient Funds");
      }
      balance=balance-amt;
      return balance;
    }
   public void balanceEnquiry(){
       System.out.println("Current Balance ::"+balance);
   }
}