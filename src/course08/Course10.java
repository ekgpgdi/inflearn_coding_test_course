package course08;

import java.util.Scanner;

public class Course10 {
    // 도착점까지 갈 수 있는 경우의 수
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] arr = new int[7][7];
    static int answer = 0;

    public void DFS(int x, int y) {
        if (x == 6 && y == 6) answer++;
        else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    DFS(nx, ny);
                    arr[nx][ny] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Course10 T = new Course10();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        arr[0][0] = 1;
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
