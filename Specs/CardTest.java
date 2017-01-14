import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class CardTest{

  Cards card;

  @Before
  public void before(){
    card = new Cards(CardType.CLUBS, CardValue.KING);
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
}