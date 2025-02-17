package course08;

import java.util.Scanner;

public class Course13 {
    // 상하좌우 대각선에 인접한 1의 그룹의 개수

    static int n;
    static int[][] arr;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void DFS(int x, int y) {
        arr[x][y] = 0;

        for (int i = 0; i < dx.length; i++) {
            for (int j = 0; j < dy.length; j++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                    DFS(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Course13 T = new Course13();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    T.DFS(i, j);
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
