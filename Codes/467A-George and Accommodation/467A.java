
import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count =0;
        int n= s.nextInt();
        for(int i=0;i<n;i++){
            int p=s.nextInt();
            int q=s.nextInt();

            if(q-p>=2){
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}
