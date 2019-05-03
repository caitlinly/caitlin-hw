public abstract class Card{
    private String suit;

    //default constructor
    Card(){
        suit = "none";
    }

    Card(String s){
        suit = s;
    }

    //object constructor
    Card(Card ob){
        suit = ob.suit;
    }

    //getters and setters
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    abstract String value();

    @Override
    public String toString() {
        return "Card of" + getSuit();
    }
}