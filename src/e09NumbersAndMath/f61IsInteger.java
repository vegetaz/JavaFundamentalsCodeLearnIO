package e09NumbersAndMath;
/*
Viết một chương trình Java để kiểm tra một số thực có phải là một số nguyên không sau đó in kết quả ra màn hình.
Ví dụ
Với đầu vào float a= 1.6
Đầu ra sẽ là  False vì có chứa phần thập phân sau dấu chấm trong khi số nguyên không có phần thập phân.
Đầu vào: float
Đầu ra: Boolean true nếu số đó là một số nguyên, false nếu không phải.
Giới hạn thời gian chạy: 1.5 giây
Gợi ý
Sử dụng câu lệnh if để giải bài toán này.
Nhớ lại về kiểu int và kiểu float.
*/
import java.util.Scanner;

public class f61IsInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble(); //get number from user input

        boolean result = false;
        if ((int)number == number) {
            result = true;
        }

        System.out.println(result);
    }
}
