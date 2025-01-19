package course06;

import java.util.Scanner;

public class Course09 {


    private int solution(int[] dataSet, int x) {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        Course09 T = new Course09();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int x = in.nextInt();

        int[] dataSet = new int[size];
        for (int i = 0; i < size; i++) {
            dataSet[i] = in.nextInt();
        }

        System.out.print(T.solution(dataSet, x));
    }
}
