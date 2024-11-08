
package bt6;
import java. util.*;
public class bt61 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array:");
int n = scanner.nextInt();
if (n <= 0){
    System.out.println("The number of elements must be greater than 0.");
    return;
}
int[] array = new int[n];
int sum = 0;
System.out.println("Enter the elements of the array:");
for( int i = 0; i < n; i++){
    array [i]= scanner.nextInt();
    sum += array[i];
}
double average = (double) sum / n;
System.out.println("Sum: " + sum);
System.out.println("Average: " + average);
    } 
}