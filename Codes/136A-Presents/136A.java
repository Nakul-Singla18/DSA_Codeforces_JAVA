
import java.util.Scanner;

public class GiftExchange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] p= new int[n];

        for(int i=0;i<n;i++){
            p[i]=s.nextInt();// index=giver , value = receiver
        }
       

        int[] result=new int[n];

        for(int i=0;i<n;i++){
            int giver = i+1;
            int receiver = p[i];

 //convert index=receiver , value = giver
            result[receiver-1]=giver;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        }
}
