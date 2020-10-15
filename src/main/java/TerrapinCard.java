public class TerrapinCard {
  private double balance;

  public TerrapinCard(double balance){
    this.balance=balance;
  }

  public String toString(){
    return "The card has " + this.balance + " dollars";
  }

}
