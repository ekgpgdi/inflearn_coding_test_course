package course08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point14 {
    public int x, y;

    public Point14(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Course14 {
    static int n, answer = 0;
    static int[][] arr, dis;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point14> Q = new LinkedList<>();

    public void BFS(int x, int y) {
        Q.offer(new Point14(x, y));

        while (!Q.isEmpty()) {
            Point14 pos = Q.poll();

            for (int i = 0; i < dx.length; i++) {
                for (int j = 0; j < dy.length; j++) {
                    int nx = pos.x + dx[i];
                    int ny = pos.y + dy[i];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                        Q.offer(new Point14(nx, ny));
                        arr[nx][ny] = 0;
                    }
                }
            }
        }
    }

    public void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    BFS(i, j);
                    answer++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Course14 T = new Course14();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n][n];
        dis = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        T.solution();
        System.out.println(answer);
    }
}
