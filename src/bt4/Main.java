package bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhập số thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("giá trị lớn nhất là " + max + " giá trị nhỏ nhất là " + min);
    }
}
