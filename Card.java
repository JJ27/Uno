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
  public boolean checkCard(Card other){
    Game temp = new Game();
    return temp.check(this, other);
  }
  public String toString(){
    String fin = "";
    if(!action.isEmpty())
      fin += action + " ";
    if(!color.isEmpty())
      fin += color + " ";
    if(n >= 0)
      fin += n;
    return fin;
  }
}
