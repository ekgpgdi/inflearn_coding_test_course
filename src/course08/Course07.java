package course08;

import java.util.Scanner;

public class Course07 {
    // N개에서 r개를 계산하는 공식 : n! / (n-r)!  * r! OR nCr = n-1Cr-1 + n-1Cr
    public static int[][] arr;

    // 조합의 수
    public int DFS(int n, int m) {
        if (arr[n][m] != 0) return arr[n][m];
        if (m == 1) return n;
        if (n == m) return 1;
        return arr[n][m] = DFS(n - 1, m - 1) + DFS(n - 1, m);
    }

    public static void main(String[] args) {
        Course07 T = new Course07();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        arr = new int[n + 1][n + 1];
        T.DFS(n, m);

        System.out.println(arr[n][m]);
    }
}
