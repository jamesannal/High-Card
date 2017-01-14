import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class DealerTest{
  
  Dealer dealer;
  Deck deck;
  Player player;
  Cards card;

  @Before
  public void before(){
    dealer = new Dealer();
    deck = new Deck("Ordinary", 52);
    player = new Player("James");
    card = new Cards(CardType.CLUBS, CardValue.KING);
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

  }
}