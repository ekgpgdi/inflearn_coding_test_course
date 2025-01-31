package course08;

import java.util.Scanner;

public class Course04 {
    static int a, b;
    static int[] pm;

    // 중복 순열
    public void DFS(int L) {
        if (L == b) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 1; i <= a; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Course04 T = new Course04();
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        pm = new int[b];

        T.DFS(0);
    }
}
