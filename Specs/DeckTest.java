import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class DeckTest{

  Deck deck;

  @Before
  public void before(){
    deck = new Deck("Ordinary", 52);
  }

  @Test
  public void canGetDeckType(){
    assertEquals("Ordinary", deck.getDeckType());
  }

  @Test
  public void
    canGetNumberOfCardsInDeck(){
      assertEquals(52, deck.getNumberOfCardsInDeck());
    }
}