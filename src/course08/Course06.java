package course08;

import java.util.Scanner;

public class Course06 {

    // 순열 구하기
    public void solution(int n, int m, int[] arr) {
        int[] pm = new int[m];
        int[] ch = new int[n];

        DFS(0, m, arr, pm, ch);
    }

    public void DFS(int index, int m, int[] arr, int[] pm, int[] ch) {
        if (index == m) {
            for (int i = 0; i < index; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println(" ");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (ch[i] == 0) {
                    pm[index] = arr[i];
                    ch[i] = 1;
                    DFS(index + 1, m, arr, pm, ch);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        T.solution(n, m, arr);
    }
}
