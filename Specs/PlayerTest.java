import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class PlayerTest {

  Player player;
  Cards card;

  @Before
  public void before(){
    player = new Player("James");
    card = new Cards(CardType.CLUBS, CardValue.KING, 10);
  }

  @Test
  public void canGetPlayerName(){
    assertEquals("James", player.getPlayerName());
  }

  @Test
  public void playerHandStartsEmpty(){
    assertEquals(0, player.cardsInHand());
  }

  @Test
  public void playerCanBeDealtCard(){
    player.dealToPlayerHand(card);
    assertEquals(1, player.cardsInHand());

  }

}