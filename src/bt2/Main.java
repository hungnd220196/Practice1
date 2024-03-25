package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("mời bạn nhập số lượng phần tử");
        int n = new Scanner(System.in).nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhập số thứ " + (i + 1));
            arr[i] = new Scanner(System.in).nextInt();
            sum += arr[i];
        }
        System.out.println("trung bình cộng các phần tử " + (sum / arr.length));

    }
}
