package e07Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Cho một danh sách màu gồm 4 phần tử là chuỗi cố định: "Yellow", "Green", "Blue", "Purple".
Hãy xóa phần tử ở vị trí position sau đó in ra màn hình danh sách màu đã chỉnh sửa.
Trong đó position được nhập từ bàn phím
Ví dụ
Với position = 1 thì in ra màn hình [Yellow, Blue, Purple]
Đầu vào: vị trí position là số tự nhiên được nhập vào từ bàn phím
Đầu ra: in ra màn hình danh sách màu đã chỉnh sửa.
Thời gian chạy: 0.5 giây
*/
public class f48Collection6 {
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

        // Remove element at position in list.
        list.remove(position);
        System.out.println(list);
    }
}
