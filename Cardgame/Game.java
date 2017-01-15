package Cardgame;
import java.util.*;

public class Game{

  private String game;
  private Deck deck;
  private ArrayList<Player> players = new ArrayList<Player>();

  public Game(String game){
    this.game = game;
    this.players = new ArrayList<Player>();
    this.deck = deck;
  }

  public String getGame(){
    return this.game;
  }
}