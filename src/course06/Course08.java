package course06;

import java.util.Arrays;
import java.util.Scanner;

public class Course08 {
    private int solution(int[] dataSet, int checkPoint) {
        int answer = 0;
        Arrays.sort(dataSet);

        int lt = 0;
        int rt = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (dataSet[mid] == checkPoint) {
                answer = mid + 1;
                break;
            }

            if (dataSet[mid] > checkPoint) rt = mid - 1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Course08 T = new Course08();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int checkPoint = in.nextInt();
        int[] dataSet = new int[size];
        for (int i = 0; i < size; i++) {
            dataSet[i] = in.nextInt();
        }

        System.out.println(T.solution(dataSet, checkPoint));

    }
}
