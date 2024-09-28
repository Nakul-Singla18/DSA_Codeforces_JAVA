
import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        for(int i=0;i<k;i++){
            if(n%10!=0){
              n-=1;  
            }else{
                n/=10;
            }
        }

        System.out.println(n);
    }
}
