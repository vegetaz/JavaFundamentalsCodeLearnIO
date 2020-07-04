package e03Operators;

import java.util.Scanner;
/*
Cho 2 số tự nhiên a and b được nhập vào từ bàn phím.
Viết chương trình Java để in ra màn hình kết quả so sánh giá trị của a và b (true hoặc false).
Bao gồm các phép so sánh như sau (Mỗi phép so sánh in ra trên một dòng):
a == b, a != b, a > b, a < b, b >= a, b <= a
*/
public class f13RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //get a from input
        int b = scanner.nextInt();

        System.out.println("a == b = " + (a == b)); //input result of left side
        System.out.println("a != b = " + (a != b)); //input result of left side
        System.out.println("a > b = " + (a > b)); //input result of left side
        System.out.println("a < b = " + (a < b)); //input result of left side
        System.out.println("b >= a = " + (b >= a)); //input result of left side
        System.out.println("b <= a = " + (b <= a)); //input result of left side
    }
}
