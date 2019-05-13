public class FaceCard extends Card{
    String face;
    int v;

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
    int value(){
        if (face.equals("jack")){
            v = 11;
        }
        else if(face.equals("queen")){
            v = 12;
        }
        else if(face.equals("king")){
            v = 13;
        }
        else if(face.equals("ace")){
            v = 1;
        }
        return v;
    }

    @Override
    public String toString() {
        return value() + " of " + getSuit();
    }
}