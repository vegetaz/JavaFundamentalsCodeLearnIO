package e05LoopStatements;

import java.util.Scanner;
/*
Cho một số nguyên dương number, in ra màn hình tất cả các số chẵn từ number đến 1.
Ví dụ:
Với number = 10, đầu ra được in trên màn hình là 10 8 6 4 2
Đầu vào: 1 số nguyên dương number nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 1000
Đầu ra: in ra màn hình các số chẵn giảm dần từ number đến 1
Giới hạn thời gian chạy: 1.5 seconds
*/
public class f33ContinueBreak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number; i > 0; i--) {
            if (i % 2 != 0)
                continue;
            System.out.print(i + "\t");
        }
    }
}
