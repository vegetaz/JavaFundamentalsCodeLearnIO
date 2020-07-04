package e04ConditionalStatements;

import java.util.Scanner;
/*
Cho một số nguyên number được nhập vào từ bàn phím (number != 0).
Viết chương trình Java để kiểm tra xem number là số dương hay số âm.
In ra màn hình "Number is positive" nếu number là số nguyên dương.
Nếu ngược lại, in "Number is negative" ra màn hình.
Ví dụ:
Với number = 1, màn hình hiển thị dòng chữ "Number is positive"
Vì số đã cho lớn hơn 0.
Với number = -23824231, màn hình hiển thị dòng chữ "Number is negative"
Vì số đã cho bé hơn 0.
Đầu vào: số nguyên number nhập từ bàn phím.
Điều kiện tiền đề:
number != 0
Đầu ra: Dòng chữ "Number is positive" hoặc "Number is negative" hiển thị trên màn hình.
Thời gian chạy: 0.5 giây
*/
public class f20IfStatementAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //get number from user input

        String s = "";
        if (number != 0) {
            if (number < 0) {
                s = "negative";
            } else {
                s = "positive";
            }
        }

        System.out.println("Number is " + s);
    }
}
