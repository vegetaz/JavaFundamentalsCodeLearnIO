package e2VariablesAndTypes;

import java.util.Scanner;

/*Bài tập
Cho tổng sum và hiệu difference của hai số a và b. Viết chương trình Java để tìm a và b.
Các giá trị hiển thị trên hai dòng khác nhau.
Ví dụ
Với sum = 10, difference = 2, kết quả hiện ra hai dòng như sau
6
4
Vì 6 + 4 = 10 và 6 - 4 = 2
Đầu vào: 2 số nguyên sum và different nhập từ bàn phím
Điều kiện tiền đề:
0 ≤ sum, different ≤ 10000
sum mod 2 = different mod 2
Đầu ra: a và b hiển thị trên 2 dòng
Thời gian chạy: 0.5s
Gợi ý
Sử dụng toán tử số học được đề cập dưới đây để giải bài toán
Tham khảo công thức ở đây: http://mathcentral.uregina.ca/QQ/database/QQ.09.07/s/donna1.html*/
public class f09ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt(); //get sum from user input
        int difference = scanner.nextInt(); //get difference from user input

        int a = (sum + difference) / 2;
        int b = ((sum + difference) / 2) - difference;

        System.out.println(a);
        System.out.println(b);
    }

}
