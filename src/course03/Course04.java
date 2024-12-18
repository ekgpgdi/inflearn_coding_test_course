package course03;

import java.util.Scanner;

public class Course04 {
    public int solution(int[] dataSet, int k) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < dataSet.length; rt++) {
            sum += dataSet[rt];
            if (sum == k) answer++;

            while (sum >= k) {
                sum -= dataSet[lt++];

                if(sum == k) answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course04 T = new Course04();
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
