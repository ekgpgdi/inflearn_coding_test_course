package course03;

import java.util.Scanner;

// 배열 오름차순으로 합치기
public class Course01 {
    public int[] solution(int[] aSet, int[] bSet) {
        int[] answer = new int[aSet.length + bSet.length];
        int p1 = 0;
        int p2 = 0;
        int index = 0;

        while (p1 < aSet.length && p2 < bSet.length) {
            if (aSet[p1] < bSet[p2]) {
                answer[index] = aSet[p1];
                index++;
                p1++;
            } else {
                answer[index] = bSet[p2];
                index++;
                p2++;
            }
        }

        for (int i = p1; i < aSet.length; i++) {
            answer[index] = aSet[i];
            index++;
        }

        for (int i = p2; i < bSet.length; i++) {
            answer[index] = bSet[i];
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Course01 T = new Course01();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] aSet = new int[a];

        for (int i = 0; i < a; i++) {
            aSet[i] = in.nextInt();
        }

        int b = in.nextInt();
        int[] bSet = new int[b];

        for (int i = 0; i < b; i++) {
            bSet[i] = in.nextInt();
        }

        for (int i : T.solution(aSet, bSet)) {
            System.out.print(i + " ");
        }
    }
}
