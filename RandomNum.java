package Tasks;
import java.util.Random;
import java.util.Scanner;

public class RandomNum {
 static int trial=3;
 static int score=0;
    public static void main(String[] args) {
        
        Scanner next=new Scanner(System.in);
    
        System.out.println("Press '0' to start the Game");
        int input=next.nextInt();
        if(input==0){
             game();
            
             }
         else{
        System.out.println("Invalid input , Try again");
        }
          
    }

    static void game(){
        Random random =new Random();
        Scanner next=new Scanner(System.in);
        int randomNum= random.nextInt(100)+1;
       
        System.out.println("Guess a number from 1 to 100");
        System.out.println("Enter the number you have guessesd ");
        int num=next.nextInt();
        if(num==randomNum){
            score++;
            System.out.println("You guessed it right");
                          }
        else if(num>randomNum){
            System.out.println("You guessed the wrong number and it's high ");
                              } 
        else{
            System.out.println("You guessed the wrong number and it's low");
            }

             trial--;

             if(trial>0){
                System.out.println("You have "+ trial + " attempts left " );
                game();
             }

            else{
                System.out.println("You have zero attempts left");
                System.out.println("Your score is " + score);
                return;
            }
    }
}
