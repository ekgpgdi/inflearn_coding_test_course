package course03;

import java.util.Scanner;

// 0과 1로 구성된 수열에서 최대 K 번 0을 1로 변경하여 1로만 구성된 최대 길이의 연속 부분 수열의 길이 출력
public class Course06 {
    public int solution(int[] dataSet, int k) {
        int answer = 0;
        int lt = 0;
        int count = 0;

        for(int rt = 0; rt < dataSet.length; rt ++) {
            if(dataSet[rt] == 0) count ++;

            while(count > k) {
                if(dataSet[lt] == 0) count --;
                lt ++;
            }

            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
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
