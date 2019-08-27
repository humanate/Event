import com.hgy.event.Event;

public class Application {

  public static void main(String[] args) {
    Event firstCoin = new Event("first coin man up", 0.5f);
    Event secondCoin = new Event("second coin man up", 0.5f);
    Event thirdCoin = new Event("third coin man up", 0.5f);
    System.out.println(firstCoin.and(secondCoin).showProbability());
    System.out.println(firstCoin.not(secondCoin).showProbability());
    System.out.println(firstCoin.or(secondCoin).showProbability());
    System.out.println(firstCoin.and(secondCoin).and(thirdCoin).showProbability());
  }
}
