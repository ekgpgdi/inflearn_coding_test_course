package course01;

import java.util.Scanner;

public class Course06 {
    public String solution(String str) {
        String answer = "";

//        for(char c : str.toCharArray()) {
//            if(!answer.contains(String.valueOf(c))) {
//                answer += c;
//            }
//        }

        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Course06 T = new Course06();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
