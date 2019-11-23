package e7Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Cho một danh sách màu gồm 4 phần tử là chuỗi cố định: "Yellow", "Green", "Blue", "Purple".
Hãy viết chương trình, in ra màu ở vị trí position  trong danh sách.
Trong đó position được nhập từ bàn phím
Ví dụ
Với position = 1 thì in ra màn hình "Green"
Đầu vào: vị trí position là số tự nhiên được nhập vào từ bàn phím
Đầu ra: in ra màn hình màu ở vị trí position trong danh sách
Thời gian chạy: 0.5 giây
*/
public class f46Collection4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input position from keyboard
        int position = Integer.parseInt(scanner.nextLine());

        // Define a list of String as ArrayList
        List<String> list = new ArrayList<String>();
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Purple");

        String color = list.get(position); // Get element by position
        System.out.println(color);
    }
}
