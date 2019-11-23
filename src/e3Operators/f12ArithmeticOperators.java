package e3Operators;

import java.util.Scanner;

/*
Cho một số nguyên x được nhập vào từ bàn phím. Chương trình thực hiện các toán tử số học với x như sau:
x++; --x; x--; --x; ++x;
Hãy tính toán giá trị của x và in ra màn hình.
Ví dụ
Với x = 5, thì in ra màn hình 4 vì x sẽ thay đổi giá trị như sau
6->5->4->3->4
Đầu vào:  số nguyên x nhập vào từ bàn phím
Đầu ra: in ra màn hình giá trị của x
Thời gian chạy: 0.5 giây
*/
public class f12ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //get x from input
        int y = x;
        x++;
        --x;
        x--;
        --x;
        ++x;
        System.out.println(y + x -y); //the value of x represented by y
    }
}
