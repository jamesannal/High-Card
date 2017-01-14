package Cardgame;
import java.util.*;

public class Player {

  String name;
  ArrayList<Cards> hand;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Cards>();
  }

  public String getPlayerName(){
    return this.name;
  }

  public int cardsInHand(){
    return hand.size();
  }

  public void dealToPlayerHand(Cards card){
    hand.add(card);
  }

}