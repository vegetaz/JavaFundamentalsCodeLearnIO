package e06WhileAndDoWhile;
/*
* Bạn hãy điền code vào dấu ... để màn hình hiển thị ra các số từ 1 tới 50.
* */
public class f55LoopForBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            /* Câu lệnh break là câu lệnh dùng để dừng một vòng lặp */
            if (i > 50) {
                break;
            }
            System.out.println(i + "");
        }
    }
}
