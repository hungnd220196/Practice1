package bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số phần tử mảng");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập số cần tìm index và tổng các số = findNumber");
        int findNumber = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("mời bạn nhập số thứ " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (findNumber == arr[i]) {
                sum += arr[i];
                System.out.println("vị trí " + i);
            }
            System.out.println("Tổng các số " + sum);
        }
    }
}
