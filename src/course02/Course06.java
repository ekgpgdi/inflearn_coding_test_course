package course02;

import java.util.Scanner;

public class Course06 {
    public boolean isCheck(int x) {
        if (x == 1) return false;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }

        return true;
    }

    public String solution(int[] dataSet) {
        String answer = "";

        for (int x : dataSet) {
            int tmp = 0;
            int t = 0;
            while (x > 0) {
                t = x % 10;
                tmp = tmp * 10 + t;
                x = x / 10;
            }

            if (isCheck(tmp)) answer += tmp + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dataSet = new int[n];

        for (int i = 0; i < n; i++) {
            dataSet[i] = in.nextInt();
        }

        System.out.println(T.solution(dataSet));
    }
}
