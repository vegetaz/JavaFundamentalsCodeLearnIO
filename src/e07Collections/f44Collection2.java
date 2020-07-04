package e07Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Viết chương trình Java để tạo danh sách mảng mới, thêm 4 màu (chuỗi) ngẫu nhiên theo đề bài.
In ra màn hình các màu trong mảng, ngăn cách nhau bằng dấu ";".
Ví dụ
Với đầu vào là "Yellow", "Green", "Blue", "Purple" thì in ra màn hình Yellow;Green;Blue;Purle;
Đầu vào: 4 chuỗi là tên màu ngẫu nhiên
Đầu ra: in ra màn hình danh sách màu, ngăn cách nhau bằng dấu ";"
Thời gian chạy: 0.5 giây
*/
public class f44Collection2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a list of String as ArrayList
        List<String> list = new ArrayList<String>();
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        list.add(scanner.nextLine());
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + ";");
    }
}
