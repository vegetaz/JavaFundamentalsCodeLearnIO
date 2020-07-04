package e09Method;

import java.util.Scanner;

/*
* Cho hình tròn có bán kính r được nhập từ bàn phím, bạn hãy viết phương thức trả về chu vi của hình tròn này biết π = 3.14.
* Ví dụ nếu bạn nhập:
* 3.5
* Thì chương trình sẽ hiển thị ra:
* 21.98
* */
public class f80AroundOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.print(circumference(r));
    }

    private static double circumference(double r) {
        return 2 * r * 3.14;
    }
}
