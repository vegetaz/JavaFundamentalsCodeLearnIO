package e5LoopStatements;

import java.util.Scanner;
/*
Cho 2 số nguyên a và b nhập vào từ bàn phím.
Hãy viết chương trình Java tính giá trị của ab và in ra màn hình
Ví dụ
Với a = 2, b = 3 thì in ra màn hình 8 vì 23= 8
Với a = 6, b = 2 thì in ra màn hình 36 vì 62= 36
Đầu vào: 2 số nguyên a và b nhập từ bàn phím
a >= 0; b <= 10
Đầu ra: in ra màn hình giá trị của ab
Thời gian chạy: 0.5 giây
Gợi ý
Sử dụng kiến thức về vòng lặp để giải bài toán.
*/
public class f35CalculateAToThePowerB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // calculate power
        int s = 1;
        for (int i = 0; i < b; i++) {
            s = s * a;
        }

        // print result
        System.out.println(s);
    }
}
