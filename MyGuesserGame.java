import java.util.*;
public class MyGuesserGame{

    static class Guesser{
        int GuesserNum;
        public int GuesserNumb(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Guesser kindly guess a number");
            GuesserNum = sc.nextInt();
            return GuesserNum;
        }
    }

    static class Player{
        int PlayerNum;
        public int PlayerNumb(){
            Scanner sc  =new Scanner(System.in);
            PlayerNum = sc.nextInt();
            return PlayerNum;
        }
    } 

    static class Umpire{
        static int Guessernum;
        int Playernum1;
        int Playernum2;
        int Playernum3;

        public static void CollectNumFromGuesser(){
            Guesser gu = new Guesser();
            Guessernum = gu.GuesserNumb();
        }
        public void CollectNumFromPlayers(){
            System.out.println("Player1 kindly guess a number");
            Player p1 = new Player();
            Playernum1 = p1.PlayerNumb();

            System.out.println("Player2 kindly guess  number");
            Player p2 = new Player();
            Playernum2 = p2.PlayerNumb();

            System.out.println("Player3 kindly guess a number");
            Player p3 = new Player();
            Playernum3 = p3.PlayerNumb();
        }

        public void compare(){
            if(Guessernum == Playernum1){
                if(Guessernum == Playernum2 && Guessernum == Playernum3){
                    System.out.println("All players won the game");
                }
                else if(Guessernum == Playernum2) {
                    System.out.println("Player 1 and PLayer2 won the game");
                }
                else if(Guessernum == Playernum3){
                    System.out.println("Player 1 and Player3 won the game");
                }
                else{
                    System.out.println("Only player 1 won the game");
                }
            }

            else if(Guessernum == Playernum2){
                if(Guessernum == Playernum3){
                    System.out.println("Player 2 and Player 3 won the game");
                }
                else{
                    System.out.println("Only Player 2 won the game");
                }
            }

            else if(Guessernum == Playernum3){
                System.out.println("Only PLayer 3 won the game");
            }
            else{
                System.out.println("All players lose the game");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--------Game Started---------");
        Umpire um = new Umpire();
        um.CollectNumFromGuesser();
        um.CollectNumFromPlayers();
        um.compare();
        System.out.println("----------Game Over----------");
    }

}