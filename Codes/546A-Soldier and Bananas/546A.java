
import java.util.Scanner;

public class Soldier_Bananas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();//Cost of first banana
        int n = s.nextInt();// Initial Money 
        int w = s.nextInt();// No. of Bananas

        int TotalCost = TotalMoney(w, k);

        int RequiredMoney = Math.max(0,TotalCost-n);//As soldier dont neet negative money
        System.out.println(RequiredMoney);

    }

    public static int TotalMoney(int w,int k){
        int sum=0;
        for(int i=1;i<=w;i++){
            sum = sum+i*k;
        }
        return sum;
    }


}
