package com.brainacad.oop.testenum2;

public class Card {
    private Suit cardSuit;
    private Rank cardRank;

    public Suit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(Suit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public Rank getCardRank() {
        return cardRank;
    }

    public void setCardRank(Rank cardRank) {
        this.cardRank = cardRank;
    }

    public Card(Suit cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardSuitl=" + cardSuit +
                ", cardRank=" + cardRank +
                '}';
    }
}
