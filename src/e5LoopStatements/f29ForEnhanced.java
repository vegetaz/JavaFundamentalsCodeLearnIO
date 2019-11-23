package e5LoopStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để người dùng nhập vào một số nguyên dương
và kiểm tra nếu số đó là số nguyên tố thì in ra màn hình dòng "The number is prime".
Nếu không thì in ra màn hình dòng "The number is not prime"
Ví dụ:
Với n = 5, đầu ra là "The number is prime"
Vì 5 chỉ chia hết cho chính nó và 1, số 5 là số nguyên tố.
Với n = 4, đầu ra là "The number is not prime"
Vì 4 chia hết cho chính nó, 2 và 1, số 4 không phải là số nguyên tố.
Đầu vào: 1 số nguyên n nhập từ bàn phím
Điều kiện đầu vào:
1 ≤ n ≤ 1000000
Đầu ra: "The number is prime" hoặc "The number is not prime"
Giới hạn thời gian chạy: 0.5 giây
*/
public class f29ForEnhanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        if (n < 2) {
            System.out.print("The number is not prime");
        }
        int count = 0;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.print("The number is prime");
        } else {
            System.out.print("The number is not prime");
        }
    }
}
