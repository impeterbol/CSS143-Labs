import java.util.Arrays;
import java.util.List;

public class CharList {
    private int track;
    private char [] charArr;

    public CharList(){
        this.track = 0;
        this.charArr = new char[this.track];

    }
    public CharList(String someString){
        this.charArr = someString.toCharArray();
        this.track = this.charArr.length;
    }
    public void setCharList(int newTrack, char [] newCharArr){
        this.charArr = newCharArr;
        this.track = newTrack;
    }

    public CharList(CharList other){
        this.setCharList(other.track,other.charArr);
    }
    @Override
    public String toString(){
        String res = "";
        for(int i=0;i<this.charArr.length;i++){
            res+=this.charArr[i];
        }

        return res;
    }
    public void add(char next){

        char [] newArr = new char[this.charArr.length+1];

        if(this.charArr.length ==0){
            newArr[0] = next;
            this.setCharList(newArr.length,newArr);

        }
        else{
            for(int i =0;i<newArr.length-1;i++){
                newArr[i] = this.charArr[i];
            }
            newArr[newArr.length-1]=next;
            this.setCharList(newArr.length,newArr);
        }

    }
    public char get(int index){
        return this.charArr[index];
    }
    public int size(){
        return this.track;
    }



    public boolean equals(Object obj){
        if(obj.getClass()!=this.getClass() || obj==null){
            return false;
        }
        if(this.track == (  (CharList)obj).track &&
                this.toString().equals(  ((CharList)obj).toString() ))  {
            return true;
        }
        else{
            return false;
        }
    }

}
