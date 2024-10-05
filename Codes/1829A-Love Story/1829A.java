
import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        s.nextLine();
        String ori = "codeforces";

        for(int i=0;i<n;i++){
            int count =0;

            String curr = s.nextLine();
            for(int j=0;j<10;j++){
                if(curr.charAt(j)!=ori.charAt(j)){
                    count ++;
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}
