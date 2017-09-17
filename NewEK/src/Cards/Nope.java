package Cards;

import Cards.Card;

import java.util.Scanner;

public class Nope {

    private boolean nope = false;

    public boolean Nope() {
        String no;
        int pnum;
        while (true) {
            setName("Nope");
            System.out.println("Does anyone want to play a nope? y/n");
            Scanner scan = new Scanner(System.in);
            no = scan.next();
            no = no.toLowerCase();
            if (no.equals(y)) {
                System.out.println("Who is playing it?");
                pnum = scan.nextInt();
                switch (pnum) {
                    case 1:
                        for (int i = 0; i < p1.getph().size(); i++) {
                            if (c.compareTo("Nope")) {
                                p1.getph().remove(p1.getph().getCard(i));
                                nope = !nope;
                                break;
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < p2.getph().size(); i++) {
                            if (c.compareTo("Nope")) {
                                p2.getph().remove(p2.getph().getCard(i));
                                nope = !nope;
                                break;
                            }
                        }
                        break;
                    case 3:
                        for (int i = 0; i < p3.getph().size(); i++) {
                            if (c.compareTo("Nope")) {
                                p3.getph().remove(p3.getph().getCard(i));
                                nope = !nope;
                                break;
                            }
                        }
                        break;
                    case 4:
                        for (int i = 0; i < p4.getph().size(); i++) {
                            if (c.compareTo("Nope")) {
                                p4.getph().remove(p4.getph().getCard(i));
                                nope = !nope;
                                break;
                            }
                        }
                        break;
                }
            } else {
                return nope;
            }
        }
    }


}
