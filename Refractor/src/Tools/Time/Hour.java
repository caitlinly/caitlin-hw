package Tools.Time;

public class Hour implements TheTicker {
    //initiate variables
    private int x;

    //Constructors
    Hour(){
        x = 0;
    }

    public Hour(int x){
        this.x = x;
    }

    //Getter and setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //Returns the value of hour
    public String toString(){
        if(x < 10){
            return "0"+x;
        }
        else
            return ""+x;
    }

    //Increases hour
    public void tick(){
        x++;
    }
}