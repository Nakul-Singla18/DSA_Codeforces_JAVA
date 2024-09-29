
import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int h = s.nextInt();
        int count=0;

        for(int i=0;i<n;i++){
            int a=s.nextInt();
            // Check if the friend's height is less than or equal to the fence height
            if (a <= h) {
                count += 1; // Normal width
            } else {
                count += 2; // Bent width
            }
        }
    System.out.println(count);
    }
}
