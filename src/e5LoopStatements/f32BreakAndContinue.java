package e5LoopStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để người dùng nhập một số nguyên dương.
Sau đó, chương trình tính và hiển thi ra màn hình tổng của các số từ 1 đến số đã cho mà số đó chia hết cho 3.
Ví dụ:
Với n = 10, đầu ra là "18"
Vì trong khoảng 1 đến 10 có 3 số 3, 6, 9 chia hết cho 3.
Và tổng 3 số là 3 + 6 + 9 = 18.
Với n = 15, đầu ra là "45"
Vì trong khoảng 1 đến 15 có 5 số 3, 6, 9, 12, 15 chia hết cho 3.
Và tổng 5 số là 3 + 6 + 9 + 12 + 15= 45.
Đầu vào: 1 số nguyên n nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 10000
Đầu ra: hiển thị ra màn hình số là tổng các số từ 1 đến n mà chia hết cho 3.
Giới hạn thời gian chạy: 1 giây
*/
public class f32BreakAndContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        int t = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0) {
                continue;
            }
            t = t + i;
        }
        System.out.print(t);
    }
}
