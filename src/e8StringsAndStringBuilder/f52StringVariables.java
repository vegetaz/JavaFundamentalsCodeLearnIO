package e8StringsAndStringBuilder;
/*
Viết một chương trình Java để hiển thị ra vị trí đầu tiên xuất hiện của chuỗi myString2 trong myString1
(không phân biệt hoa-thường) lên màn hình.
Ví dụ
Với đầu vào là "Code Learn", "Learn" Đầu ra sẽ là 5 vì chữ cái L trong chuỗi "Code Learn" có vị trí 5.
Đầu vào: hai- string myString1 và myString2
Đầu ra: int  (Vị trí xuất hiện của myString2 trong myString)
Giới hạn thời gian chạy: 1 giây
*/

import java.util.Scanner;

public class f52StringVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString1 = scanner.nextLine(); //get string1 from user input
        String myString2 = scanner.nextLine(); //get string2 from user input

        int index;
        index = myString1.toLowerCase().indexOf(myString2.toLowerCase());

        System.out.println(index);
    }
}
