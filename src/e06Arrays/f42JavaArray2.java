package e06Arrays;
/*
* Nhập vào từ màn hình một mảng số nguyên elementNumber.
* Hãy sắp xếp các số nguyên theo thứ tự tăng dần, sau đó in các số này ra màn hình,
* mỗi số cách nhau bằng một dấu cách
* Ví dụ:
* Với arr=[3,2,1,4], thì màn hình hiển thị "1 2 3 4 "
* Đầu vào: mảng số nguyên elementNumber nhập vào từ bàn phím
* Đầu ra: một dòng hiển thị các số nguyên theo thứ tự tăng dần
* Thời gian chạy: 0.5 giây
* */
import java.util.Scanner;

public class f42JavaArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        // Initial array
        int[] elementNumber = new int[len];

        // Initial elements in array
        for (int i = 0; i < len; i++) {
            elementNumber[i] = scanner.nextInt();
        }

        // sort elements
        int tempSort;
        for (int i = 0; i < len - 1; i++) {
            for (int j = len - 1; j >= 1; j--) {
                // nếu phần tử đứng sau nhỏ hơn phần tử đứng trước
                // thì đổi chỗ 2 phần tử đó cho nhau
                // với cách sắp xếp này thì trong lần duyệt đầu tiên
                // phần tử nhỏ nhất sẽ được chuyển lên trên cùng.
                if (elementNumber[j] < elementNumber[j - 1]) {
                    tempSort = elementNumber[j];
                    elementNumber[j] = elementNumber[j-1];
                    elementNumber[j-1] = tempSort;
                }
            }
        }

        for (int i = 0; i < len; i++) {
            System.out.print(elementNumber[i] + " ");
        }
    }
}
