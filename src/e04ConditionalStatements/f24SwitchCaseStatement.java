package e04ConditionalStatements;

import java.util.Scanner;
/*
Viết một chương trình Java, lấy một số nguyên trong khoảng 1 đến 7 từ người dùng và hiển thị ra ngày trong tuần tương ứng.
Ví dụ:
Với num = 3, kết quả in ra màn hình là Wednesday
Vì trong khoảng 1 đến 7, số 3 tương ứng với Wednesday
Đầu vào: 1 số nguyên num nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 7
Đầu ra: in ra màn hình một trong các từ Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
Thời gian chạy: 1 giây
Gợi ý
Sử dụng câu lệnh switch...case để giải bài toán này
Hãy chắc rằng số 1 tương ứng với Thứ 2,... , số 7 tương ứng với Chủ Nhật.
*/
public class f24SwitchCaseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        switch(num)
        {
            case "1":
                System.out.print("Monday");
                break;
            case "2":
                System.out.print("Tuesday");
                break;
            case "3":
                System.out.print("Wednesday");
                break;
            case "4":
                System.out.print("Thursday");
                break;
            case "5":
                System.out.print("Friday");
                break;
            case "6":
                System.out.print("Saturday");
                break;
            case "7":
                System.out.print("Sunday");
                break;
            default:
                break;
        }
    }
}
