
import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String result = "";
        if(n%2==0){
            for(int i=n;i>0;i--){
                if(i==1){result=result+"I love it ";
                System.out.println(result);
                return;
            }
                if(i%2==0){
                    result=result+"I hate that ";
                }else{
                    result=result+"I love that ";
                }
            }  
        }else{
            for(int i=n;i>0;i--){
                if(i==1){result=result+"I hate it ";
                System.out.println(result);
            return;}
                if(i%2==0){
                    result=result+"I love that ";
                }else{
                    result=result+"I hate that ";
                }
            }  
        }
    }
}
