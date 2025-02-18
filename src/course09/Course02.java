package course09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meet implements Comparable<Meet> {
    public int start, end;

    public Meet(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meet o) {
        if (o.end != this.end) return this.end - o.end;
        return this.start - o.start;
    }
}

public class Course02 {

    public int solution(ArrayList<Meet> meetList) {
        Collections.sort(meetList);
        int answer = 0;
        int lastMeetEndTime = 0;

        for (Meet meet : meetList) {
            if (lastMeetEndTime <= meet.start) {
                lastMeetEndTime = meet.end;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course02 T = new Course02();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Meet> meetList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            int end = in.nextInt();

            meetList.add(new Meet(start, end));
        }
        System.out.print(T.solution(meetList));
    }
}
