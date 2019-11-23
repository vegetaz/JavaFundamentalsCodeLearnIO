package e9NumbersAndMath;

import java.util.Scanner;
/*
Viết một chương trình Java để lấy phần nguyên và phần thập phân của một số thực num,
sau đó in kết quả là số, phần thập phân và phần nguyên trên một dòng.
Ví dụ:
Với đầu vào là num = 3.14
Đầu ra sẽ là "3.14 0.14 3.00". 3.00 là phần nguyên, 0.14 là phần thập phân.
Đầu vào: double
Đầu ra: string phần nguyên và phần thập phân của số thập phân vừa nhập
Thời gian chạy: 1.5 giây
Gợi ý
Sử dụng các phương thức của lớp Math để giải quyết vài toán này.
Nhớ lại về kiểu double.
*/
public class f60Math1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        double fractionalParts = num - (int)num;
        double integralPart = (int)num;

        System.out.printf("%.2f %.2f %.2f%n", num, fractionalParts, integralPart);
    }
}
