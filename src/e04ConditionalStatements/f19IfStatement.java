package e04ConditionalStatements;

import java.util.Scanner;
/*
Cho một số nguyên number nhập vào từ bàn phím.
Viết chương trình Java để kiểm tra xem số nguyên number là số chẵn hay số lẻ.
Nếu number là số chẵn, hiển thị ra màn hình dòng chữ "Even number" ở dòng thứ nhất và "Done" ở dòng thứ hai.
Nếu number là số lẻ, in ra dòng chữ "Done" trên màn hình.
Ví dụ:
Với number = 10, kết quả được in ra màn hình như sau:
Even number
Done
Với number = 151, kết quả được in ra màn hình là "Done"
Đầu vào: Số nguyên number nhập từ bàn phím
Đầu ra: Nếu số đã cho là số chẵn, thì dòng chữ "Even number" hiển thị ở dòng thứ nhất và dòng chữ "Done" hiển thị ở dòng thứ hai.
Nếu ngược lại, màn hình hiển thị dòng chữ "Done".
Thời gian chạy: 0.5s
*/
public class f19IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //get number from user input
        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        System.out.println("Done");
    }
}
