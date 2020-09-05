public class Card{
  private String color;
  private int n;
  private String action;
  public Card(String color, int n, String action){
    this.color = color;
    this.n = n;
    this.action = action;
  }
  public String getColor(){
    return color;
  }
  public int getNum(){
    return n;
  }
  public String getAction(){
    return action;
  }
  public static boolean check(Card other){
    if(color.equals(other.getColor()))
      return true;
  }
  public String toString(){
    return action + " " + color + " " + n;
  }
}
