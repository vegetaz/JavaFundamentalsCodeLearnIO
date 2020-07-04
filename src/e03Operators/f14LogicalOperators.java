package e03Operators;

import java.util.Scanner;
/*
Cho một số tự nhiên x được nhập vào từ bàn phím.
Chương trình thực hiện khởi tạo biến y, j, k từ giá trị của x như sau:
int y = x; int j = x++; int k = --x;
Khởi tạo biến boolean leftSide để lưu kết quả so sánh của mệnh đề x == k++ && x >=j (true hay false)
Hãy tính toán giá trị của k và biến leftSide sau khi sử dụng các toán tử số học và in ra màn hình (giá trị của k được biểu diễn theo y)
*/
public class f14LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //get x from input
        int y = x;

        int j = x++;
        int k = --x;

        boolean leftSide = x == k++ && x >= j;
        System.out.println(leftSide); //the value of leftSide
        System.out.println(y + k - y); //the value of k represented by y
    }
}
