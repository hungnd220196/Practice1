package bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập cột");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("array[%d][%d]= ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("tổng các sô chẵn trong mảng là " + sum);
    }
}
