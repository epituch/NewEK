import java.util.Scanner;
import Cards.Card;
public class Game {
    public static void main(String args[]) {
        Game game = new Game();
        game.run();
    }

    public static void run() {
        Scanner s = new Scanner(System.in);
        Deck d = new Deck(4);
        System.out.println(d);
        Player p;
        Player p1 = new Player(1, d);
        Player p2 = new Player(2, d);
        Player p3 = new Player(3, d);
        Player p4 = new Player(4, d);
        p = p1;
        d.shuffle();
        int players = 4;
        while (players > 1) {
            for (int i = 1; i <= 4; i++, players--) {
                switch (i) {
                    case 1:
                        p1.addTurnsRemaining(p4.getNextPlayerTurns());
                        p = p1;
                        break;
                    case 2:
                        p2.addTurnsRemaining(p1.getNextPlayerTurns());
                        p = p2;
                        break;
                    case 3:
                        p3.addTurnsRemaining(p2.getNextPlayerTurns());
                        p = p3;
                        break;
                    case 4:
                        p4.addTurnsRemaining(p3.getNextPlayerTurns());
                        p = p4;
                        break;
                }
                if (!p.isDead()) {
                    System.out.println(p.getph().toString());
                    if (p.getTurnsRemaining() > 0) {
                        if (p.getph().size() > 0) {
                            System.out.println("What card do you want to play");
                            int c = s.nextInt();
                            s.nextLine();
                            Card ca = p.getph().getCard(c);


                        }
                    }
                }
            }
        }
    }
}