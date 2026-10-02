/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Kelechi Anele
 * @studenNumber 99147724
 * @date October 2, 2026
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
             c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
             magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        //lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(9);
        luckyCard.setSuit("Hearts");

        // and search magicHand here
           boolean found = false;
        
        for (int i = 0; i < magicHand.length; i++)
        {
            if (magicHand[i].getValue() == luckyCard.getValue()
                    && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
            {
                found = true;
            }
        }


        //Then report the result here
        if (found)
        {
            System.out.println("You have the lucky card, you win!");
        }
        else
        {
            System.out.println("You do not have the lucky card, to bad you lose.");
        }

    }
    
}
