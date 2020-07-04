package e09Method;

import java.util.Scanner;

/*
* Bạn hãy viết phương thức trả về tổng của các phần tử trong mảng các số nguyên arr được nhập vào từ bàn phím.
* Ví dụ
* Nếu bạn nhập n = 3, arr = [2, 4, 1] thì màn hình sẽ hiển thị ra 7.
* Nếu bạn nhập n = 4, arr = [2, 2, 3, 4] thì màn hình sẽ hiển thị ra 11.
* */
public class f76JavaMethods {
    public static int sumOfArray(int[] arr) {
		int sumItem = 0;
        for (int i = 0; i < arr.length; i++) {
            sumItem = arr[i] + sumItem;
        }
        return sumItem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfArray(arr));
    }
}
