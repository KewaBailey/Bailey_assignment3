class SavingsAccount {
  private static float annualInterestRate;
  private float savingsBalance;
  public static void main(String[] args) {
   
   
  }
  // is called in SavingAccountTest  and takes in float value of .04 or .05
  
 
  // calculates the monthly interest 
  public float calulateMontlyIntrest()
  {
    float interest = (annualInterestRate * savingsBalance)/12;
    savingsBalance = interest + savingsBalance;
    return interest;
   
  }
  // setter and getter for savings balances 
  public void setSavingBalance(float newSavingsBalance){
    this.savingsBalance = newSavingsBalance;
   
  }
  //calculates the monthly interest 
  public void modifyInterestRate(float R){
    annualInterestRate = R;
  }
  public float getSavingBalance(){
   
    return savingsBalance;
  }
 
 
 
}