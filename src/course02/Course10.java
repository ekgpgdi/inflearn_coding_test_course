package course02;

import java.util.Scanner;

// 각 격자판 숫자 중 자신의 상하좌우 숫자보다 큰 숫자 수를 출력
public class Course10 {

    public int solution(int[][] dataSet) {
        int answer = 0;
//        int[][] newDataSet = new int[dataSet.length + 2][dataSet[0].length + 2];
//
//        for (int i = 0; i < newDataSet.length; i++) {
//            for (int j = 0; j < newDataSet[i].length; j++) {
//                if (i != 0 && j != 0 &&
//                        i != (newDataSet.length - 1) && j != (newDataSet.length - 1)) {
//                    newDataSet[i][j] = dataSet[i - 1][j - 1];
//                }
//            }
//        }
//
//        for (int i = 1; i < newDataSet.length - 1; i++) {
//            for (int j = 1; j < newDataSet[i].length - 1; j++) {
//                if (newDataSet[i][j] > newDataSet[i - 1][j] &&
//                        newDataSet[i][j] > newDataSet[i][j - 1] &&
//                        newDataSet[i][j] > newDataSet[i][j + 1] &&
//                        newDataSet[i][j] > newDataSet[i + 1][j]) {
//                    answer++;
//                }
//            }
//        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < dataSet.length; i++) {
            for (int j = 0; j < dataSet[i].length; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >= 0 && nx < dataSet.length && ny >= 0 && ny <= dataSet[i].length && dataSet[nx][ny] >= dataSet[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course10 T = new Course10();
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
