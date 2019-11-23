package e7Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Viết chương trình Java để tạo danh sách mảng mới, thêm 4 màu (chuỗi) ngẫu nhiên theo đề bài, sau đó thêm màu "Red" vào cuối danh sách.
In ra màn hình các màu trong mảng.
Ví dụ
Với đầu vào là "Yellow", "Green", "Blue", "Purple" thì đầu ra là [Yellow, Green, Blue, Purle, Red]
Đầu vào: 4 chuỗi là tên màu ngẫu nhiên
Đầu ra: in ra màn hình danh sách màu, có thêm màu "Red" ở cuối danh sách'
Thời gian chạy: 0.5 giây
*/
public class f43Collection1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a list of String as ArrayList
        List<String> list = new ArrayList<String>();
        list.add(scanner.nextLine());

        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add("Red");

        System.out.println(list);
    }
}
