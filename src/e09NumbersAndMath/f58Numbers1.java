package e09NumbersAndMath;
/*
Viết chương trình JAVA in ra màn hình giá trị lớn nhất của kiểu dữ liệu byte, int, long trên cùng một dòng
Đầu vào: byte , int, long
Đầu ra: in ra màn hình giá trị MAX_VALUE của từng kiểu byte, int, long
Thời gian chạy: 0.5 giây
Gợi ý: Nhớ lại về các kiểu dữ liệu số
*/
public class f58Numbers1 {
    public static void main(String args[]) {

        // integers, use MAX_VALUE to complete the missing code
        byte largestByte = Byte.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;

        // Display them all.
        System.out.printf("%d %d %d %n", largestByte, largestInteger, largestLong);
    }
}
