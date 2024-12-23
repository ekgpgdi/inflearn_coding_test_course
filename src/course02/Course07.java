package course02;

import java.util.Scanner;

// 연속적으로 답을 맞히는 경우에는 가산점 부과
public class Course07 {

    public int solution(int[] dataSet) {
        int answer = 0;
        int bonus = 0;

        for(int data : dataSet) {
            if(data == 1) {
                answer = answer + 1 + bonus;
                bonus ++;
            } else {
                bonus = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course07 T = new Course07();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dataSet = new int[n];

        for (int i = 0; i < n; i++) {
            dataSet[i] = in.nextInt();
        }

        System.out.println(T.solution(dataSet));
    }
}
