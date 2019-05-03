public class FaceCard extends Card{
    String face;

    //default constructor
    FaceCard(){
        super();
        face = "jack";
    }

    //parametrized constructor
    FaceCard(String f, String s){
        super(s);
        face = f;
    }

    //Object constructor
    FaceCard(FaceCard ob){
        super(ob);
        face = ob.face;
    }

    @Override
    String value(){
        return face;
    }

    @Override
    public String toString() {
        return value() + " of " + getSuit();
    }
}