import java.io.*;
public class Clerk{
    public static void main(String[] args){

    try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Bank acc1=new HDFCBank();
        String option="";

        do{
          System.out.println("1. Deposite");
          System.out.println("2. Withdraw");
          System.out.println("3. Balance Enquiry");
          System.out.println("Enter option.");

          option=br.readLine();
          switch(option){
              case "1" :{
                        System.out.println("Enter Deposite Amount ::");
                        String s=br.readLine();
                        double amt=Double.parseDouble(s);
                        acc1.deposite(amt);
                        acc1.balanceEnquiry();
                        break;
                        }
               case "2" :{
                        System.out.println("Enter withdraw Amount ::");
                        String s=br.readLine();
                        double amt=Double.parseDouble(s);
                        double withDrawAmt=acc1.withdraw(amt);
                        System.out.println("Withdraw Amount ::"+withDrawAmt);
                        acc1.balanceEnquiry();
                        break;
                        }
             case "3" :{
                        acc1.balanceEnquiry();
                        break;
                       }
             default : System.out.println("InValid Option");
          }
          System.out.println("Do you want to continue(Yes/No):");
          option=br.readLine();

        }while(option.equalsIgnoreCase("Yes"));

    }catch(InValidAmountException ie){
        System.out.println(ie.getMessage());
    }catch(InSufficientFundsException ife){
        System.out.println(ife.getMessage());
    }catch(NumberFormatException nfe){
        System.out.println("Please,enter ONLY Number..");
    }catch(IOException e){
         e.printStackTrace();
    }


    }
}