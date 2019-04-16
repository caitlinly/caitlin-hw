package Tools.Time;

public class Minute implements TheTicker {
    //initiate variables
    int y;

    //Constructors
    public Minute(){
        y = 0;
    }

    public Minute(int y) {
        this.y = y;
    }

    //Getter anf setter
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Returns the value of minutes
    public String toString(){
        if(y < 10){
            return "0"+y;
        }
        else
            return ""+y;
    }

    //Increases minutes
    public void tick(){
        y++;
    }
}