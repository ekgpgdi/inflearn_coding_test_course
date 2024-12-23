package course02;

import java.util.Scanner;

// 선생님이 볼 수 있는 학생의 수 (앞에 서있는 사람보다 크면 보임)
public class Course02 {
  private int solution(int[] dataSet) {
    int count = 1;
    int max = dataSet[0];

    for (int i = 1; i < dataSet.length; i++) {
      if (dataSet[i] > max) {
        max = dataSet[i];
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Course02 T = new Course02();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] dataSet = new int[count];
    for (int i = 0; i < count; i++) {
      dataSet[i] = in.nextInt();
    }
    System.out.println(T.solution(dataSet));
  }
}
