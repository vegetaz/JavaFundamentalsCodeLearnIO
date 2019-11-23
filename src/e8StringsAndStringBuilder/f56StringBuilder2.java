package e8StringsAndStringBuilder;

import java.util.Scanner;
/*
Viết chương trình cho phép người dùng nhập vào tên mình từ bàn phím và in ra màn hình dòng chữ "Hello {name}"
Ví dụ
Với đầu vào name = "Codelearn" thì in ra màn hình dòng chữ "Hello Codelearn"
Đầu vào: string name
Đầu ra: In ra màn hình dòng chữ "Hello {name}"
*Giới hạn thời gian chạy: 0.5 giây
*/
public class f56StringBuilder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); //get name from keyboard

        StringBuilder builder = new StringBuilder("Hello");
		builder.append(" " + name);
        System.out.println(builder.toString());
    }
}
