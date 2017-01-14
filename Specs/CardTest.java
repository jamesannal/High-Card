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
}