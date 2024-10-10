
import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        int k = s.nextInt();
        int l= s.nextInt();
        int c= s.nextInt();
        int d= s.nextInt();
        int p= s.nextInt();
        int nl= s.nextInt();
        int np= s.nextInt();

        int count=0;

        int drink = k*l;
        int totalSlices=c*d;
        while(drink>=nl&&p>=np&&totalSlices>0){
            count++;
            drink-=nl;
            p-=np;
            totalSlices--;
        }
        System.out.println(count/n);
    }
}
