

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String str = s.nextLine();

        if(n<26){
             System.out.println("NO");
             return;
        }

        str=str.toLowerCase();

        HashSet<Character> uniqueLetters = new HashSet<>();

        for(int i=0;i<n;i++){
            uniqueLetters.add(str.charAt(i));
        }

        if(uniqueLetters.size()==26){
            System.out.println("YES");

        }else{
            System.out.println("NO");
        }
    }
}
