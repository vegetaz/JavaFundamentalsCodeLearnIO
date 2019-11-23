package e1FirstProgramAndComments;
/*Bài tập
Viết chương trình Java để đảm bảo bạn hiểu cách sử dụng các kiểu biến nguyên thủy.
Khởi tạo và in ra màn hình mỗi giá trị vào một dòng.
Đầu vào: không có
Đầu ra: hiển thị kết quả ra như sau:
9
20000
101000
21474836475
false
Gợi ý
Sử dụng các biến nguyên thuỷ được nhắc đến trong bài để viết chương trình.*/
public class f05DataTypes {
    public static void main(String[] args) {
        byte myByte = 9;
        short myShort = 20000;
        int myInt = 101000;
        long myLong = 21474836475L;
        boolean myBool = false;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myBool);
    }
}
