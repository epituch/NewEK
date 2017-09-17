package Cards;

public class Card {
    private String description;
    private String name;

    public Card(String d) {
        description = d;
        name = "Card";
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean compareTo(String cn){
        return (name.equals(cn));
    }
    public void setName(String s) {
        name = s;
    }

    public String toString() {
        return name;
    }
}
