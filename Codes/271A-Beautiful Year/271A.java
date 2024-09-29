import java.util.Scanner;

public class DistinctDigitsYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Read the year
        int y = s.nextInt();
        int nextYear = y + 1;

        while (true) {
            if (hasDistinctDigits(nextYear)) {
                System.out.println(nextYear);
                break; // Exit the loop once the answer is found
            }
            nextYear++; // Check the next year
        }
        
        s.close(); // Close the scanner
    }

    // Method to check if the year has all distinct digits
    private static boolean hasDistinctDigits(int year) {
        String yearStr = String.valueOf(year);
        
        // Check each digit for duplicates
        for (int i = 0; i < yearStr.length(); i++) {
            for (int j = i + 1; j < yearStr.length(); j++) {
                if (yearStr.charAt(i) == yearStr.charAt(j)) {
                    return false; // Found a duplicate
                }
            }
        }
        return true; // All digits are distinct
    }
}
