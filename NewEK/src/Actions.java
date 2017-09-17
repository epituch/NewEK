import Cards.Card;
import java.util.Scanner;
public class Actions {
    public static void defuse(Player p) {
        for (int i = 0; i < p.getph().size(); i++) {
            if (p.getph().getCard(i).compareTo("Defuse")) {
                p.getph().remove(p.getph().getCard(i));
                return;
            }
        }
        p.setDead(true);
    }

    public static void randGrab(Player attacker, Player defender) {
        defender.getph().shuffle();
        attacker.getph().addCard(defender.getph().getCard(0));
    }

    public static void face(Player p, Player p2, Card c) {
        for(int i = 0; i<p.getph().size(); i++){
            if(c.compareTo(p.getph().getCard(i).toString())){
                p.getph().remove(p.getph().getCard(i));
            }
        }
        randGrab(p,p2);
    }

    public static void favor(Player a, Player d) {
        randGrab(a, d);
    }

    public static void attack(Player p) {
        p.attack();
    }

    public static void skip(Player p) {
        p.skip();
    }

    public static void shuffle(Deck d) {
        d.shuffle();
    }

    public static void seeTheFuture(Deck d) {
        d.gettop3();
    }

    public static void actions(Player p, Card c, Deck d) {

        if (c.compareTo("Bomb")) {
            defuse(p);
        } else if (c.compareTo("Shuffle")) {
            d.shuffle();
        } else if (c.compareTo("Attack")) {
            p.attack();
        } else if (c.compareTo("See The Future")) {
            System.out.println(d.gettop3());
        } else if (c.compareTo("Skip")) {
            p.skip();
        }
    }
}



