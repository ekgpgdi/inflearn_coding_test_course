package course01;

import java.util.Scanner;

// 문장 속 가장 긴 단어 출력
public class Course03 {
    public String solution(String str) {
        String answer = "";
        int maxLen = Integer.MIN_VALUE;
        int pos;

//        for(String s : str.split(" ")) {
//            if(s.length() > maxLen) {
//                maxLen = s.length();
//                answer = s;
//            }
//        }

        while (str.indexOf(" ") != -1) {
            pos = str.indexOf(" ");
            if (pos > maxLen) {
                maxLen = pos;
                answer = str.substring(0, pos);
            }

            str = str.substring(pos + 1);
        }

        if (str.length() > maxLen) answer = str;

        return answer;
    }

    public static void main(String[] args) {
        Course03 T = new Course03();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(T.solution(str));
    }
}
