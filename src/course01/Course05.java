package course01;

import java.util.Scanner;

public class Course05 {
    public String solution(String str) {
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = c.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            }
            if (!Character.isAlphabetic(c[rt])) {
                rt--;
            }
            if (Character.isAlphabetic(c[lt]) && Character.isAlphabetic(c[rt])) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Course05 T = new Course05();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solution(str));
    }
}
