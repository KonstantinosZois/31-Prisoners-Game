//Konstantinos Zois  AM 5226

import java.util.Random;

class ComputerPlayer extends Player
{
    public ComputerPlayer(String name)
    {
        super(name);
    }

    public int selectNumber()
    {
        Random randomNumber = new Random();
        return randomNumber.nextInt(1,6);
    }

    
    /*
    public static void main(String[] args)
    {
        ComputerPlayer cp = new ComputerPlayer("Computer1");
        System.out.println(cp.selectNumber());
    }
    */
}