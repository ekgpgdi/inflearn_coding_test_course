package course10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Box implements Comparable<Box> {
    int width;
    int height;
    int weight;

    public Box(int width, int height, int weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Box ob) {
        return ob.width - this.width;
    }
}

public class Course04 {
    /*
        가장 높은 탑 쌓기
        밑면이 좁은 벽돌 위에 밑면이 넓은 벽돌은 놓을 수 없다.
        무게가 무거운 벽돌을 무게가 가벼운 벽돌 위에 놓을 수 없다.
     */
    static int[] dy;

    public int solution(ArrayList<Box> boxList) {
        Collections.sort(boxList);

        int answer = 0;
        int[] dy = new int[boxList.size()];
        dy[0] = boxList.get(0).height;
        answer = dy[0];

        // i 번쨰 벽돌을 가장 높게 올렸을때 아래 깔릴 수 있는 벽돌을 체크
        for (int i = 1; i < boxList.size(); i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (boxList.get(i).weight < boxList.get(j).weight && max < dy[j])
                    max = dy[j];
            }
            dy[i] = boxList.get(i).height + max;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Course04 T = new Course04();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Box> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            boxList.add(new Box(a, b, c));
        }

        System.out.print(T.solution(boxList));
    }
}
