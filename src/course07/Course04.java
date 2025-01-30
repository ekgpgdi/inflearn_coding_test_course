package course07;

import java.util.Scanner;

public class Course04 {
    // 피보나치
    public int solution(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else return solution(n - 2) + solution(n - 1);
    }

    public static void main(String[] args) {
        Course04 T = new Course04();
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(T.solution(number));
    }
}
