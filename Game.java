public class Game{
  public Game(){

  }
  public boolean check(Card c1, Card c2){
    if(c1.getColor().equals(c2.getColor()) || c1.getNum() == c2.getNum())
      return true;
    if(c2.getAction().equals("Wild") || c2.getAction().equals("+4"))
      return true;
    if(c1.getAction().charAt(0) == '+' && c2.getAction().charAt(0) == '+')
      return true;
    return false;
  }
  public Card draw(){
    int num = (int)(Math.random() * 10);
    int c = (int)(Math.random() * 4);
    int w = (int)(Math.random() * 100);
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
    if(w > 85){
      color = "";
      action = "+4Wild";
      num = -1;
    }
    if(w > 70){
      color = "";
      action = "Wild";
      num = -1;
    }
    if(w > 60){
      action = "Reverse";
      num = -1;
    }
    if(w > 50){
      action = "Skip";
      num = -1;
    }
    if(w > 40){
      action = "+2";
      num = -1;
    }
    return new Card(color,num,action);
  }
}
