import java.util.*;
public class Hand extends Game{
  private ArrayList<Card> hand = new ArrayList<Card>();
  private String owner;
  public Hand(String owner){
    this.owner = owner;
    Game g = new Game();
    for(int i = 0; i < 7; i++){
      hand.add(g.draw());
    }
  }
  public ArrayList<Card> getHand(){
    return hand;
  }
  public String toString(){
    String s = owner + "'s Hand:\n";
    for(Card c: hand){
      s += c + "\n";
    }
    return s;
  }
}
