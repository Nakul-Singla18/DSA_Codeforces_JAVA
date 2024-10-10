
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        for(int i=0;i<n;i++){
            int a= s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();

            if(a+b==c||b+c==a||c+a==b){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
        
    }
}
