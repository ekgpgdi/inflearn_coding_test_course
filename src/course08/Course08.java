package course08;

import java.util.Scanner;

public class Course08 {
    //    순열 추측하기 : 파스칼의 삼각형 (위의 두개를 더한 값이 아래 값으로)
    //    이때 첫번 째 줄은 n-1C1  n-1C2 n-1C3 ... 의 규칙으로 곱한게 최하단 값이 됨
    public static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    static int[][] dy;

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }

    public void DFS(int L, int sum) {
        if (flag) return;

        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                System.out.println(" ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
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
