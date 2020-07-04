package e08StringsAndStringBuilder;
/*
Viết chương trình JAVA, trong đó người dùng nhập vào một chuỗi inputStr từ bàn phím.
Hãy đảo ngược ký tự của chuỗi inputStr và in ra màn hình.
Ví dụ: Với đầu vào inputStr= "Codelearn" thì in ra màn hình dòng chữ "nraeledoC"
Đầu vào: chuỗi inputStr
Đầu ra: In ra màn hình dòng chữ đảo ngược của chuỗi intputStr
Giới hạn thời gian chạy: 0.5 giây
Gợi ý: Sử dụng phương thức reverse() của StringBuilder để giải bài này
*/
import java.util.Scanner;

public class f57StringBuilder3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();  //get input from keyboard

        StringBuilder builder = new StringBuilder(inputStr);
        builder.reverse();
        System.out.println(builder.toString());
    }
}
