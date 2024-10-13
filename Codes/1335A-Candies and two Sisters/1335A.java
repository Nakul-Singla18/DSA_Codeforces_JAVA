
import java.util.Scanner;

public class Candies_Two_Sister {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for(int i=0;i<t;i++){
            long n=s.nextLong();
           
            long result = (n-1)/2;
            System.out.println(result);
            
        }
        s.close();
    }
}
