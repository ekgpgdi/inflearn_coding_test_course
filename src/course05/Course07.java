package course05;

import java.util.*;
import java.util.Scanner;

public class Course07 {
  public String solution(String sequence, String dataSet) {
    Queue<Character> queue = new LinkedList<>();

    for(char x : sequence.toCharArray()) {
      queue.offer(x);
    }

    for(char x : dataSet.toCharArray()) {
      if(queue.contains(x)) {
        if(x != queue.poll()) return "NO";
      }
    }

    return queue.isEmpty() ? "YES" : "NO";
  }

  public static void main(String[] args) {
    Course07 T = new Course07();
    Scanner in = new Scanner(System.in);
    String sequence = in.next();
    String dataSet = in.next();

    System.out.println(T.solution(sequence, dataSet));
  }
}
