//Konstantinos Zois  AM 5226

abstract class Player
{
    private String name;
    private int roundsWon;

    public Player(String name)
    {
        this.name = name;
    }

    public int getRoundsWon()
    {
        return roundsWon;
    }

    public abstract int selectNumber();

    public int play(Player other)
    {
        int points = 0;
        while (points <26){
            int p1 = this.selectNumber();
            System.out.println(this + " selected " + p1);
            int p2 = other.selectNumber();
            System.out.println(other + " selected " + p2);
            points += p1 + p2;
            System.out.println(this.name + " has " + points + " points" );
        }
        return points;
    }

    public Player declareWinner(Player other)
    {
        if (this.roundsWon > other.roundsWon){
            return this;
        }
        else if (this.roundsWon < other.roundsWon){
            return other;
        }
        else{
            return null;
        }
    }
    
    public String toString()
    {
        return "Player " + name;
    }

    public void addWin()
    {
        roundsWon++;
    }
}
