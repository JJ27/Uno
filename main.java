import java.util.*;
public class main{
  public static Game g = new Game();
  public static String p1;
  public static String p2;
  public static Hand h1 = new Hand();
  public static Hand h2 = new Hand();
  public static boolean win = false;
  public static void main(String[] args){
    start();
    play();
  }
  public static void start(){
    System.out.println("Welcome to Uno!");
    Scanner name = new Scanner(System.in);
    System.out.println("Enter the two players:");
    p1 = name.nextLine();
    p2 = name.nextLine();
    System.out.println("Ready to start(press enter)");
    String trash = name.nextLine();
    System.out.println("Starting...");
    confirm("Press enter to view " + p1 + "'s hand");
    System.out.println(h1);
    confirm("Done?");
    switchView();
    confirm("Press enter to view " + p2 + "'s hand");
    System.out.println(h2);
    confirm("Done?");
    switchView();
    System.out.println("Starting game!");
  }
  public static void confirm(String s){
    System.out.println(s);
    Scanner z = new Scanner(System.in);
    String tra = z.nextLine();
  }
  public static void switchView(){
    for(int i = 0; i < 50; i++){
      System.out.println();
    }
  }
  public static void play(){
    System.out.println("Top Card:" + g.getCurr());
    confirm("Ready " + p1 + "?");
    int turn = 1;
    while(!win){
      if(turn == 1){
        playp1();
        turn = 2;
        switchView();
      }
      else if(turn == 2){
        playp2();
        turn = 1;
        switchView();
      }
      else{
        System.out.println("Error!");
      }
      if(h1.checkfinal()){
        System.out.println(p1 + " has won the game!");
        win = true;
      }
      if(h2.checkfinal()){
        System.out.println(p1 + " has won the game!");
        win = true;
      }
    }
  }
  public static void playp1(){
    System.out.println(p1 + " Top Card:" + g.getCurr());
    System.out.println(h1);
    System.out.println("Select which card to play:");
    System.out.println("Type in -1 to draw a card");
    Scanner use = new Scanner(System.in);
    int z = use.nextInt();
    if(z == -1){
      System.out.println(h1.drawCard());
      confirm("Saw your card?");
      return;
    }
    if(g.getCurr().checkCard(h1.use(z))){
        g.setCurr(h1.use(z));
        h1.remove(z);
    } else{
      System.out.println("Card does not work!");
      playp1();
    }
  }
  public static void playp2(){
    System.out.println(p2 + " Top Card:" + g.getCurr());
    System.out.println(h2);
    System.out.println("Select which card to play:");
    System.out.println("Type in -1 to draw a card");
    Scanner use = new Scanner(System.in);
    int z = use.nextInt();
    if(z == -1){
      System.out.println(h2.drawCard());
      confirm("Saw your card?");
      return;
    }
    if(g.getCurr().checkCard(h2.use(z))){
        g.setCurr(h2.use(z));
        h2.remove(z);
    }
    else{
      System.out.println("Card does not work! + \n");
      playp2();
    }
  }
}
