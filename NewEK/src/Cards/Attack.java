package Cards;
import Cards.Card;
public class Attack extends Card {

    public Attack()
    {
        super("Makes the targeted player draw +2 cards");
        setName("Attack");
    }

    public int getAttackedTurns(int turns)
    {
        if(turns % 2 == 1)
        {
            turns++;
        }
        else
        {
            turns+=2;
        }
        return turns;
    }

}