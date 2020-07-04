package e06WhileAndDoWhile;

import java.util.Scanner;

/*
* Bạn hãy viết chương trình nhập từ bàn phím số nguyên n và hiển thị ra màn hình số các ước số của n.
* Ví dụ nếu nhập n = 12 thì chương trình sẽ hiển thị ra màn hình:
* 6
* Giải thích: 12 có 6 ước là 1, 2, 3, 4, 6, 12
* */
public class f52LoopWhileDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int answer = 0;
        while (i <= n) {
            if (n % i == 0) {
                answer++;
            }
            i++;
        }
        System.out.println(answer);
    }
}
