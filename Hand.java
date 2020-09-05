import java.util.*;
public class Hand extends Game{
  private ArrayList<Card> hand;
  private String owner;
  public Hand(String owner){
    this.owner = owner;
    for(int i = 0; i < 7; i++){
      //Add random hand draw here
    }
  }
}
