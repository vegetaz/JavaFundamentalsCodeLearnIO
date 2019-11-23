package e4SelectionStatements;

import java.util.Scanner;

/*
Viết một chương trình Java để nhận một tọa độ điểm trong hệ tọa độ (X, Y != 0) và xác định điểm tọa độ đó nằm ở góc phần tư nào.
Ví dụ:
Với x = 4 và y = 6, đầu ra được in trên màn hình là "This point lies in the First quadrant"
Vì theo như hình ảnh bên trên, điểm tọa độ (4;6) nằm trên góc phần tư thứ nhất.
Với x = -4 và y = 6, đầu ra được in trên màn hình là "This point lies in the Second quadrant"
Vì theo như hình ảnh bên trên, điểm tọa độ (-4;6) nằm trên góc phần tư thứ hai.
Đầu vào: 2 số nguyên x, y nhập vào từ bàn phím
Điều kiện tiền đề:
x != 0 và y != 0
Đầu ra: "This point lies in the First quadrant" hoặc "This point lies in the Second quadrant"
hoặc "This point lies in the Third quadrant" hoặc "This point lies in the Fourth quadrant"
Giới hạn thời gian chạy: 1 giây
*/
public class f27CoditionalOperatorAss1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //get number from user input
        int y = scanner.nextInt(); //get number from user input

        System.out.println("This point lies in the " + ((x > 0 && y > 0) ? "First quadrant" : (x < 0 && y > 0) ? "Second quadrant" : (x < 0 && y < 0) ? "Third quadrant" : "Fourth quadrant"));
    }
}
