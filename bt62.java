
package bt6;
import java.util.Scanner;

public class bt62 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number of elements must be greater than 0.");
            return;
        }
    int[] array = new int[n];
    System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to count its occurrences: ");
        int target = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                count++;  
            }
        }

       
        System.out.println("The number " + target + " appears " + count + " time(s) in the array.");

        
        scanner.close();
    }
}