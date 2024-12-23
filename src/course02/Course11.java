package course02;

import java.util.Scanner;

// 행 : 학생, 열 : 반 가장 같은 반이었던 경우가 많은 학생 출력
public class Course11 {

    public int solution(int[][] dataSet) {
        int answer = 0;
        int max = 0;

        for (int i = 0; i < dataSet.length; i++) {
            int count = 0;
            for (int j = 0; j < dataSet.length; j++) {
                for(int k = 0; k < dataSet[i].length; k++) {
                    if(dataSet[i][k] == dataSet[j][k]) {
                        count ++;
                        break;
                    }
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
        int[][] dataSet = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                dataSet[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solution(dataSet));
    }
}
