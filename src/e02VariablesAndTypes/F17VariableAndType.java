package e02VariablesAndTypes;
/*
* Bạn hãy viết chương trình hiển thị ký tự 'd' ra màn hình.
* */
public class F17VariableAndType {
    public static void main(String[] args) {
        char d = 'a' + 3;
        /*
        * Ký tự a có giá trị là 97 trong bảng mã ASCII
        * 97 + 3 = 100
        * 100 là giá trị của d trong bảng mã ASCII
        * Reference: https://www.javatpoint.com/java-int-to-char
        * */
        System.out.println(d);
    }
}
