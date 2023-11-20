// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        // Read n integers into an array
        int[] integers = new int[n];
        System.out.println("Enter the integers, one per line:");
        for (int i = 0; i < n; i++) {
            integers[i] = scanner.nextInt();
        }
        
        // Calling the Sort class
        IntegerSorter sorted = new IntegerSorter();
        sorted.sort(integers);

        // Print the sorted integers
        System.out.println("Sorted integers in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(integers[i]+" ");
        }
    }
}
class IntegerSorter {
    // Method to sort an array of integers in ascending order
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
