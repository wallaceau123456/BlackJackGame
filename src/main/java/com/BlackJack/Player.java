package com.BlackJack;

public class Player 
{
    private String playerName;
    
    private Card[] playerCard = new Card[10];
    
    private Card theAce;
    
    private int numOfCards;
    
    public Player(String PlayerName)
    {
    	this.playerName= PlayerName;
    	
    	this.noCard();
    }
    
    public void noCard()
    {
    	for(int c=0;c<10;c++)
    	{
    		this.playerCard[c]= null;
    	}
    this.numOfCards= 0;	
    }
    
    public boolean hit(Card newCard)
    {
    	if(this.numOfCards==10)
    	{
    		System.err.println("Cannot hit the card now.");
    		System.exit(1);
    	}
    	
    	this.playerCard[this.numOfCards]= newCard;
    	this.numOfCards= this.numOfCards+1;
    	
    	return (this.sumOfNumber()<=21);
    }
    /*
    public int AceCount()
    {
    	int Ace; 
        this.theAce.theCardNumber() = 1;
    }
   */
    public int sumOfNumber()
    {
    	int CurrentNumber= 0;
    	int AcesNum=0;
    	
    	for(int card=0;card<this.numOfCards;card++)
    	{
    		
    		if(this.playerCard[card].theCardNumber()==1)
    		{
    			CurrentNumber= CurrentNumber+11;
    			AcesNum=AcesNum+1;
    		}
    		
    		else if(this.playerCard[card].theCardNumber()>=10)
    		{
    			CurrentNumber= CurrentNumber+10; 
    		}
    		else {
    			CurrentNumber= CurrentNumber+this.playerCard[card].theCardNumber();
    		}
    	}
    	
    	while(CurrentNumber>21 && AcesNum>0)
    	{
    		CurrentNumber= CurrentNumber-=10;
    		AcesNum=AcesNum-1;
    	}
    	return CurrentNumber;
    }
    
    
    public void printNumber(boolean FirstCard)
    {
    	for (int c=0;c<this.numOfCards;c++)
    	{
    		if(c==0 && FirstCard==false)
    		{
    			System.out.println("[hidden card]");
    		}
    		else {
    			System.out.println(this.playerCard[c].toString());
    		}
    	}
    }
    
}
