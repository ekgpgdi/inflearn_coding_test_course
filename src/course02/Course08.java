package course02;

import java.util.Scanner;

public class Course08 {

    public int[] solution(int[] dataSet) {
        int[] grade = new int[dataSet.length];

        for (int i = 0; i < dataSet.length; i++) {
            grade[i] = 1;
            int max = dataSet[i];
            int count = 0;
            for (int j = 0; j < i; j++) {
                if(dataSet[j] < max) {
                    grade[j] += 1;
                } else if  (dataSet[j] > max) {
                    count++;
                }
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

        for(int x : T.solution(dataSet)) {
            System.out.print(x + " ");
        }
    }
}
