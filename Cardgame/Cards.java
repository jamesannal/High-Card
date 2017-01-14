package Cardgame;
import java.util.*;

public class Cards{

  private CardType type;
  private CardValue value;

  public Cards(CardType type, CardValue value) {
  this.type = type;
  this.value = value;
  }

  public CardValue getValue(){
    return this.value;
  }
  
  public CardType getType(){
    return this.type;
  }

  public String actualCard(){
    return this.value + " OF " + this.type;
  }
}

