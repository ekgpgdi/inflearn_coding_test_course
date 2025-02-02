package course08;

import java.util.Scanner;

public class Course08 {
    //    순열 추측하기 : 파스칼의 삼각형 (위의 두개를 더한 값이 아래 값으로)
    //    이때 첫번 째 줄은 n-1C1  n-1C2 n-1C3 ... 의 규칙으로 곱한게 최하단 값이 됨
    public static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    static int[][] dy;

    public int combi(int n, int m) {

    }

    public void DFS(int L, int sum) {
        
    }

    public static void main(String[] args) {
        Course08 T = new Course08();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        f = in.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1];
        dy = new int[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }

        T.DFS(0, 0);
    }
}
