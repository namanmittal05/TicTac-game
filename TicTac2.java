import java.util.*;
import java.lang.Math;
import java.util.Random;
/*
TicTac Game
__X_|__O_|__X_
__O_|__X_|__O_
  X |  O |  X
*/
public class TicTac{
  public static void main(String[] args) {
    Welcome.greet();
    Game start = new Game();
    start.inputName();
    Welcome.greetPlayer(start.x,start.y);
    start.Toss();
  }
}
class Welcome{
  public static void greet(){
    System.out.println("\tTicTac Game By Abhi:");
    System.out.println("\t  __X_|__O_|__X_");
    System.out.println("\t  __O_|__X_|__O_");
    System.out.println("\t    X |  O |  X");
  }
  public static void greetPlayer(String player1, String player2){
    System.out.println("Welcome" + " " + player1 + " and " + player2 + "\n" + "Have Fun!");

  }
}
class Game{
  public String x,y;
  public void inputName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name Player 1:");
    String Player1 = input.nextLine();
    System.out.println("Enter your name Player 2:");
    String Player2 = input.nextLine();
    x = Player1;
    y = Player2;
  }
  public void Toss(){
    Random rand= new Random();
    //int rand1= (int)Math.random();
    int rand1 = rand.nextInt(1);
    Scanner input= new Scanner(System.in);
    System.out.println(x + " " +"Choose either Heads or Tails");
    String answer = input.nextLine();
    System.out.println(rand1); 
    //System.out.println(rand1);
    if (rand1==0 && answer.equals("Heads")) {
      System.out.println(x + " " + "Won the toss");
    }
    else if(rand1==1 && answer.equals("Tails")){
      System.out.println(x + " " + "Won the toss");
    }
    else {
      System.out.println(y + " " + "Won the toss");
    }
    /*if (answer.equals("Heads")) {
          System.out.println("You Choose Heads");
    }
    else if (answer.equals("Tails")){
              System.out.println("You Choose Tails");
    }
    else{
        System.out.println("Wrong Choice");
    }*/
  }
  public void Choose(){
    System.out.println(x + " " + "Choose between 'X' or 'O' ");
  }
}
