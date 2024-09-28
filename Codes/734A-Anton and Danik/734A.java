
import java.util.Scanner;


public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int A=0;int D=0;

        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A'){A++;}
            else{
                D++;
            }
        }
        if(D>A){
            System.out.println("Danik");

        }else if (D<A) {
            System.out.println("Anton");
        }else{
            System.out.println("Friendship");
        }
    }
}
