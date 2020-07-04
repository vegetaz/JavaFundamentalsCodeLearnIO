package e09Method;

import java.util.Scanner;

/*
* Bạn hãy viết phương thức hiển thị ra màn hình những xâu có độ dài lớn hơn 3 trong mảng arr.
* Ví dụ
* Nếu bạn nhập n = 3, arr = ["abcd", "ab", "xyz"] thì màn hình sẽ hiển thị ra:
* abcd​
* Nếu bạn nhập n = 4, arr = ["1234", "abcde", "xy", "code"] thì màn hình sẽ hiển thị ra:
* 1234 abcde code​
* */
public class f78CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        show(arr);
    }

    private static void show(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
