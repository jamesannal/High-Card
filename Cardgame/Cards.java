package Cardgame;
import java.util.*;

public class Cards{

  private CardType type;
  private CardValue value;
  private int actualValue;

  public Cards(CardType type, CardValue value, int actualValue) {
  this.type = type;
  this.value = value;
  this.actualValue = actualValue;
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

  public int getNumericValue(){
    return this.actualValue = actualValue;
  }

  public boolean higherCard(Cards card) {
    if(card.getNumericValue() > this.getNumericValue()){
      return false;
    }
    return true;
  }
}

