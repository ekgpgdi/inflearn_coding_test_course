package course01;

import java.util.Scanner;

// 각 문자의 연속 반복 횟수 표기
public class Course11 {
    public String solution(String str) {
        String answer = "";
//        char target = str.charAt(0);
//        int count = 0;
//
//        for (char c : str.toCharArray()) {
//            if (c == target) {
//                count++;
//            } else {
//                answer += target;
//                if (count > 1) {
//                    answer += count;
//                }
//                target = c;
//                count = 1;
//            }
//        }
//
//        if (count == 1) {
//            answer += target;
//        } else {
//            answer += target;
//            answer += count;
//        }

        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Course11 T = new Course11();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
