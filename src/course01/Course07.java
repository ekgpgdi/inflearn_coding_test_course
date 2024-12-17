package course01;

import java.util.Scanner;

public class Course07 {
    public String solution(String str) {
        str = str.toUpperCase();
//        int lt = 0;
//        int rt = str.length() - 1;
//
//        while(lt < rt) {
//            if(str.charAt(lt) != str.charAt(rt)) {
//                return "NO";
//            }
//
//            lt ++;
//            rt --;
//        }
//
//        return "YES";

//        for (int i = 0; i < str.length() / 2; i++) {
//            if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
//                return "NO";
//            }
//        }
//
//        return "YES";

        String tmp = new StringBuilder(str).reverse().toString();
        return str.equals(tmp) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Course07 T = new Course07();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
