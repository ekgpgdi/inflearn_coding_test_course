package course10;

import java.util.Scanner;

public class Course03 {
    /*
        최대 부분 증가 수열
     */
    static int[] dy;

    public int solution(int[] arr) {
        int answer = 1;
        dy = new int[arr.length];
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Course03 T = new Course03();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = in.nextInt();

        System.out.print(T.solution(arr));
    }
}
