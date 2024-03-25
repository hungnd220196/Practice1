package bt9;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();

        // Khởi tạo mảng với số phần tử đã nhập
        int[] arr = new int[n];

        // Nhập giá trị các phần tử của mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Nhập chỉ số phần tử cần xóa
        System.out.println("Nhập chỉ số phần tử cần xóa:");
        int deleteIndex = scanner.nextInt();

        // Kiểm tra tính hợp lệ của chỉ số cần xóa
        if (deleteIndex < 0 || deleteIndex >= n) {
            System.out.println("Chỉ số cần xóa không hợp lệ.");
        } else {
            // Tạo mảng mới có kích thước nhỏ hơn mảng ban đầu để chứa các phần tử còn lại
            int[] newArr = new int[n - 1];

            // Sao chép các phần tử từ mảng ban đầu sang mảng mới trước chỉ số cần xóa
            for (int i = 0; i < deleteIndex; i++) {
                newArr[i] = arr[i];
            }

            // Sao chép các phần tử từ mảng ban đầu sang mảng mới sau chỉ số cần xóa
            for (int i = deleteIndex + 1; i < n; i++) {
                newArr[i - 1] = arr[i];
            }

            // In mảng mới sau khi đã xóa
            System.out.println("Mảng sau khi xóa:");
            System.out.println(Arrays.toString(newArr));
        }
    }
}
