
import java.util.Scanner;

public class FoxSnake {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int row = s.nextInt();
    int col = s.nextInt();

    for(int i=1;i<=row;i++){

        for(int j=1;j<=col;j++){
            if(i%2!=0){
                System.out.print("#");
            }else{
                if(i%4!=0){
                    if(j==col){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }else{
                    if(j==1){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }

            }
        }
        System.out.println();
    }

    }
}
