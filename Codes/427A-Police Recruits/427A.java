
import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int hired =0;
        int Untreatedcrimes=0;

        for(int i=0;i<n;i++){
            int event=s.nextInt();
            if(event>0){
                hired+=event;
            }else{
                //when crime occur
                if(hired>0){
                    hired--;
                }else{
                    Untreatedcrimes++;
                }

            }
            
            
        }
        System.out.println(Untreatedcrimes);
    }
}
