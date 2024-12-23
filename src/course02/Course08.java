package course02;

import java.util.Scanner;

// 등수 구하기
public class Course08 {

    public int[] solution(int[] dataSet) {
        int[] grade = new int[dataSet.length];

        for (int i = 0; i < dataSet.length; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (dataSet[j] > dataSet[i]) count++;
            }
            grade[i] += count;
        }

        return grade;
    }

    public static void main(String[] args) {
        Course08 T = new Course08();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dataSet = new int[n];

        for (int i = 0; i < n; i++) {
            dataSet[i] = in.nextInt();
        }

        for (int x : T.solution(dataSet)) {
            System.out.print(x + " ");
        }
    }
}
