package e06Arrays;

import java.util.Scanner;

/*
Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím.
Bạn hãy viết chương trình tính tổng các phần tử trong mảng arr.
Ví dụ nếu bạn nhập n = 2, m = 3, arr = [[5, 7, 3], [1, 2, 4]] như bên dưới:
2 3
5 7 3
1 2 4
Thì màn hình sẽ hiển thị ra:
22
*/
public class F67Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer = arr[i][j] + answer;
            }
        }
        System.out.println(answer);
    }
}
