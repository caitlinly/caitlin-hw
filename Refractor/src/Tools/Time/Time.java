package Tools.Time;

public class Time implements TheTicker {
    //initiate variables
    private Hour hr;
    private Minute min;
    private Second sec;

    //Constructors
    public Time(){
        hr = new Hour();
        min = new Minute();
        sec = new Second();

    }
    public Time(int hr, int min, int sec){
        this.hr = new Hour(hr);
        this.min = new Minute(min);
        this.sec = new Second(sec);
    }
    public Time(Time time){
        this.hr = time.hr;
        this.min = time.min;
        this.sec = time.sec;
    }

    //Getters and setters
    public Hour getHr() {
        return hr;
    }

    public void setHr(Hour hr) {
        this.hr = hr;
    }

    public Minute getMin() {
        return min;
    }

    public void setMin(Minute min) {
        this.min = min;
    }

    public Second getSec() {
        return sec;
    }

    public void setSec(Second sec) {
        this.sec = sec;
    }

    //Method tick: increases time
    public void tick(){
        if(sec.getZ() == 59){
            if(min.getY() == 59){
                if(hr.getX() == 23){
                    hr.setX(0);
                    min.setY(0);
                    sec.setZ(0);
                }
                else{
                    hr.tick();
                    min.setY(0);
                    sec.setZ(0);
                }
            }
            else{
                min.tick();
                sec.setZ(0);
            }
        }
        else{
            sec.tick();
        }
    }

    //Returns time in 24 hour format
    public String toString(){
        return hr.toString()+":"+min.toString()+":"+sec.toString();
    }
}