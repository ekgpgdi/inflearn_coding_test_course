package course01;

import java.util.Scanner;

public class Course01 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char t : str.toCharArray()) {
            if(t == c) {
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Course01 T = new Course01();
        Scanner in=new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
