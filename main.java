import java.util.*;
public class main{
  public static Game g = new Game();
  public static void main(String[] args){
    start();
  }
  public static void start(){
    System.out.println("Welcome to Uno!");
    Scanner name = new Scanner(System.in);
    System.out.println("Enter the two players:");
    String p1 = name.nextLine();
    String p2 = name.nextLine();
    Hand h1 = new Hand(p1);
    Hand h2 = new Hand(p2);
    System.out.println("Ready to start(press enter)");
    String trash = name.nextLine();
    name.close();
    System.out.println("Starting...");

  }
}
