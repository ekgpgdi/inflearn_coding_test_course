package course05;

import java.util.*;
import java.util.Scanner;

public class Course05 {
  public int solution(String str) {
    Stack<Character> stack = new Stack<>();
    int answer = 0;

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (c == '(') stack.push(c);
      else {
        stack.pop();
        if (str.charAt(i - 1) == '(') {
          answer += stack.size();
        } else {
          answer++;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Course05 T = new Course05();
    Scanner in = new Scanner(System.in);
    String str = in.next();

    System.out.println(T.solution(str));
  }
}
