public class Player {

    private static PlayerHand playerHand;
    private static int playerNum;
    private static int turnsRemaining;
    private static int nextPlayerTurns;

    public Player(int t, Deck d) {
        playerNum = t;
        ph = new PlayerHand(d);
        nextPlayerTurns = 1;
        isDead = false;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public PlayerHand getph() {
        return ph;
    }

    public int getTurnsRemaining() {
        return turnsRemaining;
    }

    public void addTurnsRemaining(int turns){
        turnsRemaining += turns;
    }
    public int getNextPlayerTurns(){
        return nextPlayerTurns;
    }


    public void attack() {
        turnsRemaining--;

        if (getTurnsRemaining() % 2 == 1) {
            nextPlayerTurns++;
        } else {
            nextPlayerTurns += 2;
        }
    }

    public void skip() {
        turnsRemaining--;
    }

    public void nope() {

    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    private PlayerHand ph;
    private boolean isDead;
}
