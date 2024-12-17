package course02;

import java.util.Scanner;

public class Course11 {

    public int solution(int[][] dataSet) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < dataSet.length; i++) {
            int count = 0;
            for (int j = 0; j < dataSet[i].length; j++) {
                int ban = dataSet[i][j];
                for (int x = 0; x < j; x++) {
                    if(ban == dataSet[x][i]) count ++;
                }
                for (int x = j + 1; x < dataSet.length; x++) {
                    if(ban == dataSet[x][i]) count ++;

                }
            }
            if(count > max) {
                max = count;
                answer = i;
            }
        }

        return answer + 1;
    }

    public static void main(String[] args) {
        Course11 T = new Course11();
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
