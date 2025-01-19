package course06;

import java.util.Arrays;
import java.util.Scanner;

public class Course10 {
    // 결정 알고리즘
    public int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    private int solution(int[] dataSet, int x) {
        int answer = 0;
        Arrays.sort(dataSet);

        int lt = 1;
        int rt = dataSet[dataSet.length - 1];

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(dataSet, mid) >= x) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Course10 T = new Course10();
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
