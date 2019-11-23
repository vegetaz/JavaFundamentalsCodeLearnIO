package e4SelectionStatements;

import java.util.Scanner;
/*
Viết một chương trình Java, nhận 3 số nguyên từ người dùng và in ra "increasing" nếu các số theo thứ tự tăng dần,
"decreasing" nếu các số theo thứ tự giảm dần và "Neither increasing nor decreasing order" cho trường hợp còn lại.
Ví dụ:
Với num1 = 1524, num2 = 2421, num3 = 5241, kết quả được in ra màn hình là increasing
Vì num1 < num2 < num3 (1524 < 2421 < 5241)
Đầu vào: 3 số nguyên num1, num2, num3 nhập từ bàn phím
Điều kiện tiền đề:
-1000 ≤ n ≤ 10000
Đầu ra: in ra màn hình một trong các câu increasing hoặc decreasing hoặc Neither increasing nor decreasing order
Giới hạn thời gian chạy: 1 giây
Gợi ý
Sử dụng các toán tử đẻ so sánh các số
*/
public class f23IfElseStatementAss2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); //get year from user input
        int num2 = scanner.nextInt(); //get year from user input
        int num3 = scanner.nextInt(); //get year from user input

        if (num1 < num2 && num2 < num3) {
            System.out.print("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.print("decreasing");
        } else {
            System.out.print("Neither increasing or decreasing order");
        }
    }
}
