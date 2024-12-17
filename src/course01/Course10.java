package course01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course10 {
    public List<Integer> solution(String str, char c) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            int preIndex = str.substring(0, i).lastIndexOf(c);
            int nextIndex = str.substring(i).indexOf(c);

            if (i - preIndex >= 0 && i - preIndex < nextIndex) {
                answer.add(i - preIndex);
            } else {
                answer.add(nextIndex);
            }
        }
        return answer;

//        int[] answer = new int[str.length()];
//        int p = 1000;
//
//        for (int i = 0; i < answer.length; i++) {
//            if (str.charAt(i) == c) {
//                p = 0;
//                answer[i] = 0;
//            } else {
//                p++;
//                answer[i] = p;
//            }
//        }
//
//        p = 1000;
//
//        for (int i = answer.length - 1; i >= 0; i--) {
//            if(str.charAt(i) == c) p = 0;
//            else {
//                p ++;
//                if(p < answer[i]) answer[i] = p;
//            }
//        }
//
//        return answer;
    }

    public static void main(String[] args) {
        Course10 T = new Course10();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
