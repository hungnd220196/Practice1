package bt7;

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

        // Nhập giá trị cần thêm vào mảng
        System.out.println("Nhập giá trị cần thêm vào mảng:");
        int addValue = scanner.nextInt();

        // Nhập chỉ số chèn phần tử vào mảng
        System.out.println("Nhập chỉ số chèn phần tử vào mảng:");
        int addIndex = scanner.nextInt();

        // Kiểm tra tính hợp lệ của chỉ số chèn
        if (addIndex < 0 || addIndex > n) {
            System.out.println("Chỉ số chèn không hợp lệ.");
        } else {
            // Tạo mảng mới có kích thước lớn hơn mảng ban đầu để chứa phần tử mới
            int[] newArr = new int[n + 1];

            // Sao chép các phần tử từ mảng ban đầu sang mảng mới đến chỉ số chèn
            for (int i = 0; i < addIndex; i++) {
                newArr[i] = arr[i];
            }

            // Chèn giá trị mới vào mảng mới
            newArr[addIndex] = addValue;

            // Sao chép các phần tử từ mảng ban đầu sang mảng mới từ chỉ số chèn + 1
            for (int i = addIndex + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }

            // In mảng mới sau khi đã thêm chèn
            System.out.println("Mảng sau khi thêm chèn:");
            System.out.println(Arrays.toString(newArr));
        }
    }
}
