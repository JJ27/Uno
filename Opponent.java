import Hand;

public class Opponent
{
  public static void main (String[]args)
  {
    Hand hand;
    //move
    Card move = -1;
    int x = 0;
    while (move = -1)
    {
      if (hand[x].color == topcard.color)
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
