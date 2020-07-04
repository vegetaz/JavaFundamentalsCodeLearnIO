package e09Method;

import java.util.Scanner;

/*
* Cho số nguyên dương n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về n! (n giai thừa).
* Ví dụ nếu bạn nhập n = 5 thì chương trình sẽ hiển thị lên màn hình 120.
* */
public class f81Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
