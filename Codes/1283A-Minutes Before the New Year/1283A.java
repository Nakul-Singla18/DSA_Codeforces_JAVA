
import java.util.Scanner;

public class Minutes_Before_NEWYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int h = s.nextInt();
            int m= s.nextInt();

            int remHours = 24-h;
            int remainingminutes  = 60-m;
            if(remHours==1){
                System.out.println(remainingminutes);
            }
            else{
                remainingminutes+=(remHours-1)*60;
                System.out.println(remainingminutes);
            }


        }
    }
}
