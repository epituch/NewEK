public enum CardNumbers {
    DEFUSE(1),
    BOMB(2),
    SHUFFLE(3),
    SKIP(4),
    ATTACK(5),
    SEE_THE_FUTURE(6),
    NOPE(7),
    FAVOR(8),
    TACOCAT(9),
    RAINBOW_RALPHING_CAT(10),
    HAIRY_POTATO_CAT(11),
    CATTERMELON(12),
    BEARD_CAT(13);

    private int num;

    CardNumbers(int number){
        num = number;
    }

    public int getNum(){
        return num;
    }
}
