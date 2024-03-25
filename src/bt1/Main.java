package bt1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("mời bạn nhập số thứ  " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}