public class Word {
    //Constructor
    String s;

    Word(){
        String s = null;
        if(s.endsWith(",") || s.endsWith(".")) {
            s.substring(0, s.length() - 1);
        }
    }

    Word(String s){
        this.s = s;
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
}
