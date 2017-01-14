package Cardgame;
import java.util.*;

public class Deck {
  String decktype;
  int totalNumberInDeck;
  ArrayList<Cards> deck;

  public Deck(String decktype, int totalNumberInDeck){
    this.decktype = decktype;
    this.totalNumberInDeck = totalNumberInDeck;
    this.deck = new ArrayList<Cards>();
  }

  public String getDeckType(){
    return this.decktype;
  }

  public int getNumberOfCardsInDeck(){
    return this.totalNumberInDeck;
  }
  
}