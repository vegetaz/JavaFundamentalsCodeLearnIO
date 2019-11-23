package e5LoopStatements;

import java.util.Scanner;
/*
Cho một số nguyên n nhập vào từ bàn phím.
Hãy viết chương trình Java tính giai thừa của n và in ra màn hình "Sum of digits is twice more than the number"
nếu tổng các chữ số của giai thừa lớn hơn hoặc bằng n*2. Nếu không in ra "No more than".
Ví dụ
Với n = 7 thì in ra màn hình "No more than" vì 7! = 1*2*3*4*5*6*7 = 5040 và 5+0+4+0=9 và 7*2=14, 9<14.
Đầu vào: Số nguyên n nhập vào từ bàn phím
n <= 10
Đầu ra: string
Thời gian chạy: 0.5 giây
*/
public class f36FindFactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // calculate factorial and compare
        int gt = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        for (;gt > 0; gt /= 10) {
            sum += (gt % 10);
        }
        String str = n * 2 > sum ? "No more than" :"Sum of digits is twice more than the number";

        // print result
        System.out.println(str);
    }
}
