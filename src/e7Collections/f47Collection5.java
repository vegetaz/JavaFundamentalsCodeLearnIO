package e7Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Cho một danh sách màu gồm 4 phần tử là chuỗi cố định: "Yellow", "Green", "Blue", "Purple".
Hãy viết chương trình, thay đổi giá trị của màu ở vị trí position trong danh sách bằng màu color,
sau đó in ra màn hình danh sách các màu đã thay đổi. Trong đó position và color được nhập từ bàn phím.
Ví dụ
Với position = 1, color="Black" thì in ra màn hình [Yellow, Black, Blue, Purle]
Đầu vào:vị trí position là số tự nhiên và tên màu color là chuỗi được nhập vào từ bàn phím
Đầu ra: in ra màn hình danh sách màu đã chỉnh sửa
Thời gian chạy: 0.5 giây*/
public class f47Collection5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input position from keyboard
        int position = Integer.parseInt(scanner.nextLine());

        // Input new color from keyboard
        String color = scanner.nextLine();

        // Define a list of String as ArrayList
        List<String> list = new ArrayList<String>();
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Purple");
        list.set(position, color); // Update element here

        System.out.println(list);
    }
}
