package Cards;
import Cards.Card;
import java.util.*;
public class Bomb extends Card {

   private Random ran = new Random();


    public Bomb()
    {
        super("BOOM!");
setName("Bomb");
    }

    public int putBombBack()
    {
        return(1);
    }
}
