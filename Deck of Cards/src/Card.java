public abstract class Card implements Comparable<Card>{
    private String suit;
    private int value;

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

    //Setting the card as a number (1-10) or a face (j,q,k,a)
    abstract int value();

    @Override
    public int compareTo(Card o){
        if(this.value > o.value){
            return 1;
        }
        else if(this.value < o.value){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Card of" + getSuit();
    }
}