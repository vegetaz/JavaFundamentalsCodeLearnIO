package e03Operators;

import java.util.Scanner;

/*
* Viết chương trình nhập vào bán kính r của một hình tròn và hiển thị ra màn hình chu vi của hình tròn đó biết π = 3.14:
* Circumference = {P}
* Với {P} là chu vi của hình tròn có bán kính r.
* Ví dụ nếu bạn nhập:
* 7.5
* Thì chương trình sẽ in ra:
* Circumference = 47.1
* */
public class F29Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Circumference = " + 2 * r * 3.14);
    }
}
