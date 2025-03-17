package course10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Problem {
    int score;
    int time;

    Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class Course06 {
    /*
        최대 점수 구하기, 냅색 알고리즘
        제한시간 M안에 N개의 문제 중 최대 점수
     */
    static int[] dy;

    public int solution(ArrayList<Problem> arr, int max) {
        dy = new int[max + 1];
        // dy[i] : j분이 주어졌을 때의 최대 점수

        for (Problem p : arr) {
            for (int i = max; i >= p.time; i--) {
                dy[i] = Math.max(dy[i], dy[i - p.time] + p.score);
            }
        }

        return dy[max];
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = in.nextInt();
        ArrayList<Problem> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr.add(new Problem(a, b));
        }

        System.out.print(T.solution(arr, max));
    }
}
