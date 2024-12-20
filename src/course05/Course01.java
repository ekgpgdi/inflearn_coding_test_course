package course05;

import java.util.*;
import java.util.Scanner;

public class Course01 {
  public String solution(String str) {
    Stack<Character> stack = new Stack<>();

    for (char c : str.toCharArray()) {
      if (c == '(') {
        stack.push(c);
      } else if (stack.size() > 0) {
        stack.pop();
      } else {
        return "NO";
      }
    }

    return stack.size() == 0 ? "YES" : "NO";
  }

  public static void main(String[] args) {
    Course01 T = new Course01();
    Scanner in = new Scanner(System.in);
    String str = in.next();
    System.out.println(T.solution(str));
  }
}
