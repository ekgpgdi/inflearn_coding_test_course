package course10;

import java.util.Scanner;

public class Course02 {
    /*
        한 칸 또는 두 칸씩 건너뛰면서 개울을 건너는 방법
     */
    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Course02 T = new Course02();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dy = new int[n + 2];

        System.out.print(T.solution(n + 1));
    }
}
