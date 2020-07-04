package e03Operators;

import java.util.Scanner;
/*
Cho một số tự nhiên n nhập vào từ bàn phím (100 ≤ n ≤ 999).
Viết chương trình Java để tính tổng các chữ số của số đó và in ra màn hình.
Ví dụ:
Với n = 854, kết quả được in ra mà hình là 17
Vì tổng các chữ số trong số đã cho là 8+5+4 = 17
Đầu vào: số nguyên n nhập từ bàn phím
Điều kiện tiền đề:
100 ≤ n ≤ 999
Đầu ra: in ra màn hình số nguyên là tổng tất cả chữ số của n
Thời gian chạy: 1s
*/
public class f16OperatorAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        int result = (n / 100) + ((n / 10) % 10) + (n % 10);

        System.out.println(result); // output result
    }
}
