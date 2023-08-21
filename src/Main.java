/*

 */

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static int rearrange(int[] array){
        Arrays.sort(array);
        int count = 1;
        for (int i : array) {
            if (i == count++) {
                count++;
                continue;
            }
            break;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        System.out.println(rearrange(array));
    }
}