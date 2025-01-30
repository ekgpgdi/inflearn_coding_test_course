package course07;

import java.util.Scanner;

public class Course12 {
    // DFS, 인접 행렬, n 노드를 가기 위한 경우의 수
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch; // 한 번 지나간 노드는 다시 가지 않기 위해서 체크

    public void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 0; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Course12 T = new Course12();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
