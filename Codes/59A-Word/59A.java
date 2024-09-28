
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.next();
        int  count =0;

        for(char c:str.toCharArray() ){
            if(Character.isUpperCase(c)){
                count ++;
            }
        }
        if(count>str.length()/2){
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
}
