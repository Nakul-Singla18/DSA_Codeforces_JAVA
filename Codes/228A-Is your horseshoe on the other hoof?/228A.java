
import java.util.Scanner;

public class HorseShoe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        int count=0;

        for(int i=0;i<4;i++){
           arr[i] = s.nextInt();

           for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                count++;
                break;
            }
           }
        }
        System.out.println(count);
    }
}
