package course03;

import com.sun.tools.javac.Main;

import java.util.Scanner;

// 2개 이상의 연속된 자연수로 정수 K 를 표현하는 방법의 가지 수
public class Course05 {
    public int solution(int n) {
        int answer = 0;
        int lt = 1;
        int sum = 0;

        for (int rt = 1; rt <= (n / 2) + 1; rt++) {
            sum += rt;
            if (sum == n) {
                answer++;
            }

            while (sum > n) {
                sum -= lt;
                lt++;
                if (sum == n) {
                    answer++;
                }
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
