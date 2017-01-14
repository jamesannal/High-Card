import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class DealerTest{
  
  Dealer dealer;
  Deck deck;
  Player player;

  @Before
  public void before(){
    dealer = new Dealer();
    deck = new Deck("Ordinary", 52);
    player = new Player("James");
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


}