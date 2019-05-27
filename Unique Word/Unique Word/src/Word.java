public class Word {
    //Constructor
    String s;

    Word(){
        String s = null;
    }

    Word(String s){
        this.s = s.toLowerCase();
        if(s.endsWith("[^\"")){
            this.s = s.substring(0,s.length()-1);
        }
        if(s.endsWith(".") || s.endsWith(",") || s.endsWith(";") || s.endsWith("-")){
            this.s = s.substring(0,s.length()-1);
        }
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
