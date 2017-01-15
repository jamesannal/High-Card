import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class HighCardTest{

  HighCard game;
  Deck deck;
  Player player;
  Player player2;
  Dealer dealer;
  Cards card;
  Cards card2;

  @Before
  public void before(){
    deck = new Deck("Ordinary", 52);
    player = new Player("James");
    player2 = new Player("Zach");
    dealer = new Dealer();
    game = new HighCard();
    card = new Cards(CardType.CLUBS, CardValue.KING, CardValue.KING.actualValue);
    card2 = new Cards(CardType.DIAMONDS, CardValue.ACE, CardValue.ACE.actualValue);

  }

  @Test
  public void gameStartsWithNoPlayer(){
    assertEquals(0, game.playerCount());
  }

  @Test
  public void canInvitePlayer(){
    game.inviteNewPlayer(player);
    assertEquals(1, game.playerCount());
  }

  @Test
  public void canInviteTwoPlayers(){
    game.inviteNewPlayer(player);
    game.inviteNewPlayer(player2);
    assertEquals(2, game.playerCount());
  }


  @Test
  public void dealerCanDealCardToPlayer() {
    dealer.setupDeck(deck);
    dealer.inviteNewPlayer(player);
    deck.insertCard(card);
    dealer.dealCard(player);
    assertEquals(0, deck.deckCount());
    assertEquals(1, player.cardsInHand());
    assertEquals("James", player.getPlayerName());
    assertEquals(10, card.getNumericValue());
  }

  @Test
  public void dealerCanDealCardToPlayer2() {
    dealer.setupDeck(deck);
    dealer.inviteNewPlayer(player2);
    deck.insertCard(card2);
    dealer.dealCard(player2);
    assertEquals(1, player2.cardsInHand());
    assertEquals("Zach", player2.getPlayerName());
    assertEquals(11, card2.getNumericValue());
  }

}