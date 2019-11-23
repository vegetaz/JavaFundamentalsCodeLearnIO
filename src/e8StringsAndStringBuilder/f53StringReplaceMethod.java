package e8StringsAndStringBuilder;
/*
Viết một chương trình Java với các câu lệnh và toán tử phù hợp để in kết quả là chuỗi ban đầu của đoạn teencode ra màn hình.
Teencode là một dạng văn bản mà thanh thiếu niên thường sử dụng.
Nó là một hình thức mã hóa văn bản gốc bằng cách thay thế các nguyên âm bằng các số giống với nguyên âm.
Nhập từ bàn phím chuỗi str đại diện cho văn bản teencode, nhiệm vụ của bạn là chuyển về văn bản gốc khi biết rằng:
Ký tự: "a" = "4", "e" = "3", "i" = "1", "o" = "0", u = "21"
Các từ cách nhau bởi một khoảng trống và có bất kỳ khoảng trống nào ở đầu và cuối chuỗi.
Lưu ý, phần từ "-" cho biết ai đã gửi văn bản. Bạn cần xóa nó và phần theo sau trước khi tiến hành chuyển đổi văn bản.
Các ký tự thừa phải bị xóa bỏ để kết quả cuối cùng chỉ bao gồm chuối chưa các chữ cái và dấu cách phù hợp.
Ví dụ:
Với đầu vào str= " C0d3L34rn... - Send by Tom" đầu ra sẽ là "CodeLearn".
Đầu vào: String str
Guaranteed constraints:
1 ≤ str.Length < 10^6.
Đầu ra: string
Thời gian chạy: 1.5s
*/

import java.util.Scanner;

public class f53StringReplaceMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teenCode = scanner.nextLine(); //get string from user input

        // Convert teencode string
        String result;
        result = teenCode.trim().replaceAll("\\s+", " ").replace('4', 'a').replace('3', 'e').replace('1', 'i').replace('0', 'o').replace("21", "u").replaceAll("21", "u").replaceAll("\\.{3}", "").replaceAll("\\s\\-\\s(.*)", "");

        System.out.println(result);
    }
}
