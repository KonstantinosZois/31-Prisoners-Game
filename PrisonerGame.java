//Konstantinos Zois  AM 5226

import java.util.Scanner;

class PrisonerGame
{
    public static void main(String[] args)
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Do you want to play 1. Human vs Computer, or 2. Computer vs Computer?");
        int gameMode = input1.nextInt();

        while (gameMode != 1 || gameMode != 2){
            if (gameMode == 1){
                HumanPlayer hp = new HumanPlayer("Human");
                ComputerPlayer cp = new ComputerPlayer("Computer");
                GameRounds game = new GameRounds(hp, cp);
                game.playRound();
                System.out.println();
                game.printScore();
                
                Scanner input2 = new Scanner(System.in);
                System.out.println("Do you want to play another round?");
                String nextRound = input2.nextLine();
                System.out.println();
                while (nextRound.equals("y") || nextRound.equals("yes")){
                    game.playRound();
                    System.out.println();
                    game.printScore();
                    System.out.println("Do you want to play another round?");
                    nextRound = input2.nextLine();
                    System.out.println();
                }
                Player winner = hp.declareWinner(cp);
                if (winner == null){
                    System.out.println("No winner");
                    break;
                }
                else{
                    System.out.println(winner + " has won the game");
                    break;
                }
            }
            else if (gameMode == 2){
                ComputerPlayer cp1 = new ComputerPlayer("Computer1");
                ComputerPlayer cp2 = new ComputerPlayer("Computer2");
                GameRounds game = new GameRounds(cp1, cp2);
                game.playRound();
                System.out.println();
                game.printScore(); 

                Scanner input2 = new Scanner(System.in);
                System.out.println("Do you want to play another round?");
                String nextRound = input2.nextLine();
                System.out.println();
                while (nextRound.equals("y") || nextRound.equals("yes")){
                    game.playRound();
                    System.out.println();
                    game.printScore();
                    System.out.println("Do you want to play another round?");
                    nextRound = input2.nextLine();
                    System.out.println();
                }
                Player winner = cp1.declareWinner(cp2);
                if (winner == null){
                    System.out.println("No winner");
                    break;
                }
                else{
                    System.out.println(winner + " has won the game");
                    break;
                }
            }
            System.out.println("Do you want to play 1. Human vs Computer, or 2. Computer vs Computer?");
            gameMode = input1.nextInt();
        }
    }
}