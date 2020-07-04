package e08StringsAndStringBuilder;

import java.util.Scanner;

/*
Cho xâu s và số nguyên k được nhập từ bàn phím.
Bạn hãy viết chương trình in ra màn hình ký tự thứ k trong xâu s.
Ví dụ nếu bạn nhập s = "Codelearn", k = 2 như bên dưới:
Codelearn
2
Thì màn hình sẽ hiển thị ra:
o
Giải thích: ký tự thứ 2 trong xâu Codelearn là ký tự o
*/
public class F69String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(s.charAt((k > 0)? k - 1 : 0));
    }
}
