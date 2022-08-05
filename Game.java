import java.util.Random;
public class Game{
  private Card current;
  public Game(){
    this.current = draw();
  }
  public Card getCurr(){
    return current;
  }
  public void setCurr(Card c){
    this.current = c;
  }
  public boolean check(Card c1, Card c2){
    if((c1.getColor().equals(c2.getColor()) && (!c1.getColor().isEmpty())) || c1.getNum() == c2.getNum())
      return true;
    if(c2.getAction().equals("Wild") || c2.getAction().equals("+4"))
      return true;
    /*if(c1.getAction().charAt(0) == '+' && c2.getAction().charAt(0) == '+')
      return true;*/
    return false;
  }
  public Card draw(){
    Random rand = new Random();
    int num = rand.nextInt(9) + 1;
    int c = rand.nextInt(3) + 1;
    int w = rand.nextInt(100) + 1;
    String color = "";
    String action = "";
    switch(c){
      case 0:
        color = "Red";
        break;
      case 1:
        color = "Blue";
        break;
      case 2:
        color = "Green";
        break;
      case 3:
        color = "Yellow";
        break;
      default:
        System.out.println("Error in Color Draw!");
    }
    if(w > 90){
      color = "";
      action = "+4Wild";
      num = -1;
    }
    else if(w > 80){
      color = "";
      action = "Wild";
      num = -1;
    }
    else if(w > 70){
      action = "Reverse";
      num = -1;
    }
    else if(w > 60){
      action = "Skip";
      num = -1;
    }
    else if(w > 50){
      action = "+2";
      num = -1;
    }
    return new Card(color,num,action);
  }
}
