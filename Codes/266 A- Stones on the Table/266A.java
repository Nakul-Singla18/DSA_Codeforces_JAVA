
import java.util.Scanner;

public class Stones_Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int length = s.nextInt();
        String Str = s.next();
        int count=0;
        for(int i=0;i<length-1;i++){
            if(Str.charAt(i)==Str.charAt(i+1)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
