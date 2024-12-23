package course02;

import java.util.Scanner;

// 소수 개수 : 에라토스네스 체
public class Course05 {
    public int solution(int n) {
        int answer = 0;
        int[] checkList = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (checkList[i] == 0) answer++;
            for (int j = i; j <= n; j += i) {
                checkList[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course05 T = new Course05();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(T.solution(n));
    }
}
