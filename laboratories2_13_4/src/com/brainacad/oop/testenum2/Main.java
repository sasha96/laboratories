package com.brainacad.oop.testenum2;

public class Main {
    public static void main(String[] args) {

        Card card[] = new Card[52];
        for (int i = 0; i < card.length; i++) {
            card[i] = new Card(Suit.CLUB,Rank.QUEEN);
        }
        for (Card c : card) {
            System.out.println(c);
        }
    }
}
