package bt3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập row ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập cột ");
        int col = Integer.parseInt(scanner.nextLine());
        // khai báo mảng 2 chiều
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("array[%d][%d] = ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        // in ra theo ma trận
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
