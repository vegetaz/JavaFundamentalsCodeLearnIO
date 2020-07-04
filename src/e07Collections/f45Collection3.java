package e07Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Cho một danh sách màu gồm 4 phần tử là chuỗi cố định: "Yellow", "Green", "Blue", "Purple".
Hãy viết chương trình, chèn vào danh sách đó một phần tử color vào vị trí position sau đó in ra màn hình danh sách màu đã được chỉnh sửa.
Trong đó color và position được nhập từ bàn phím
Ví dụ
Với position = 1 và color= "Red" thì in ra màn hình [Yellow, Red, Green, Blue, Purple]
Đầu vào: vị trí position là số tự nhiên và tên màu color là chuỗi được nhập vào từ bàn phím
Đầu ra: in ra màn hình danh sách màu đã chỉnh sửa
Thời gian chạy: 0.5 giây
*/
public class f45Collection3 {
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
        list.add(position, color);

        System.out.println(list);
    }
}
