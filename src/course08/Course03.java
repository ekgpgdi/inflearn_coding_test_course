package course08;

import java.util.Scanner;

public class Course03 {
    static int n, limit, max = 0;

    public void DFS(int index, int scoreSum, int timeSum, int[][] arr) {
        if (timeSum > limit) return;

        if (index == n) {
            max = Math.max(scoreSum, max);
        } else {
            DFS(index + 1, scoreSum + arr[index][0], timeSum + arr[index][1], arr);
            DFS(index + 1, scoreSum, timeSum, arr);
        }
    }

    public static void main(String[] args) {
        Course03 T = new Course03();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        limit = in.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        T.DFS(0, 0, 0, arr);

        System.out.println(max);
    }
}
