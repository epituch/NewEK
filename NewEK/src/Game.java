import java.util.Scanner;
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
        Player current = p4;
        p = p1;
        d.shuffle();
        int players = 4;

        while(players > 1){
            for(int i = 1; i <= 4; i++, players--){
                switch(i){
                    case 1:
                        if(!p4.isDead()){
                            current = p4;
                        }
                        else if(!p3.isDead()){
                            current = p3;
                        }//test
                        else{
                            current = p2;
                        }

                        p1.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p1;
                        break;
                    case 2:
                        if(!p1.isDead()){
                            current = p1;
                        }
                        else if(!p4.isDead()){
                            current = p4;
                        }
                        else{
                            current = p3;
                        }

                        p2.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p2;
                        break;
                    case 3:
                        if(!p2.isDead()){
                            current = p2;
                        }
                        else if(!p1.isDead()){
                            current = p1;
                        }
                        else{
                            current = p4;
                        }

                        p3.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p3;
                        break;
                    case 4:
                        if(!p3.isDead()){
                            current = p3;
                        }
                        else if(!p2.isDead()){
                            current = p2;
                        }
                        else{
                            current = p1;
                        }

                        p4.addTurnsRemaining(current.getNextPlayerTurns());
                        p = p4;
                        break;

                }
                if(!p.isDead()){
                    System.out.println(p.getph().toString());
                    System.out.println(d);
                    if(p.getTurnsRemaining() > 0){
                        System.out.println("What card do you want to play");
                        int c = s.nextInt(); s.nextLine();

                    }
                }
            }
        }
    }
}

