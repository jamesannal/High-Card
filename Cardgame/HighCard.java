package Cardgame;
import java.util.*;

public class HighCard{

  Dealer dealer;
  private ArrayList<Player> players;
  Deck deck;
  ArrayList<Integer> score;

  public HighCard(){
    this.dealer = dealer;
    this.players = new ArrayList<Player>();
    this.deck = deck;
  }

  public void inviteNewPlayer(Player player){
    players.add(player);
  }

  public int playerCount(){
    return players.size();
  }

  public void dealCard(Player player){
    Cards dealtCard = deck.removeCard(0);
    player.dealToPlayerHand(dealtCard); 
  }

  // public void checkWinner(Player players){
  //   Cards cardA = dealer.dealCard(card);
  //   Cards cardB = dealer.dealCard(card);
    

  //   if (cardA.higherCard(cardB)){
  //     System.out.println("Player1 wins!");
  //   }
  //   else{
  //     System.out.println("Player2 wins!");
  //   }
  // }



  // public void checkScore(int Integer, Cards card){
  //   for(int i = 0; i < Integer; i++){
  //     for (Cards card : cards){

  //     }
  //       Player player :players){
  //       dealCard(player);
  //     }
  //   }
  // }

  // public ArrayList<Integer> getScore(){
  //   ArrayList<Player> players = new ArrayList<>(dealer.inviteNewPlayer());
  //   ArrayList<Integer> score = new ArrayList<Integer>();
  //   for (Player player : players){
  //     score.add(player.getNumericValue());
  //   }
  //   return score;
    
  // }


}