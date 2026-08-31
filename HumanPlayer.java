//Konstantinos Zois  AM 5226

import java.util.Scanner;
import java.util.InputMismatchException;

class HumanPlayer extends Player
{
    public HumanPlayer(String name)
    {
        super(name);
    }

    public int selectNumber()
    {
        Scanner input = new Scanner(System.in);
        int selectedNumber = 0;
        boolean done = false;

       while (!done){
           try
           {
               if (selectedNumber < 1 || selectedNumber >5){
                System.out.println("Give a number between 1 and 5: ");
                selectedNumber = input.nextInt(); 
               }
               else{
                   done = true;
               }
           }
           catch(InputMismatchException e)
           {
                input.nextLine();
           }
       }
       return selectedNumber;
    }


    /*
    public static void main(String[] args)
    {
        HumanPlayer player = new HumanPlayer("Human");
        int test = player.selectNumber();
        System.out.println(test);
    }
    */
}