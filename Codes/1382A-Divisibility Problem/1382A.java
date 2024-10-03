
import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a  = s.nextInt();
            int b = s.nextInt();

            int rem= a%b;
            int result = b-rem;
            if(rem==0){
                result=0;
            }
            System.out.println(result);
        }
    }
}
