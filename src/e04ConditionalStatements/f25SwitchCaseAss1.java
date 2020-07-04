package e04ConditionalStatements;

import java.util.Scanner;
/*
Viết một chương trình Java để xác định phím được ấn.
Nếu người dùng nhập một phím số (từ 0 đến 9), chương trình sẽ in ra số được ấn, ngược lại chương trình sẽ in ra "Not allowed!".
Ví dụ:
Với num = 0, kết quả được in ra màn hình là "You pressed 0"
Vì người dùng được phép ấn phím số '0'.
Với num = a, kết quả được in ra màn hình là "Not allowed!"
Vì người dùng không được phép ấn phím khác số 'a'.
Đầu vào: một phím bất kỳ được ấn từ bàn phím
Điều kiện tiền đề:
Người dùng chỉ được phép ấn một phím duy nhất.
Đầu ra: in ra màn hình theo câu theo dạng "You pressed 0" nếu người dùng ấn phím số hoặc câu "Not allowed!" nếu người dùng ấn phím khác số
Thời gian chạy: 1 giây
Gợi ý:
Sử dụng phương thức phù hợp để chuyển đổi, tránh trường hợp gặp phải ngoại lệ
*/
public class f25SwitchCaseAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        switch(num)
        {
            case "0":
                System.out.print("You pressed " + num);
                break;
            case "1":
                System.out.print("You pressed " + num);
                break;
            case "2":
                System.out.print("You pressed " + num);
                break;
            case "3":
                System.out.print("You pressed " + num);
                break;
            case "4":
                System.out.print("You pressed " + num);
                break;
            case "5":
                System.out.print("You pressed " + num);
                break;
            case "6":
                System.out.print("You pressed " + num);
                break;
            case "7":
                System.out.print("You pressed " + num);
                break;
            case "8":
                System.out.print("You pressed " + num);
                break;
            case "9":
                System.out.print("You pressed " + num);
                break;
            default:
                System.out.print("Not allowed!");
                break;
        }
    }
}
