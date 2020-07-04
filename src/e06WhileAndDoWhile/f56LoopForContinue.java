package e06WhileAndDoWhile;
/*
* Bạn hãy điền code vào dấu ... để màn hình hiển thị ra các số lẻ từ 1 tới 100.
* */
public class f56LoopForContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            /* Khi gặp câu lệnh continue trong vòng lặp, các đoạn code bên dưới câu lênh này trong vòng lặp sẽ không được thực thi. */
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
