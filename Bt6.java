
package bt6;
import java. util.*;
public class Bt6 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n= scanner.nextInt();
    int array[]=new int[n];
    System.out.println("Enter the elements in the array: ");
    for(int i = 0; i < n; i++){
        array[i] = scanner.nextInt();
    }
    if(n>0){
        int min = array[0];
        int max = array[0];
        for(int i = 1; i < n; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The smallest element in the array: "+min);
        System.out.println("The largest element in the array: "+max);
    }

}
    
}
