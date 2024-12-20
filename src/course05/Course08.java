package course05;

import java.util.*;
import java.util.Scanner;

class Person {
  int index;
  int number;

  Person(int index, int number) {
    this.index = index;
    this.number = number;
  }
}

public class Course08 {
  public int solution(int[] personList, int checkPoint) {
    Queue<Person> queue = new LinkedList<>();
    for (int i = 0; i < personList.length; i++) {
      queue.offer(new Person(i, personList[i]));
    }

    int count = 0;
    while (!queue.isEmpty()) {
      Person target = queue.poll();
      for (Person x : queue) {
        if (target.number < x.number) {
          queue.offer(target);
          target = null;
          break;
        }
      }
      if(target!=null) {
        count ++;
        if(target.index == checkPoint) {
          return count;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Course08 T = new Course08();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int checkPoint = in.nextInt();

    int[] personList = new int[count];

    for (int i = 0; i < count; i++) {
      personList[i] = in.nextInt();
    }

    System.out.println(T.solution(personList, checkPoint));
  }
}
