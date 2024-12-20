package course05;

import java.util.*;
import java.util.Scanner;

public class Course04 {
  public int solution(String str) {
    Stack<Integer> stack = new Stack<>();

    for (char c : str.toCharArray()) {
      if (Character.isDigit(c)) {
        stack.push(Character.getNumericValue(c));
      } else {
        if (c == '+') {
          stack.push(stack.pop() + stack.pop());
        } else if (c == '-') {
          int a = stack.pop();
          int b = stack.pop();
          stack.push(b - a);
        } else if (c == '*') {
          stack.push(stack.pop() * stack.pop());
        } else {
          int a = stack.pop();
          int b = stack.pop();
          stack.push(b / a);
        }
      }
    }

    return stack.pop();
  }

  public static void main(String[] args) {
    Course04 T = new Course04();
    Scanner in = new Scanner(System.in);
    String str = in.next();

    System.out.println(T.solution(str));
  }
}
