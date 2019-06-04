public class Word {
    //Constructor
    String s;

    Word(){
        String s = null;
    }

    Word(String s){
        this.s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if( o instanceof Word){
            Word temp = (Word)o;
            if(this.s.equals(temp.s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return s;
    }
}