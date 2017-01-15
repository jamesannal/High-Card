import static org.junit.Assert.*;
import org.junit.*;
import Cardgame.*;

public class GameTest{

  Game game;
  Deck deck;
  Player player;

  @Before
  public void before(){
    game = new Game("High Card");
    deck = new Deck("Ordinary", 52);
    player = new Player("James");

  }

  @Test
  public void canGetGame(){
    assertEquals("High Card", game.getGame());
  }
}