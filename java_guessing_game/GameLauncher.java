
public class GameLauncher{

    public static void main(String[] args){
        GuessGame game=new GuessGame();
        game.StartGame();
    }
}

class GuessGame{
    Player one;
    Player two;
    Player three;
    public void StartGame(){
        one=new Player();
        two= new Player();
        three=new Player();
        //the declaration of three variables to hold the guesses of the player

        int guess_one=0; 
        int guess_two=0;
        int guess_three=0;
        // declare three variables to hold a true or false based on the player's response
       
        boolean one_right=false;
        boolean two_right=false;
        boolean three_right=false;

        int target_number=(int)(Math.random()*10);
        System.out.println("I am thinking of a number between 0 and 9...");
        while (true){
          System.out.println("the target number to be guessed  is "+ target_number);
            // calling each player's guess method
            one.guess();
            two.guess();
            three.guess();

          
            guess_one=one.number;
            System.out.println("player one guessed "+guess_one);
          
            guess_two=two.number;
            System.out.println("player two guessed "+guess_two);
          
            guess_three=three.number;
            System.out.println("player three guessed "+guess_three);
          
            if (guess_one==target_number){
                one_right=true;
            
            }
            if (guess_two==target_number){
                two_right=true;
            }
            if (guess_three==target_number){
                three_right=true;
            }
            if (one_right || two_right || three_right){
               
                System.out.println("we actually have a winnner");
               
                System.out.println("player one got it right ?"+one_right);
               
               
                System.out.println("player two got it right ?"+two_right);
               
                System.out.println("player three got it right ?"+three_right);
                break;

            }
            
            else{
                    System.out.println("the players will have to play this game again");
            }
        }


    }
}




class Player{
    int number=0;//where the player's guessed number goes 
    public void guess(){
        number=(int)(Math.random()*10);
        
    }

}



