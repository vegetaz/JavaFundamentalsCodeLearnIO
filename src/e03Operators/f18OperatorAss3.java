package e03Operators;

import java.util.Scanner;

/*
Viết một chương trình Java để đổi vị trí 2 số cuối cùng của một số tự nhiên.
Ví dụ:
Với n = 12345, kết quả sẽ là 12354.
Đầu vào: Một số tự nhiên n được nhập từ bàn phím
Điều kiện:
100 ≤ n ≤ 1000000
Đầu ra: số tự nhên sau khi đổi 2 số cuối cùng
Thời gian chạy: 1s
*/
public class f18OperatorAss3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();

        double sSec = distance / ((hour * 60.0 * 60.0) + (min * 60.0) + sec);
        double sHour = (distance/1000.0) / (hour + (min / 60.0) + sec/60.0/60.0);

        System.out.println("Your speed in meters/second is " + sSec);
        System.out.println("Your speed in km/h is " + sHour);
    }
}
