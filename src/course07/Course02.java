package course07;

import java.util.Scanner;

public class Course02 {
    static String answer = "";

    // 이진수
    public void solution(int s) {
        if (s == 0) return;
        else {
            solution(s / 2);
            answer += s % 2;
        }
    }

    public static void main(String[] args) {
        Course02 T = new Course02();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        T.solution(number);
        System.out.println(answer);
    }
}
