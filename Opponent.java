public class Opponent
{
  private Game g;
  public Opponent(Game g){
    this.g = g;
  }
  public void play(){
    Hand oH = new Hand("Opponent");
    //move
    int move;
    int x = 0;
    while (move = -1)
    {
      if (Hand.getHand()[x].getColor() == g.getCurr.color)
      {
        move = hand[x];
      }
      if (x == hand.length && move = -1)
      {
        hand.pickup();
      }
      if (x < hand.length)
        x++;
    }
  }
}
