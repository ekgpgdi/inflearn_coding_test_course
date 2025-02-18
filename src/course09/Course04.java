package course09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money, day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        if (o.money == this.money) return o.day - this.day;
        else return o.money - this.money;
    }
}

public class Course04 {

    public int solution(ArrayList<Lecture> lectureList) {
        Collections.sort(lectureList);
        int answer = 0;
        int day = lectureList.get(0).day;

        for (Lecture L : lectureList) {
            if (day <= L.day) {
                day--;
                answer += L.money;

                if(day == 0) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course04 T = new Course04();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Lecture> lectureList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int money = in.nextInt();
            int day = in.nextInt();

            lectureList.add(new Lecture(money, day));
        }
        System.out.print(T.solution(lectureList));
    }
}
