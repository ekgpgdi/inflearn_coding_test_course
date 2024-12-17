package course01;

import java.util.Scanner;

public class Course02 {
    public String solution(String str) {
        String answer = "";

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course02 T = new Course02();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
