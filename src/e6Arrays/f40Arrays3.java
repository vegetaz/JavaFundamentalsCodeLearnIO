package e6Arrays;

import java.util.Scanner;

/*
* Cho một mảng đa chiều gồm các số nguyên int[][] a = {{1, 2, 5, 8},{29, 3, 56, 4}, {12, 7, 31, 9}}.
* Hãy viết chương trình cho phép người dùng nhập vào số hàng row,
* số cột column sau đó in ra màn hình giá trị tương ứng với số hàng, số cột trong mảng đã cho.
* Ví dụ:
* Với đầu vào là row = 2, col = 3 thì thì in ra màn hình 56
* Đầu vào: số tự nhiên col, row nhập từ bàn phím
* Đầu ra: In ra màn hình giá trị tương ứng với số hàng, số cột trong mảng đã cho.
* Thời gian chạy: 0.5 giây
* */
public class f40Arrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = {
                {1, 2, 5, 8},
                {29, 3, 56, 4},
                {12, 7, 31, 9}
        };

        // get input of row, col
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        // get value in array with position of row, col
        int number = a[i][j];
        System.out.println(number);
    }
}
