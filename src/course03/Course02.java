package course03;

import java.util.Scanner;
import java.util.*;

public class Course02 {
    public ArrayList<Integer> solution(int[] aSet, int[] bSet) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(aSet);
        Arrays.sort(bSet);

        int p1 = 0, p2 = 0;

        while(p1 < aSet.length && p2 < bSet.length) {
            if(aSet[p1] < bSet[p2]) {
                p1 ++;
            } else if(aSet[p1] > bSet[p2]) {
                p2 ++;
            } else {
                answer.add(aSet[p1]);
                p1 ++;
                p2 ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course02 T = new Course02();
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
