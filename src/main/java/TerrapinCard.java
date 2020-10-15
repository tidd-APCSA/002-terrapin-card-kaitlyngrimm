public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance){
    this.balance=balance;
  }

  public String toString(){
    if(this.balance>=150){
      return "The card has 150.0 dollars";
    } else{
    return "The card has " + this.balance + " dollars";
    }
  }

  public void payEconomical(){
    if(this.balance>= 2.5){
    this.balance= balance-2.50;
    }
  }

  public void payGourmet(){
    if(this.balance>= 4){
    this.balance= balance-4;
    }
}

public void loadMoney(double amount){
  if(amount>=0){
  this.balance= balance+ amount;
  }
}

public double getBalance(){
  return this.balance();
}

}
