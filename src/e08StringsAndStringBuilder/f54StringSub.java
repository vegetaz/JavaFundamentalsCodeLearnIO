package e08StringsAndStringBuilder;
/*Bài tập
Hoàn thành bài tập sử dụng các phương thức về String (chuỗi) đã học.
Viết chương trình Java với các câu lệnh hoặc toán tử phù hợp để in ra màn hình kết quả trên một dòng .
Nhập vào từ bàn phím chuỗi str chứa các từ, khoảng trắng.
Nhiệm vụ của bạn là tìm ra tất cả các chuỗi con bắt đầu bỏi vị trí là một số chia hết cho n và độ dài của chuỗi con đó bằng n.
Không bao gồm chuỗi con chứa khoảng trắng và không bao gồm chuỗi con không có độ dài n.
Kết quả in là một chuỗi chuỗi con được phân tách bằng dấu gạch ngang "-".
Ví dụ:
Với đầu vào là str = “Fresher Academy”, n = 2 Đầu ra sẽ là  "Fr-es-he-Ac-ad-em"
Đầu vào: string str, integer n
Guaranteed constraints:
1 ≤ str.Length < 10^6.
1 ≤ n ≤ str.Length.
Đầu ra: String (chuỗi con được phân tách bằng dấu gạch ngang)
Thời gian chạy: 1 giây
Gợi ý
Sử dụng phương thức Substring hoặc Split với các toán tử phù hợp để giải bài toán trên.*/
import java.util.Scanner;

public class f54StringSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine(); //get string
        int n = scanner.nextInt(); //get number n

        // Standardization and separation
        String resultString = "";
        for(int i = 0; i <= inputString.length() - n; i = i + n){
            boolean check = true;
            for(int a = i; a < i + n; a++){
                if(inputString.charAt(a) == ' ') {
                    check = false;
                    break;
                }
            }
            if(check) {
                resultString = resultString + inputString.substring(i, i + n) + "-";
            }
        }
        resultString = resultString.substring(0, resultString.length() - 1);
        System.out.println(resultString);

    }
}
