package bt8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("mời bạn nhập giá trị cần update");
        int value = new Scanner(System.in).nextInt();
        System.out.println("mời bạn nhập vị trí cần update");
        int index = new Scanner(System.in).nextInt();
        if (index > arr.length || index < 0) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (index ==i){
                arr[i] = value;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
