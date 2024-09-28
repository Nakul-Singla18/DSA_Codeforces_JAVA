
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        String s2= s.next();
        int l=s1.length();

        if(l!=s2.length()){
            System.out.println("NO");
            return;
        }

        for(int i =0;i<l;i++){
           if(s1.charAt(i)!=s2.charAt(l-i-1)){
            System.out.println("NO");
            return;
           }
        }

        System.out.println("YES");
    }
}
