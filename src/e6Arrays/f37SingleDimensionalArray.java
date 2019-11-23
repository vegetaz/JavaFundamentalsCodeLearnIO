package e6Arrays;

import java.util.Scanner;

/*
Cho một mảng như dưới đây
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
Và số nguyên n nhập vào từ bàn phím.
Viết chương trình để thay đổi giá trị của phần tử ở vị trí n trong mảng cars thành "Code Learn".
In ra màn hình giá trị trước và sau khi thay đổi của phần tử đó.
Ví dụ:
Với n=2 thì in ra màn hình "Ford->Code Learn"
Đầu vào: số nguyên n
Đầu ra: In ra màn hình giá trị trước và sau khi thay đổi của phần tử ở vị trí n
Thời gian chạy: 0.5 giây
*/
public class f37SingleDimensionalArray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //get number from user input

        System.out.print(cars[n] + "->");

        cars[n] = "Code Learn";

        System.out.print(cars[n]);
    }
}
