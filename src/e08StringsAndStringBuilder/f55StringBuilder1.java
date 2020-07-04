package e08StringsAndStringBuilder;
/*
Viết chương trình Java in ra độ lớn và độ dài của biến builder ra màn hình trên một dòng.
Ví dụ
Với đầu vào là "Hi Codelearn!" Đầu ra sẽ là 13 29 được in trên 1 dòng
Đầu vào: string
Đầu ra: integer  (Hai số biểu thì độ lớn và chiều dài của String)
Thời gian chạy: 0.5 giây
*/

import java.util.Scanner;

public class f55StringBuilder1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine(); //get string

        StringBuilder builder = new StringBuilder(inputString);

        // Print length and capacity
        System.out.println(builder.length() + " " + builder.capacity());
    }
}
