package course08;

import java.util.Arrays;
import java.util.Scanner;

public class Course01 {
    static int total, number;
    static String answer;
    static boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        if (L == number) {
            if (sum == total / 2) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Course01 T = new Course01();
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        int[] numberList = new int[number];

        for (int i = 0; i < number; i++) {
            numberList[i] = in.nextInt();
        }
        total = Arrays.stream(numberList).sum();

        T.DFS(0, 0, numberList);

        System.out.println(answer);
    }
}
