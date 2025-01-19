package course06;

import java.util.Arrays;
import java.util.Scanner;

public class Course09 {
    // 결정 알고리즘
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;

        for (int a : arr) {
            if (capacity >= sum + a) {
                sum += a;
            } else {
                cnt++;
                sum = a;
            }
        }

        return cnt;
    }

    private int solution(int[] dataSet, int x) {
        int answer = 0;

        int lt = Arrays.stream(dataSet).max().getAsInt();
        int rt = Arrays.stream(dataSet).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(dataSet, mid) <= x) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course09 T = new Course09();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int x = in.nextInt();

        int[] dataSet = new int[size];
        for (int i = 0; i < size; i++) {
            dataSet[i] = in.nextInt();
        }

        System.out.print(T.solution(dataSet, x));
    }
}
