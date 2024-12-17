package course02;

import java.util.Scanner;

public class Course09 {

    public int solution(int[][] dataSet) {
        int answer = 0;

        // 가로줄
        for (int i = 0; i < dataSet.length; i++) {
            int tmp = 0;
            for (int j = 0; j < dataSet[i].length; j++) {
                tmp += dataSet[i][j];
            }
            if(tmp > answer) answer = tmp;
        }

        // 세로줄
        for (int i = 0; i < dataSet.length; i++) {
            int tmp = 0;
            for (int j = 0; j < dataSet[i].length; j++) {
                tmp += dataSet[j][i];
            }
            if(tmp > answer) answer = tmp;
        }

        int tmp = 0;
        // 우측 대각선
        for(int i =0; i<dataSet[0].length; i++) {
            tmp += dataSet[i][i];
        }

        if(tmp > answer) answer = tmp;

        tmp = 0;
        // 왼쪽 대각선
        for(int i =0; i<dataSet[0].length; i++) {
            tmp += dataSet[i][(dataSet[0].length - i - 1)];
        }

        if(tmp > answer) answer = tmp;

        return answer;
    }

    public static void main(String[] args) {
        Course09 T = new Course09();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] dataSet = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dataSet[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solution(dataSet));
    }
}
