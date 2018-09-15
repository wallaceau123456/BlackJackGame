package com.BlackJack;


public class Card 
{
   private Suits myCard;
   private int myCardNumber;
   
   /*constructor*/
   public Card(Suits suit,int cardNumber)
   {
	   this.myCard = suit;
	   
	   if(cardNumber<1 || cardNumber>13)
	   {
		  System.out.println("This " + cardNumber + " is error.");
		  System.exit(1);
	   }
	   else
	   {
	   this.myCardNumber= cardNumber;
	   }
   }
   
   public int theCardNumber()
   {
	   return myCardNumber;
   }
   
   public String toString()
   {
	   String StringOfNumber = null;
	   if(this.myCardNumber==1)
	   {
		   StringOfNumber= "Ace";
	   }
	   
	   if(this.myCardNumber==2)
	   {
		   StringOfNumber= "Two";
	   }
	   if(this.myCardNumber==3)
	   {
		   StringOfNumber= "Three";
	   }
	   if(this.myCardNumber==4)
	   {
		   StringOfNumber= "Four";

	   }
	   if(this.myCardNumber==5)
	   {
		   StringOfNumber= "Five";

	   }
	   if(this.myCardNumber==6)
	   {
		   StringOfNumber= "Six";

	   }
	   if(this.myCardNumber==7)
	   {
		   StringOfNumber= "Seven";

	   }
	   if(this.myCardNumber==8)
	   {
		   StringOfNumber= "Eight";		   

	   }
	   if(this.myCardNumber==9)
	   {
		   StringOfNumber= "Night";

	   }
	   if(this.myCardNumber==10)
	   {
		   StringOfNumber= "Ten";
	   }
	   if(this.myCardNumber==11)
	   {
		   StringOfNumber= "Jack";
	   }
	   if(this.myCardNumber==12)
	   {
		   StringOfNumber= "Queen";
	   }
	   if(this.myCardNumber==13)
	   {
		   StringOfNumber= "King";
	   }
	  
	   return StringOfNumber + " of " + myCard.toString();
	   
	   
   }
}

