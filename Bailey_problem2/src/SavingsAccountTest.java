

class SavingsAccountTest {
  public static void main(String[] args) {
    //create 2 variables from the object SavingsAccount
	SavingsAccount accOne = new SavingsAccount();
    SavingsAccount accTwo = new SavingsAccount();
   
     accOne.modifyInterestRate(0.04f);
     accOne.setSavingBalance(2000);
   
     accTwo.modifyInterestRate(0.04f);
     accTwo.setSavingBalance(3000);
     //for loop that call the calculateMontlyInterest methods for both accounts and prints each balance monthly
     for (int i = 1; i < 13; i++) {
       accOne.calulateMontlyIntrest();
       System.out.print("Savings account one on month " + i + " is " + accOne.getSavingBalance() + " Dollars ") ;
     
       accTwo.calulateMontlyIntrest();
       System.out.println("Savings account two on month " + i + " is " + accTwo.getSavingBalance()+ " Dollars ");

    }
   
   
       accOne.modifyInterestRate(0.05f);
       accOne.setSavingBalance(2000);
    
       accTwo.modifyInterestRate(0.05f);
       accTwo.setSavingBalance(3000);
   
       accOne.calulateMontlyIntrest();
       System.out.println("SavingsAccountOne's next month interest is " + accOne.getSavingBalance()+ " Dollars") ;
       accTwo.calulateMontlyIntrest();
       System.out.println("SavingsAccountTwo's next month interest is " + accTwo.getSavingBalance()+ " Dollars") ;
   
   
   

   
   
  }
}
