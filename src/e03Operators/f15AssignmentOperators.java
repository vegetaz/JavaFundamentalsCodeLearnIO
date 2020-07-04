package e03Operators;

import java.util.Scanner;
/*
Cho hai số tự nhiên number1, number2 nhập vào từ bàn phím.
Viết một chương trình Java để tính toán và in ra màn hình số dư khi chia number1 cho number2
mà không sử dụng bất kỳ toán tử lấy phân dư sẵn có nào (không sử dụng toán tử '%')
Ví dụ:
Với number1 = 10 và number2 = 3, thì in ra màn hình 1
Vì 10 chia 3 bằng 3 dư 1.
Đầu vào: 2 số nguyên number1 và number2 nhập vào từ bàn phím
Điều kiện tiền đề:
0 < int2 < 1000
Đầu ra: in ra màn hình phần dư sau khi chia number1 cho number2.
Thời gian chạy: 0.5s
*/
public class f15AssignmentOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt(); // get dividend
        int number2 = scanner.nextInt(); // get divisor
        int tmp = number1 / number2;
        tmp *= number2;
        System.out.println(number1 - tmp);
    }
}
