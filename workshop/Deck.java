package day02.workshop;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() {
    // Create an ArrayList of cards, then add 52 cards to it,
    // with one of each rank and suit
    cards = new ArrayList<Card>();
    for (int suit = 0; suit <= 3; suit++) {
      for (int rank = 1; rank <= 13; rank++) {
        cards.add(new Card(rank, suit));
      }
    }
  }

  public void shuffle() {
    // Use the Collections class to shuffle the deck
    Collections.shuffle(cards);
  }

  public Card deal() {
    // Remove the first card from the deck and return it
    return cards.remove(0);
  }

  public int size() {
    // Return the number of cards left in the deck
    return cards.size();
  }
}