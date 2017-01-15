import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class DealerTest{
  
  Dealer dealer;
  Deck deck;
  Player player;
  Player player2;
  Cards card;
  Cards card2;

  @Before
  public void before(){
    dealer = new Dealer();
    deck = new Deck("Ordinary", 52);
    player = new Player("James");
    player2 = new Player("Zach");
    card = new Cards(CardType.CLUBS, CardValue.KING, CardValue.KING.actualValue);
    card2 = new Cards(CardType.DIAMONDS, CardValue.ACE, CardValue.ACE.actualValue);
  }

  @Test
  public void dealerStartsWithoutDeck(){
    assertEquals(null, dealer.hasDeck());
  }

  @Test
  public void dealerCanSetupNewDeck(){
    dealer.setupDeck(deck);
    assertEquals(deck, dealer.hasDeck());
  }

  @Test
  public void dealerStartsWithNoPlayers(){
    assertEquals(0, dealer.numberOfPlayers());
  }

  @Test
  public void dealerCanInviteNewPlayer(){
    dealer.inviteNewPlayer(player);
    assertEquals(1, dealer.numberOfPlayers());
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
  public void
}