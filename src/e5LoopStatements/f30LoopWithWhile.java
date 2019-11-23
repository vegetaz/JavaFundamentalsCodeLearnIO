package e5LoopStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để người dùng nhập vào một số nguyên dương.
Sau đó, chương trình kiểm tra nếu số đó là số Armstrong thì in ra màn hình "The number is an Armstrong".
Nếu không thì in ra màn hình "The number is not an Armstrong"
Ví dụ:
Với n = 153, đầu ra là "The number is an Armstrong"
Vì 153 có 3 chữ số 1, 5, 3 và 1³ + 5³ + 3³ = 153.
Với n = 151, đầu ra là "The number is not an Armstrong"
Vì 151 có 3 chữ số 1, 5, 1 và 1³ + 5³ + 1³ = 127.
Đầu vào: 1 số nguyên n nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 10000
Đầu ra: "The number is an Armstrong" hoặc "The number is not an Armstrong"
Giới hạn thời gian chạy: 1 giây
*/
public class f30LoopWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        int c = 0;
        int a;
        int temp = n;
        while (1 <= n && n <= 10000) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            System.out.print("The number is an Armstrong");
        } else {
            System.out.print("The number is not an Armstrong");
        }
    }
}
