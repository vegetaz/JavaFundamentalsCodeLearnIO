package e06Arrays;

import java.util.Scanner;

/*
Nhập vào từ màn hình một mảng số nguyên elementNumber.
Hãy tính và in ra màn hình tổng các số nguyên chẵn trong mảng
Ví dụ:
Với arr=[3,4,1,6], thì màn hình hiển thị "10"
Vì tổng các số chẵn trong mảng là 4+6=10
Với arr=[3,5,1,101], thì màn hình hiển thị "0"
Đầu vào: mảng N số nguyên nhập vào từ bàn phím
1 <= N <= 100
Đầu ra: 1 dòng hiển thị tổng các số nguyên chẵn
Thời gian chạy: 0.5 giây
* */
public class f41JavaArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        // Initial array
        int[] elementNumber = new int[len];

        // Initial elements in array
        for (int i = 0; i < len; i++) {
            elementNumber[i] = scanner.nextInt();
        }

        // calculate sum of even elements
        int sum = 0;
        for(int i = 0; i < len; i++){
            if (elementNumber[i] % 2 == 0) {
                sum = sum + elementNumber[i];
            }
        }
        System.out.println(sum);
    }
}
