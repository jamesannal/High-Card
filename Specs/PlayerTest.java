import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class PlayerTest {

  Player player;
  Cards card;

  @Before
  public void before(){
    player = new Player("James");
    card = new Cards(CardType.CLUBS, CardValue.KING);
  }

  @Test
  public void canGetPlayerName(){
    assertEquals("James", player.getPlayerName());
  }
}