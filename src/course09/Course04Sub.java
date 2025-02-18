package course09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture2 implements Comparable<Lecture2> {
    public int money, day;

    public Lecture2(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture2 o) {
        return o.day - this.day;
    }
}

public class Course04Sub {

    // priorityQueue 사용
    public int solution(ArrayList<Lecture2> lectureList) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(lectureList);
        int max = lectureList.get(0).day;

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < lectureList.size(); j++) {
                if(lectureList.get(j).day < i) break;
                pQ.offer(lectureList.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Course04Sub T = new Course04Sub();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Lecture2> lectureList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int money = in.nextInt();
            int day = in.nextInt();

            lectureList.add(new Lecture2(money, day));
        }
        System.out.print(T.solution(lectureList));
    }
}
