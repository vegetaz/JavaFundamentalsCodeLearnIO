package e4SelectionStatements;

import java.util.Scanner;
/*
Hoàn thành một chương trình Java, người dùng nhập một năm bất kỳ và in ra năm đó có phải là năm nhuận hay không.
Ví dụ:
Với year = 2016, đầu ra được in ra màn hình là 2016 is a leap year
Vì 2016 chia hết cho 4 và không chia hết cho 100.
Với year = 2015, đầu ra được in ra màn hình là 2015 is not a leap year
Vì 2015 không chia hết cho 4.
Đầu vào: 1 số nguyên year nhập từ bàn phím
Điều kiện tiền đề:
1 ≤ n ≤ 9999
Đầu ra: kiểm tra year có phải là năm nhuận hay không và in ra màn hình theo kiểu sau: 2016 is a leap year or 2015 is not a leap year
Giới hạn thời gian chạy: 1 giây
*/
public class f22IfElseStatementAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(); //get year from user input

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.print(year + " is a leap year");
        } else {
            System.out.print(year + " is not a leap year");
        }

    }
}
