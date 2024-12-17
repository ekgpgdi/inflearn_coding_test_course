package course01;

import java.util.Scanner;

public class Course12 {
    public String solution(String str) {
        String answer = "";
        while(str.length() > 1) {
            String tmp = str.substring(0, 7);
            tmp = tmp.replace("#", "1");
            tmp = tmp.replace("*", "0");
            int i = Integer.parseInt(tmp, 2);
            answer += (char) i;
            str = str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        Course12 T = new Course12();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
