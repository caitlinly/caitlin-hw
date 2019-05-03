public class NumberCard extends Card{
    int num;

    //default constructor
    NumberCard(){
        super();
        num = 1;
    }

    //parametrized constructor
    NumberCard(int n, String s){
        super(s);
        num = n;
    }

    //Object constructor
    NumberCard(NumberCard ob){
        super(ob);
        num = ob.num;
    }

    @Override
    String value(){
        return String.valueOf(num);
    }

    @Override
    public String toString() {
        return value() + " of " + getSuit();
    }
}
