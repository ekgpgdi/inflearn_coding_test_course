package course08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point12 {
    public int x, y;

    public Point12(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Course12 {
    static int[] dx = new int[]{-1, 0, 1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static int[][] arr, dis;
    static Queue<Point> Q = new LinkedList<>();
    static int n, m;

    public void BFS() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    Q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Course12 T = new Course12();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        arr = new int[m][n];
        dis = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j]== 1) Q.offer(new Point(i,j));
            }
        }

        T.BFS();

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 0) {
                    System.out.println(-1);
                    break;
                }
                else {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
        }

        System.out.println(answer);
    }
}
