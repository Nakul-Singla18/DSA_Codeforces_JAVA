
import java.util.HashSet;
import java.util.Scanner;

public class I_Wanna_Be_The_Guy {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        

        int n= s.nextInt();

        HashSet<Integer> levels = new HashSet<>();
        int p=s.nextInt();

        for(int i=0;i<p;i++){
            levels.add(s.nextInt());
        }

        int q = s.nextInt();

        for(int j=0;j<q;j++){
            levels.add(s.nextInt());
        }

        if (levels.size() == n) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

        s.close();
    }
}
