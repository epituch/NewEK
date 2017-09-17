import Cards.*;
import Cards.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public Deck(int PlayerSize) {
        adeck = new ArrayList<Card>();
        for (int i = 0; i < PlayerSize - 1; i++) {
            Card b = new Bomb();
            adeck.add(b);
            //bombs
        }
        for (int i = 0; i < 4; i++) {
            Card cat = new Face("Catermelon");
            Card hpc = new Face("Hairy Potato Cat");
            Card tc = new Face("Taco Cat");
            Card bc = new Face("Beard Cat");
            Card sk = new Skip();
            Card a = new Attack();
            Card f = new Favor();
            Card sh = new Shuffle();
            adeck.add(sk);
            adeck.add(a);
            adeck.add(f);
            adeck.add(sh);
            adeck.add(cat);
            adeck.add(hpc);
            adeck.add(tc);
            adeck.add(bc);
            //face cards, skips, attack, favours, shuffles


        }
        for (int i = 0; i < 5; i++) {
            Card d = new Defuse();
            Card n = new Nope();
            Card stf = new SeeTheFuture();
            adeck.add(d);
            adeck.add(n);
            adeck.add(stf);
            //See the future, Cards.Nope, Cards.Defuse
        }
        shuffle();
    }

    public void add(Card c) {
        adeck.add(c);
    }

    public void remove(Card c) {
        adeck.remove(c);
    }

    public Card getCard(int pos) {
        return adeck.get(pos);
    }

    public Card getcardtop() {
        return adeck.get(0);
    }

    public ArrayList<Card> gettop3() {
        ArrayList<Card> cl = new ArrayList<Card>();
        for (int i = 0; i < 3; i++) {
            cl.add(adeck.get(i));
        }
        return cl;
    }

    public int size() {
        return adeck.size();
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < adeck.size(); i++) {
            s += ((adeck.get(i).toString()) + '\n');
        }
        return s;
    }

    public void shuffle() {
        Collections.shuffle(adeck);
    }

    private ArrayList<Card> adeck;

}


