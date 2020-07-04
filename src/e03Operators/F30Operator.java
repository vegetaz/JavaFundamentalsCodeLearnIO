package e03Operators;

import java.util.Scanner;

/*
* Bạn hãy viết chương trình nhập vào một ký tự từ bàn phím và thực hiện hiển thị ký tự tiếp trong bảng bảng chữ cái của ký tự đó ra màn hình.
* Ví dụ nếu bạn nhập c thì chương trình sẽ hiển thị ra d
* Giải thích: 'd' là ký tự tiếp theo của 'c' trong bảng chữ cái.
* */
public class F30Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        char d = (char)(c + 1);
        System.out.println(d);
        /*
        * Trong bảng mã ASCII thì mỗi ký tự có 1 giá trị kiểu nguyên.
        * Việc đơn giản là Java tự convert ký tự sang kiểu int khi thực hiện các phép tính toán.
        * Chúng ta đơn giản là ép kiểu và in ra kết quả!
        * */
    }
}
