package course05;

import java.util.*;
import java.util.Scanner;

public class Course02 {
  public String solution(String str) {
    Stack<Character> stack = new Stack<>();
    String answer ="";

    for (char c : str.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (c == ')' && stack.size() > 0) {
        stack.pop();
      } else if(stack.isEmpty()) {
        answer += c;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Course02 T = new Course02();
    Scanner in = new Scanner(System.in);
    String str = in.next();
    System.out.println(T.solution(str));
  }
}
