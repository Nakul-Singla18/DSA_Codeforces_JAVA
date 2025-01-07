
import java.util.Scanner;

public class Lottery {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();
    int count=0;

// start from 100 and then calculate the count of each token by dividing and then reduce the original input value

    count+= input/100;
    input %=100;

    count+= input/20;
    input %=20;

    count+= input/10;
    input %=10;

    count+= input/5;
    input %=5;

// At last add the remaining to the count
    count+= input;
    System.out.println(count);
   }
}
