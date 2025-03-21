package course07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Course08 {
    int[] dis = {1, -1, 5};
    int[] ch;

    Queue<Integer> Q = new LinkedList<>();

    // BFS
    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                if (x == e) return L;

                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return L + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return L;
    }

    public static void main(String[] args) {
        Course08 T = new Course08();
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(T.BFS(start, end));
    }
}
