import java.util.ArrayList;
import java.util.Collections;

import Cards.Card;

public class PlayerHand {
    public PlayerHand(Deck d) {
        ph = new ArrayList<Card>();
        for (int i = 0; i < d.size(); i++) {
            if (d.getCard(i).compareTo("Defuse")) {
                ph.add(d.getCard(i));
                d.remove(d.getCard(i));
                break;
                //Adds a defuse from a player's hand and removes it from the deck
            }
        }
        for (int i = 0; size() < 5;i++) {
            if (!(d.getCard(i).compareTo("Bomb"))){
                ph.add(d.getCard(i));
                d.remove(d.getCard(i));
                System.out.println(size());
            }


        }
    }
public int size(){
        return ph.size();
}
    public String toString() {
        String s = "";
        for (int i = 0; i < ph.size(); i++) {
            String x = Integer.toString(i+1);
            s += (x + ": " + (ph.get(i).toString()) + '\n');
        }
        return s;
    }
    public Card getCard(int pos) {
        return ph.get(pos);
    }
    public void remove(Card c) {
        ph.remove(c);
    }
    public void shuffle(){
        Collections.shuffle(ph);
    }
    public void addCard(Card c){
        ph.add(c);
    }

    private ArrayList<Card> ph;
}
