package course09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Party implements Comparable<Party> {
    public int time;
    public char state;

    public Party(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Party o) {
        if (this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class Course03 {

    public int solution(ArrayList<Party> partyList) {
        Collections.sort(partyList);
        int answer = 0;
        int cnt = 0;

        for (Party p : partyList) {
            if (p.state == 's') cnt++;
            else cnt--;

            answer = Math.max(cnt, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Course03 T = new Course03();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Party> partyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = in.nextInt();
            partyList.add(new Party(start, 's'));
            int end = in.nextInt();
            partyList.add(new Party(end, 'e'));
        }
        System.out.print(T.solution(partyList));
    }
}
