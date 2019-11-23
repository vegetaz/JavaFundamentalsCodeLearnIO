package e4SelectionStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để kiểm tra điểm nhập vào là đạt hay trượt.
Người dùng nhập vào 1 điểm từ 0 đến 10.
Nếu điểm lớn hơn hoặc bằng 5 thì hiển thị là "You are passed", ngược lại thì hiển thị là "You are failed"
Ví dụ:
Với đầu vào score = 6 Đầu ra sẽ là  "You are passed" vì 6>5 và với điểm số lớn hơn 5 thì sẽ pass
hoặc
Với đầu vào score = 4 Đầu ra sẽ là "You are failed" vì 4<5 và với điểm số nhỏ hơn 5 thì sẽ fail
Đầu vào: int  (điểm của sinh viên)
Điều kiện tiền đề:
0 ≤ score ≤ 10
Đầu ra: string
(Nếu điểm lớn hơn hoặc bằng 5 thì hiển thị là "You are passed", ngược lại thì hiển thị là "You are failed")
Thời gian chạy: 1 giây
*/
public class f26ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt(); //get number from user input

        System.out.println("You are " + (score >= 5 ? "passed" : "failed"));

    }
}
