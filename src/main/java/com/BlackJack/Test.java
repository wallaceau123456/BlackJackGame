package com.BlackJack;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) 
	{
		Deck theDeck = new Deck(1,true);
		Player player= new Player("wallace");
		
        theDeck.print(10);
        /*
        player.hit(theDeck.myNextCard());
        player.printNumber(true);
				
*/
		/*
		Scanner scanner= new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Player player1= new Player("Wallace");
		Player dealer = new Player("dealer");
		
		player1.hit(theDeck.myNextCard());
		dealer.hit(theDeck.myNextCard());
		player1.hit(theDeck.myNextCard());
		dealer.hit(theDeck.myNextCard());
		
		player1.printNumber(true);
		dealer.printNumber(false);
		
		boolean meDone= false;
		boolean dealerDone=false;
		String ans;
		
		while(!meDone || dealerDone)
		{
			if(!meDone) {
				System.out.println("Hit Or Stay? [H or S]");
				ans= scanner.next();
				System.out.println();
				if(ans == "H")
				{
					meDone= !player1.hit(theDeck.myNextCard());
					dealer.printNumber(true);

				}
				if(ans=="S")
				{
					meDone=true;
				}
			}
		}
		
		if(!dealerDone)
		{
			if(dealer.sumOfNumber()<17)
			{
				System.out.println("Dealer hit");
				dealerDone=!dealer.hit(theDeck.myNextCard());
				dealer.printNumber(false);
			}
			else {
				System.out.println("Dealer stay");
				dealerDone= true;
			}
		}

		System.out.println();
		
		scanner.close();
		
		player1.printNumber(true);
		dealer.printNumber(true);
		
		int mySum= player1.sumOfNumber();
		int dealerSum= dealer.sumOfNumber();
		
		if (mySum>dealerSum && mySum<=21 ||dealerSum >21)
        {
			System.out.println("You win");
		}
		else
		{
			System.out.println("Dealer win");
		}

		

    */
	}

}

