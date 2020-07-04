package e03Operators;

import java.util.Scanner;

/*
Cho 2 số tự nhiên a, b nhập vào từ bàn phím.
Viết chương trình Java để thực hiện việc hoán đổi giá trị 2 số a và b
sau đó in ra màn hình giá trị của a và b sau khi thay đổi trên 2 dòng khác nhau.
Ví dụ:
Với a=1 and b=2, thì in ra màn hình như sau:
2
1
Đầu vào: 2 số nguyên a và b nhập từ bàn phím
Đầu ra: hiển thị trên hai dòng giá trị a và b sau khi hoán đổi
Thời gian chạy: 1s
*/
public class f17OperatorAss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //get number from user input
        int b = scanner.nextInt(); //get number from user input

        a = a;
        int c = a; a = b; b = c;

        System.out.println(a); // output new value of a
        System.out.println(b); // output new value of b
    }
}
