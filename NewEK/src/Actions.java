public class Actions {
    public static void defuse(Player p) {
        for (int i = 0; i < p.getph().size(); i++) {
            if (p.getph().getCard(i).compareTo("Defuse")) {
                p.getph().remove(p.getph().getCard(i));
                break;
            }
        }
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

}



