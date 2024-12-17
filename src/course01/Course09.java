package course01;

import java.util.Scanner;

public class Course09 {
    public int solution(String str) {
//        String answer = "";
//
//        for(char c : str.toCharArray()) {
//            if(Character.isDigit(c)) {
//                answer += c;
//            }
//        }
//
//        return Integer.parseInt(answer);

        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
        }

        return answer;
    }

    public static void main(String[] args) {
        Course09 T = new Course09();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(T.solution(str));
    }
}
