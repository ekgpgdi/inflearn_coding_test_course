package course09;

import java.util.Scanner;

public class Course06 {
    // 서로소 집합 Disjoint-Set -> Union&Find 알고리즘
    static int[] unf;

    // Find : 집합 번호를 Return
    public int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]); // 같은 집합의 경우 모두 같은 집합 번호 수로 맞춰줌
    }

    public void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb; // 동일한 집합 번호로 맞춰줌 : 압축
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            T.Union(a, b);
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int fa = T.Find(a);
        int fb = T.Find(b);

        if(fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
