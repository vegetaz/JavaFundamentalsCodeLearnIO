package e9NumbersAndMath;

import java.util.Scanner;
/*
Phương thức Integer nào bạn có thể sử dụng để chuyển đổi một số dạng int sang string dưới dạng một số ở dạng thập lục phân.
Cho một integer, hãy tìm cách để chuyển đổi số đó về dạng số hexadecimal.
Viết một chương trình Java để hiển thị kết quả là một string dưới dạng số hexadecimal ra màn hình.
Ví dụ:
Với đầu vào là num = 75
Đầu ra sẽ là  4b
Đầu vào: integer
Đầu ra: string Số hexadecimal chuyển đổi từ integer đã nhập vào.
Thời gian chạy: 1.5 giây
Gợi ý
Bạn có thể dùng for-loop or while-loop
Nhớ lại về công thức hoặc thuật toán để chuyển đổi.
*/
public class f59IntToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        String result = Integer.toHexString(n);

        System.out.println(result);
    }
}
