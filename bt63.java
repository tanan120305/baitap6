package bt6;
import java.util.*;
public class bt63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt(); if (n <= 0) {
            System.out.println("The number of elements must be greater than 0.");
            return;
        }
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Array after sorting in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
