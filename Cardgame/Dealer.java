package Cardgame;
import java.util.*;

public class Dealer {
  ArrayList<Player> players;
  Deck deck;

  public Dealer(){
    this.players = new ArrayList<Player>();
    this.deck = deck;
  }

  public Deck hasDeck(){
    return this.deck;
  }

  public void setupDeck(Deck deck){
    this.deck = deck;
  }

  public int numberOfPlayers(){
    return players.size();
  }

  public void inviteNewPlayer(Player player){
    players.add(player);
  }


}