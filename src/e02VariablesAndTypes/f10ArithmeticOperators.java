package e02VariablesAndTypes;

import java.util.Scanner;

/*Bài tập
Cho một số nguyên x được nhập vào từ bàn phím. Chương trình thực hiện các toán tử số học với x như sau:
x++; --x; x--; --x; ++x;
Hãy tính toán giá trị của x và in ra màn hình.
Ví dụ
Với x = 5, thì in ra màn hình 4 vì x sẽ thay đổi giá trị như sau
6->5->4->3->4
Đầu vào:  số nguyên x nhập vào từ bàn phím
Đầu ra: in ra màn hình giá trị của x
Thời gian chạy: 0.5 giây
Gợi ý
Sử dụng các toán tử số học được miêu tả dưới đây để viết một chương trình Java
Lý thuyết
Mục tiêu
Sinh viên hiểu về khái niệm của toán tử số học và cách sử dụng nó trong bài toán thực tế.
Tổng quan
Các toán tử đơn nguyên tăng và giảm : ++  -
Đoạn code sau cho thấy cách các toán tử ++ và -- hoạt động, tùy thuộc vào vị trí của chúng, trước biến (tiền tố) hoặc sau biến (hậu tố):
int i = 2;
System.out.println(++i);        //prints: 3
System.out.println("i=" + i);   //prints: i=3
System.out.println(--i);        //prints: 2
System.out.println("i=" + i);   //prints: i=2
System.out.println(i++);        //prints: 2
System.out.println("i=" + i);   //prints: i=3
System.out.println(i--);        //prints: 3
System.out.println("i=" + i);   //prints: i=2
Nếu được đặt làm tiền tố, nó thay đổi giá trị của biến 1 đơn vị trước khi giá trị của biến được trả về. Nhưng khi được đặt làm hậu tố, nó thay đổi giá trị của biến 1 đơn vị sau khi giá trị của biến được trả về.
Biểu thức ++x làm tăng biến x trước khi trả về kết quả, trong khi biểu thức x++ trả về kết quả trước và tăng biến x sau đó.
Cần có thời gian để làm quen với điều này. Nhưng một khi bạn làm thành thục, sẽ dễ dàng để viết ++ x; hoặc x ++, thay vì x = x + 1;. Sử dụng tiền tố hoặc hậu tố tăng, trong trường hợp này, không tạo ra sự khác biệt bởi cuối cùng chúng đều tăng x 1 đơn vị:
int x = 0;
++x;
System.out.println(x);   //prints: 1
x = 0;
x++;
System.out.println(x);   //prints: 1
Sự khác biệt giữa tiền tố và hậu tố chỉ xuất hiện khi giá trị được trả về đang được sử dụng, không phải giá trị của biến sẽ có sau khi đã trả về.
Toán tử nhị phân + cho Chuỗi:
Trong trường hợp của String, toán tử nhị phân + có nghĩa là nối chuỗi và toán tử trên thường được gọi là toán tử ghép:
String s1 = "Nick";
String s2 = "Samoylov";
System.out.println(s1 + " " + s2);  //prints: Nick Samoylov
String s3 = s1 + " " + s2;
System.out.println(s3);             //prints: Nick Samoylov*/
public class f10ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); //get x from input
        int y = x;
        x++;
        --x;
        x--;
        --x;
        ++x;
        System.out.println(y + x -y); //the value of x represented by y
    }
}
