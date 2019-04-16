package Tools.Time;

public class Second implements TheTicker {
    //initiate variables
    int z;

    //Constructors
    public Second(){
        z = 0;
    }

    //Getter and setter
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Second(int z) {
        this.z = z;
    }

    //return value of seconds
    public String toString(){
        if(z < 10){
            return "0"+z;
        }
        else
            return ""+z;
    }

    //increases seconds
    public void tick(){
        z++;
    }
}