package e07Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Viết một chương trình Java để sắp xếp dãy các số nguyên theo chiều tăng dần sau đó in kết quả đã sắp xếp ra màn hình
Ví dụ
Với đầu vào là list chứa  1, 3 và 2
Đầu ra sẽ là 1, 2, 3
Đầu vào: không có
Đầu ra: string
*/
public class f50ObjectOrdering1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        Collections.sort(list); // Use sort() method to order here
        list.forEach(e -> {
            System.out.printf("%d\t", e);
        });
    }
}
