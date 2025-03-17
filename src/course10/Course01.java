package course10;

import java.util.Scanner;

public class Course01 {
    /*
        1, 2 계단을 통해 n 계단에 도달할 수 있는 경우의 수
     */
    static int answer = 0;
    static int max;
    static int[] dy;

//    public void solution(int L, int n) {
//        if (n == max) answer++;
//        else {
//            solution(L + 1, n + 1);
//            if (n + 2 <= max) solution(L + 1, n + 2);
//        }
//    }

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Course01 T = new Course01();
        Scanner in = new Scanner(System.in);
        max = in.nextInt();
        dy = new int[max + 1];

//        T.solution(0, 0);
//        System.out.print(answer);

        System.out.print(T.solution(max));
    }
}
