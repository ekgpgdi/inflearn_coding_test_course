package course07;

import java.util.Scanner;

public class Course06 {
    static int n;
    static int[] ch; // 부분집합 원소로 사용한다 안한다의 체크 배열

    // 부분 집합 구하기
    public void DFS(int s) {
        if (s == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[s] = 1;
            DFS(s + 1);
            ch[s] = 0;
            DFS(s + 1);
        }
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ch = new int[n + 1];
        T.DFS(1);
    }
}
