package e03Operators;

import java.util.Scanner;

/*
 * Cho hai biến a và b kiểu số nguyên được nhập vào từ bàn phím,
 * bạn hãy viết chương trình hiển thị ra màn hình true nếu a lớn hơn b, ngược lại hiển thị ra false.
 * Ví dụ nếu bạn nhập a = 5, b = 4 giống như sau:
 * 5 4
 * Thì màn hình sẽ hiển thị ra:
 * true
 * Ví dụ khác, nếu bạn nhập a = 3, b = 4 giống như sau:
 * 3 4
 * Thì màn hình sẽ hiển thị ra:
 * false
 * */
public class F31Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b);
    }
}
