package course08;

import java.util.ArrayList;
import java.util.Scanner;

class Point15 {
    public int x, y;

    public Point15(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Course15 {
    // 도착점까지 갈 수 있는 경우의 수
    static int n, m;
    static ArrayList<Point15> pz, hs;
    static int answer = Integer.MAX_VALUE;
    static int len;
    static int[] combi;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point15 h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(sum, answer);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Course15 T = new Course15();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = in.nextInt();
                if (tmp == 1) hs.add(new Point15(i, j));
                else if (tmp == 2) pz.add(new Point15(i, j));
            }
        }

        len = pz.size();
        combi = new int[m];

        T.DFS(0, 0);
        System.out.println(answer);
    }
}
