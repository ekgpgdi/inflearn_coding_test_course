package course01;

import java.util.Scanner;

// 팰린드롬 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열 (단, 알파벳만 가지고 회문 검사를 하며 대소문자 구분 X)
public class Course08 {
    public String solution(String str) {
//        String alphabetStr = "";
//
//        for(char c : str.toCharArray()) {
//            if(Character.isAlphabetic(c)) {
//                alphabetStr += c;
//            }
//        }
//
//        String tmp = new StringBuilder(alphabetStr).reverse().toString();
//        return alphabetStr.equalsIgnoreCase(tmp) ? "YES" : "NO";

        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(tmp) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Course08 T = new Course08();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(T.solution(str));
    }
}
