package e4SelectionStatements;

import java.util.Scanner;
/*
Người dùng nhập 3 số nguyên, hoàn thành chương trình để in ra số lớn nhất.
Ví dụ:
Với num1 = 5, num2 = 7, num3 = 5, đầu ra được in ra màn hình là The greatest number is 7
Vì num2 > num1 = num3 (7 > 5 = 5).
Với num1 = 10, num2 = 10, num3 = 10, đầu ra được in ra màn hình là The greatest number is 10
Vì num1 = num2 = num3 (10 = 10 = 10).
Đầu vào: 3 số nguyên num1, num2, num3 nhập từ bàn phím
Điều kiện tiền đề:
-1000000 ≤ num1, num2, num3 ≤ 1000000
Đầu ra: tìm số lớn nhất và in ra màn hình như sau: The greatest number is MaxNumber
Giới hạn thời gian chạy: 1 giây
Gợi ý
Bạn nên sử dụng lệnh if-else để giải bài toán này.
Bạn nên học cách sử dụng lệnh if-else bằng cách đọc lý thuyết phía dưới.
*/
public class f21IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); //get number from user input
        int num2 = scanner.nextInt(); //get number from user input
        int num3 = scanner.nextInt(); //get number from user input

        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("The greatest number is " + max);
    }
}
