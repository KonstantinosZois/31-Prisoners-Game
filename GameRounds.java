//Konstantinos Zois  AM 5226

class GameRounds
{
    private Player[] players = new Player[2];
    private int first = 0;

    public GameRounds(Player player1, Player player2)
    {
        players[0] = player1;
        players[1] = player2;
    }

    public void playRound()
    {
        Player firstPlayer = players[first];
        Player lastPlayer = players[first + 1];
        System.out.println(firstPlayer + " turn");
        System.out.println();
        int fPoints = firstPlayer.play(lastPlayer);
        if (fPoints > 31){
            System.out.println(firstPlayer + " busted!");
            lastPlayer.addWin();
        }
        else if (fPoints <= 31){
            System.out.println();
            System.out.println(lastPlayer + " turn");
            System.out.println();
            int lPoints = lastPlayer.play(firstPlayer);
            if (lPoints > 31){
                System.out.println(lastPlayer + " busted!");
                firstPlayer.addWin();
            }
            else if (fPoints > lPoints){
                System.out.println(firstPlayer + " won");
                firstPlayer.addWin();
            }
            else if (lPoints > fPoints){
                System.out.println(lastPlayer + " won");
                lastPlayer.addWin();
            }
            else{
                System.out.println(firstPlayer + " won");
                firstPlayer.addWin();
            }
        }
        players[0] = lastPlayer;
        players[1] = firstPlayer;
    }

    public void printScore()
    {
        System.out.println(players[first] + ": " + players[first].getRoundsWon());
        System.out.println(players[first + 1] + ": " + players[first + 1].getRoundsWon());
    }


    /*
    public static void main(String[] args)
    {
        HumanPlayer p1 = new HumanPlayer("Human");
        ComputerPlayer p2 = new ComputerPlayer("Computer");
        GameRounds test = new GameRounds(p1, p2);
        test.playRound();
        test.printScore();

        System.out.println();

        test.playRound();
        test.printScore();
    }
    */
}