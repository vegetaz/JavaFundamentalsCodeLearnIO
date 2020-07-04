package e08StringsAndStringBuilder;

import java.util.Scanner;

/*
Cho xâu s và ký tự c được nhập từ bàn phím.
Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.
Ví dụ nếu bạn nhập s = "Codelearn", c = 'e' như bên dưới:
Codelearn
e
Thì màn hình sẽ hiển thị ra:
2
Giải thích: ký tự thứ 'e' xuất hiện 2 lần trong xâu "Codelearn"
*/
public class F70String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                answer = answer + 1; // answer++;
            }
        }
        System.out.println(answer);
    }
}
