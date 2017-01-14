import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class DeckTest{

  Deck deck;
  Cards card;

  @Before
  public void before(){
    deck = new Deck("Ordinary", 52);
    card = new Cards(CardType.CLUBS, CardValue.KING);
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

  @Test
  public void deckIsEmptyToStart(){
      assertEquals(0, deck.deckCount());
  }

  @Test
  public void canAddCard(){
    deck.insertCard(card);
    assertEquals(1, deck.deckCount());
  }

  @Test
  public void canRemoveCard(){
    deck.insertCard(card);
    deck.removeCard(0);
    assertEquals(0, deck.deckCount());
  }
}