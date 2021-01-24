package puzzel.Problem2101;

import java.util.Arrays;
import java.util.Scanner;

/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

 */
public class Problem2101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu " + (i + 1));
            Array[i] = scanner.nextInt();
        }
        System.out.println("Nhap ket qua can tim: ");
        int x = scanner.nextInt();
        if (checkContain(Array, x)) {
            System.out.println("Found!");
        } else
            System.out.printf("Not Found!");
    }

    public static boolean checkContain(int[] Arr, int x) {
        Arrays.sort(Arr);
        for (int i = 0, j = Arr.length - 1; i < j; ) {
            int temp = Arr[i] + Arr[j];
            if (temp < x) {
                i++;
            } else if (temp > x) {
                j--;
            } else
                return true;
        }
        return false;
    }
}
