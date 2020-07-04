package e07Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Cho một danh sách màu HashMap gồm 4 phần tử là chuỗi cố định: "Yellow", "Green", "Blue", "Purple".
Hãy viết chương trình kiểm tra xem phần tử có key = n có giá trị bằng một color hay không?
Nếu có, in ra màn hình "Yes", nếu không, in ra màn hình "No".
Trong đó n và color được nhập từ bàn phím.
Ví dụ
Với n = 1, color="Black" thì in ra màn hình "No"
Đầu vào: n là số tự nhiên và tên màu color là chuỗi được nhập vào từ bàn phím
Đầu ra: in ra màn hình "Yes" hoặc "No" tùy theo kết quả của chương trình
Thời gian chạy: 0.5 giây
*/
public class f49Collection8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n from keyboard
        int n = Integer.parseInt(scanner.nextLine());

        // Input color from keyboard
        String color = scanner.nextLine();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Yellow");
        map.put(2, "Green");
        map.put(3, "Blue");
        map.put(4, "Purple");
        if(map.get(n).equals(color)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
