package course03;

import java.util.Scanner;

// 연속된 K일 동안의 최대 매출액
public class Course03 {
    public int solution(int[] dataSet, int k) {
        int max = 0;

        for (int i = 0; i < k; i++) {
            max += dataSet[i];
        }

        int sum = max;
        for (int i = k; i < dataSet.length; i++) {
            sum = sum + dataSet[i] - dataSet[i - k];
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Course03 T = new Course03();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] dataSet = new int[n];

        for (int i = 0; i < n; i++) {
            dataSet[i] = in.nextInt();
        }
        System.out.println(T.solution(dataSet, k));
    }
}
