package course02;

import java.util.Scanner;

public class Course01 {
  private String solution(int[] dataSet) {
    String answer = dataSet[0] + " ";

    for (int i = 1; i < dataSet.length; i++) {
      if(dataSet[i] > dataSet[i-1]) {
        answer += dataSet[i] + " ";
      }
    }

    return answer.trim();
  }

  public static void main(String[] args) {
    Course01 T = new Course01();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] dataSet = new int[count];
    for(int i = 0; i< count; i++) {
      dataSet[i] = in.nextInt();
    }
    System.out.println(T.solution(dataSet));
  }
}
