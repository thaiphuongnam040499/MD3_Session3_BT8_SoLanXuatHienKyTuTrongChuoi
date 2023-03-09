import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str= "anh hieu ngoc";
        char check = 'h';
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)==check){
                count++;
            }
        }
        System.out.println("Chuỗi của bạn là: "+str);
        System.out.println("Số lần xuất hiện của ký tự "+check+" trong chuỗi "+str+" la "+count);
    }
}
