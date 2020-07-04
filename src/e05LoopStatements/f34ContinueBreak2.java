package e05LoopStatements;

import java.util.Scanner;
/*
Cho một mảng số nguyên arrayOfInts.
Hãy viết chương trình cho phép nhập vào một số nguyên number sau đó in ra màn hình vị trí của số number trong mảng arrayOfInts.
Nếu số number tồn tại trong mảng, in ra dòng chữ "Found {number} at index {index}".
Nếu số này không tồn tại trong mảng, in ra dòng chữ "{number} is not in arrayOfInts"
Ví dụ:
Với đầu vào là arrOfInts = {1,2,3,4,5}; number = 2 thì in ra màn hình dòng chữ "Found 2 at index 1"
Với đầu vào là arrOfInts = {1,2,3,4,5}; number = 6 thì in ra màn hình dòng chứ "6 is not in arrayOfInts"
Đầu vào: mảng số nguyên arrayOfInts, số nguyên number
Đầu ra: in ra màn hình vị trí của số number trong mảng arrayOfInts theo yêu cầu đề bài.
Thời gian chạy: 0.5 giây
*/
public class f34ContinueBreak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();

        int[] arrayOfInts = new int[len];
        for (int i = 0; i < len; i++) {
            arrayOfInts[i] = scanner.nextInt();
        }

        int number= scanner.nextInt();

        boolean foundIt = false;
        int index = 0;

        for(int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == number) {
                foundIt = true;
                index = i;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + number + " at index " + index);
        } else {
            System.out.println(number + " not in the array");
        }

    }
}
