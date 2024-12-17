package course01;

import java.util.ArrayList;
import java.util.Scanner;

public class Course04 {
    public ArrayList<String> solution(String[] strList) {
        ArrayList<String> answer = new ArrayList<>();

//        for(String str : strList) {
//            String tmp = new StringBuilder(str).reverse().toString();
//            answer.add(tmp);
//        }

        for(String str : strList) {
            char[] s = str.toCharArray();
            int lt = 0;
            int rt = s.length - 1;

            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt ++;
                rt --;
            }

            answer.add(String.valueOf(s));
        }

        return answer;
    }

    public static void main(String[] args) {
        Course04 T = new Course04();
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] strList = new String[count];

        for(int i =0; i < count; i++) {
            strList[i] = in.next();
        }

        System.out.println(T.solution(strList));
    }
}
