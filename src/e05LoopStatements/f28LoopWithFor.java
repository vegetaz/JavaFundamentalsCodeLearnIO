package e05LoopStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để người dùng nhập một số nguyên dương.
Sau đó chương trình tính toán và in ra màn hình giai thừa của số đã nhập (n!)
Ví dụ:
Với n = 5, đầu ra được in ra màn hình là  "120"
Vì 5! = 5 * 4 * 3 * 2 * 1 = 120
Với n = 3, đầu ra được in ra màn hình là  "6"
Vì 3! = 3 * 2 * 1 = 6
Đầu vào: 1 số nguyên n nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 20
Đầu ra: giai thừa của số đã cho n
Giới hạn thời gian chạy: 1 giây
*/
public class f28LoopWithFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        int s = 1;
        for (int i = 1; i <= n; i++) {
            s =  s * i;
        }

        System.out.println(s);
    }
}
