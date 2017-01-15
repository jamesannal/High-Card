import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class CardTest{

  Cards card;
  Cards card2;

  @Before
  public void before(){
    card = new Cards(CardType.CLUBS, CardValue.KING, CardValue.KING.actualValue);
    card2 = new Cards(CardType.HEARTS, CardValue.THREE, CardValue.THREE.actualValue);
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.KING, card.getValue());
  }

  @Test
  public void canGetType(){
    assertEquals(CardType.CLUBS, card.getType());
  }

  @Test
  public void canGetActualCard(){
    assertEquals("KING OF CLUBS", card.actualCard());
  }

  @Test
  public void canSeeCardNumericValue(){
    assertEquals(10, card.getNumericValue());
  }

  @Test
  public void cardComparison() {
    assertEquals(true, card.higherCard(card2));
  }
}