package course01;

import java.util.Scanner;

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
