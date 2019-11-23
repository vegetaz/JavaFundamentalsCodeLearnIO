package e6Arrays;

import java.util.Scanner;
/*Viết chương Java nhập vào từ bàn phím ma trận 2D myMatrix sau đó tìm giá trị lớn nhất của ma trận 2D ròi in ra màn hình.
Ví dụ
Với đầu vào là myMatrix =
[25, 14, 56, 15, 36]
[15, 5 , 15,  5, 35]
[15, 66, 5 , 27, 18]
Đầu ra sẽ là "The max value is: 66"
Đầu vào: int[,] myMatrix input from keyboard
Guaranteed constraints:
1 ≤ myMatrix.row ≤ 100, 1 ≤ myMatrix.column ≤ 100
1 ≤ myMatrix.element ≤ 10000
Đầu ra: string (giá trị lớn nhất trong ma trận như mẫu sau  "The max value is: ...")
Thời gian chạy: 1 giây
*/
public class f39MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] myMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                myMatrix[i][j] = scanner.nextInt();
            }
        }

        int max = myMatrix[0][0];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(max < myMatrix[i][j]){
                    max = myMatrix[i][j];
                }
            }
        }

        System.out.println("The max value is: " + max);
    }
}
