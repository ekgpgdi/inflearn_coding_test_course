package course07;

import java.util.Scanner;

public class Course03 {
    // 팩토리얼
    public int solution(int s) {
        if (s == 1) return 1;
        else {
            return s * solution(s - 1);
        }
    }

    public static void main(String[] args) {
        Course03 T = new Course03();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(T.solution(number));
    }
}
