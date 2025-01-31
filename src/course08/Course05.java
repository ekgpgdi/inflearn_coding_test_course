package course08;

import java.util.Arrays;
import java.util.Scanner;

public class Course05 {
    static int a, limit, min = Integer.MAX_VALUE;
    static int[] arr;

    public void DFS(int sum, int count) {
        if (sum > limit) return;
        if (count > min) return;

        if (sum == limit) {
            min = Math.min(min, count);
        } else {
            for (int i = a - 1; i >= 0; i--) {
                DFS(sum + arr[i], count + 1);
            }
        }
    }

    public static void main(String[] args) {
        Course05 T = new Course05();
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        limit = in.nextInt();
        Arrays.sort(arr);

        T.DFS(0, 0);
        System.out.println(min);
    }
}
