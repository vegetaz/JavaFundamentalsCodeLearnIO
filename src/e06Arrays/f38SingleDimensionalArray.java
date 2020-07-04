package e06Arrays;
/*
* Viết một chưng trình Java nhập vào một số nguyên dương là kích thước của mảng,
* tiếp tục nhập các phần tử nguyên vào mảng, cuối cùng nhập một số nguyên dương từ bàn phím.
* Chương trình của bạn phải tìm và hiển thị vị trí index của số nhập vào cuối cùng trong mảng đã nhập
* như dạng sau "Index position is 0".
* Nếu số đó không ở trong mảng đã nhập thì hiển thị câu "Input number does not exist in array"
* */
import java.util.Scanner;

public class f38SingleDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] myArray = new int[len];
        for (int i = 0; i < len; i++) {
            myArray[i] = scanner.nextInt();
        }
        int value = scanner.nextInt();
        int i = 0;
        while ((i < len) && (myArray[i]) != value) {
            i++;
        }
        if (i > len - 1) {
            System.out.print("Input number does not exist in array");
        } else {
            System.out.print("Index position is " + i);
        }
    }
}
