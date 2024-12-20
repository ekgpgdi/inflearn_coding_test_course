package course05;

import java.util.*;
import java.util.Scanner;

public class Course06 {
  public int solution(int member, int k) {
    Queue<Integer> queue = new LinkedList<>();

    for(int i = 1; i <= member; i++) {
      queue.offer(i);
    }

    while(queue.size() > 1) {
      for(int i = 0; i < k - 1; i ++) {
        queue.offer(queue.poll());
      }
      queue.poll();
    }

    return queue.poll();
  }

  public static void main(String[] args) {
    Course06 T = new Course06();
    Scanner in = new Scanner(System.in);
    int member = in.nextInt();
    int k = in.nextInt();

    System.out.println(T.solution(member, k));
  }
}
