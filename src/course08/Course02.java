package course08;

import java.util.Scanner;

public class Course02 {
    static int limit, max = 0;


    public void DFS(int index, int sum, int[] weightList) {
        if (sum > limit) return;
        if (index == weightList.length) {
            if (sum > max) max = sum;
        } else {
            DFS(index + 1, sum + weightList[index], weightList);
            DFS(index + 1, sum, weightList);
        }
    }

    public static void main(String[] args) {
        Course02 T = new Course02();
        Scanner in = new Scanner(System.in);
        limit = in.nextInt();
        int n = in.nextInt();
        int[] weightList = new int[n];

        for (int i = 0; i < n; i++) {
            weightList[i] = in.nextInt();
        }

        T.DFS(0, 0, weightList);

        System.out.println(max);
    }
}
