import java.util.Scanner;

public class Restore3Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[4];

        for(int i=0;i<4;i++){
            nums[i]=s.nextInt();
        }

        //Bubble sort to find the olngest number

        for(int i=0;i<3;i++){
            for(int j=0;j<3-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] =temp;
                }
            }
        }

        int a = nums[3]-nums[2];
        int b = nums[3]-nums[1];
        int c = nums[3]-nums[0];

        System.out.println(a+" "+b+" "+c);
    }
}
