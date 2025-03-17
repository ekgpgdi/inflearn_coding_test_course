package course10;

import java.util.Arrays;
import java.util.Scanner;

public class Course05 {
    /*
        동전 교환, 냅색 알고리즘
     */
    static int[] dy;

    public int solution(int[] coin, int max) {
        dy = new int[max + 1];
        // dy[i] : i 금액을 만드는데 드는 최소 동전 개수

        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;

        for (int i = 0; i < max; i++) {
            for (int j = coin[i]; j <= max; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }

        return dy[max];
    }

    public static void main(String[] args) {
        Course05 T = new Course05();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] coin = new int[n];

        for (int i = 0; i < n; i++) coin[i] = in.nextInt();

        int max = in.nextInt();

        System.out.print(T.solution(coin, max));
    }
}
