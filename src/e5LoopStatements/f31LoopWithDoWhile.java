package e5LoopStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để người dùng nhập vào một số nguyên dương.
Sau đó chương trình sẽ đếm và in ra màn hình có bao nhiêu lần số đã cho chia hết cho 2.
Ví dụ:
Với n = 7, đầu ra là "0"
Vì 7 không chia hết cho 2. Tổng số lần 7 chia hết cho 2 là 0.
Với n = 4, đầu ra là "2"
Vì 4 chia 2 được 2, 2 chia 2 được 1 và 1 không chia hết cho 2. Tổng số lần 4 chia hết cho 2 là 2.
Đầu vào: 1 số nguyên n nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 1000000
Đầu ra: số lần mà số đã cho n có thể chia hết cho 2.
Giới hạn thời gian chạy: 1 giây
*/
public class f31LoopWithDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        int count = 0;
        if (n % 2 == 0) {
            do {
                n = n / 2;
                count++;
            } while (n % 2 == 0);
            System.out.print(count);
        } else {
            System.out.print(count);
        }
    }
}
