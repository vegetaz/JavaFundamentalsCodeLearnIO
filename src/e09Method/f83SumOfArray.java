package e09Method;

import java.util.Scanner;

/*
* Cho mảng các số nguyên n phần tử arr được nhập từ bàn phím.
* Bạn hãy viết phương thức đệ quy tính tổng các phần tử của mảng.
* Nếu bạn vẫn chưa chưa thạo cách dùng phương thức đệ quy thì có thể xem hướng dẫn bên dưới.
* */
public class f83SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfArray(arr, n));
    }

    private static int sumOfArray(int[] arr, int n) {
        if (n == 1) return arr[0];
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }
}
