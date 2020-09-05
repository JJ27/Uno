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
  public boolean check(Card other){
    if(color.equals(other.getColor()) || n == other.getNum())
      return true;
    if(other.getAction().equals("Wild") || other.getAction.equals("+4"))
      return true;
    if(action.charAt(0).equals("+") && other.getAction.charAt(0).equals("+"))
      return true;
    return false;
  }
  public String toString(){
    if(!action.isEmpty() && !color.isEmpty())
      return action + " " + color + " " + n;
    else if(!action.isEmpty())
      return action;
    else if(action.isEmpty())
      return color + " " + n;
    return "Error";
  }
}
