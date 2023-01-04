package day02.workshop;

public class Card {
    private int rank;
    private int suit;
  
    public Card(int rank, int suit) {
      this.rank = rank;
      this.suit = suit;
    }
  
    public int getRank() {
      return rank;
    }
  
    public int getSuit() {
      return suit;
    }
  
    public String toString() {
      String suitString = "";
      switch (suit) {
        case 0:
          suitString = "Clubs";
          break;
        case 1:
          suitString = "Diamonds";
          break;
        case 2:
          suitString = "Hearts";
          break;
        case 3:
          suitString = "Spades";
          break;
      }
      return rank + " of " + suitString;
    }
  }
