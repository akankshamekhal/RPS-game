package tech;

import java.util.Scanner;

class Player
{
	String pName;
	int pScore;
	public void setName(String name)
	{
		pName = name;
		
	}
	public String getName()
	{
		return pName;
	}
	public void setScore(int score)
	{
		pScore = score;
		
	}
}
public class Main
{

    public static  void main(String[] args)
    {
 
        Player player1 = new Player();
        Player player2 = new Player();
 
        String name;
        String playagain;
        int firstUserScore =0;
        int secondUserScore =0;
        char playAgainOrNot;
 
        Scanner keyboard = new Scanner(System.in);
 
        //player 1 name
        System.out.println("\t\t\twelcome to the Guess Number Game(Rock,paper,Scissros).");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\nInstruction");
        System.out.println("\tRock,paper,scissors which will allow two players to play with each other follows the basic rules of the game where:");
        System.out.println("\t\t\t\t1.Rocks defects(breaks) scissors.");
        System.out.println("\t\t\t\t2.scissors defects(cuts) paper.");
        
        System.out.println("\t\t\t\t3.paper defects(covers) Rock.");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("\nPlease enter name of your player 1");
        
        name= keyboard.next();
        player1.setName(name);
 
        //player 2 name
        System.out.println("Please enter name of your player 2");
        name = keyboard.next();
        player2.setName(name);
 
 
        do
        {
            
            System.out.println("What you would like to play? " + player1.getName());
            System.out.println("Rock, paper, or scissors ");
 
          
            String user1Input = keyboard.next();
            user1Input = user1Input.toUpperCase();
 
            System.out.println("What you would like to play? " + player2.getName());
            System.out.println("Rock, paper, or scissors ");
 
            // Get the user input
            String user2Input = keyboard.next();
            user2Input = user2Input.toUpperCase();
 
            //Getting the first letter
            char firstLetterUser1 = user1Input.charAt(0);
            char secondLetterUser2 = user2Input.charAt(0);
 
            //if the users choices are both equal
            if(firstLetterUser1 == secondLetterUser2)
            {
                System.out.println(player1.getName() +" chose  " + user1Input);
                System.out.println(player2.getName() + " chose  " + user2Input);
 
                System.out.println("It's a tie!");
 
                firstUserScore++;
                secondUserScore++;
 
                player1.setScore(firstUserScore);
                player2.setScore(secondUserScore);
            }//if
 
            //if the users choices are not equal
            else if (firstLetterUser1 != secondLetterUser2)
            {
                //rock breaks scissors
                if(firstLetterUser1 == 'R' && secondLetterUser2 == 'S')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player1.getName() + " wins!");
 
                    firstUserScore++;
                    player1.setScore(firstUserScore);
 
                }//if
 
                else if (secondLetterUser2 == 'R' && firstLetterUser1 == 'S')
                {
                    System.out.println(player1.getName() +" chose " + user1Input);
                    System.out.println(player2.getName() + " chose " + user2Input);
 
                    System.out.println(player2.getName() + " wins!");
 
                    secondUserScore++;
                    player2.setScore(secondUserScore);
 
                }
 
                //paper covers rock
                else if (firstLetterUser1 == 'P' && secondLetterUser2 == 'R')
                {
                    System.out.println(player1.getName() +" chose " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player1.getName() + " wins!");
 
                    firstUserScore++;
                    player1.setScore(firstUserScore);
                }
 
                else if (secondLetterUser2 == 'P' && firstLetterUser1 == 'R')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose " + user2Input);
 
                    System.out.println(player2.getName() + " wins!");
 
                    secondUserScore++;
                    player2.setScore(secondUserScore);
                }//else if
 
 
                //scissors cut paper
                else if (firstLetterUser1 == 'S' && secondLetterUser2 =='P')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player1.getName() + " wins!");
 
                    firstUserScore++;
                    player1.setScore(firstUserScore);
                }
 
                else if (secondLetterUser2 == 'S' && firstLetterUser1 == 'P')
                {
                    System.out.println(player1.getName() +" chose  " + user1Input);
                    System.out.println(player2.getName() + " chose  " + user2Input);
 
                    System.out.println(player2.getName() + " wins!");
 
                    secondUserScore++;
                    player2.setScore(secondUserScore);
                }//else if
 
            }//else if
 
            System.out.println("\nWould you like to play again " + player1.getName() + " and " + player2.getName());
            System.out.println("Please enter Y/N");
            playagain = keyboard.next();
            playagain = playagain.toUpperCase();
            playAgainOrNot = playagain.charAt(0);
 
        }//do
 
        //keep the loop running while the user enter Y
        while (playAgainOrNot == 'Y');
   System.out.println("\n\nSee you again!!!!!!!!!");
 
    }
}