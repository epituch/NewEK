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
        Player p;
        Player p1 = new Player(1, d, "p1");
        Player p2 = new Player(2, d, "p2");
        Player p3 = new Player(3, d, "p3");
        Player p4 = new Player(4, d, "p4");
        Player current = p4;
        Player defender = p4;
        p = p1;
        d.shuffle();
        int players = 4;

        while (players > 1) {
            for (int i = 1; i <= 4; i++, players--) {
                switch (i) {
                    case 1:
                        if (!p4.isDead()) {
                            current = p4;
                        } else if (!p3.isDead()) {
                            current = p3;
                        } else {
                            current = p2;
                        }

                        p1.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p1;
                        current = p1;
                        break;
                    case 2:
                        if (!p1.isDead()) {
                            current = p1;
                        } else if (!p4.isDead()) {
                            current = p4;
                        } else {
                            current = p3;
                        }

                        p2.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p2;
                        current = p2;
                        break;
                    case 3:
                        if (!p2.isDead()) {
                            current = p2;
                        } else if (!p1.isDead()) {
                            current = p1;
                        } else {
                            current = p4;
                        }

                        p3.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p3;
                        current = p3;
                        break;
                    case 4:
                        if (!p3.isDead()) {
                            current = p3;
                        } else if (!p2.isDead()) {
                            current = p2;
                        } else {
                            current = p1;
                        }

                        p4.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p4;
                        current = p4;
                        break;

                }
                if (!p.isDead()) {
                    System.out.println(p.getph().toString());
                    while (p.getTurnsRemaining() > 0) {
                        System.out.println("What card do you want to play " +  p.toString() + " " + p.getTurnsRemaining() + " turn(s) left\nEnter D if you wish to draw a card and end your turn");
                        String ca = s.nextLine();
                        if (ca == "D"){

                            //take the next card in the stack

                            p.getph().addCard(d.getcardtop());
                            d.remove(d.getcardtop());
                        }
                        else{
                            int c = Integer.parseInt(ca);
                            //

                            Card used = current.getph().getCard(c - 1);
                            //use the nope here

                            Actions.actions(current, used, d);

                            //check face
                            if (used.compareTo("Face")) {
                                System.out.println("Please Enter who you would like to attack");
                                int playerNum = s.nextInt();
                                s.nextLine();
                                switch (playerNum) {
                                    case 1:
                                        defender = p1;
                                    case 2:
                                        defender = p2;
                                    case 3:
                                        defender = p3;
                                    case 4:
                                        defender = p4;
                                        Actions.face(current, defender, used);
                                }
                            }
                            //check favor
                            if (used.compareTo("Favor")) {
                                System.out.println("Please Enter who you would like to attack");
                                int playerNum = s.nextInt();
                                s.nextLine();
                                switch (playerNum) {
                                    case 1:
                                        defender = p1;
                                    case 2:
                                        defender = p2;
                                    case 3:
                                        defender = p3;
                                    case 4:
                                        defender = p4;
                                        Actions.favor(current, defender);
                                }
                                //end nope
                                current.getph().remove(used);


                            }
                        }

                    }
                }
            }
        }
    }
}
