package course06;

import java.util.Scanner;

public class Course03 {
  //  삽입정렬
  private int[] solution(int[] dataSet) {
    for (int i = 1; i < dataSet.length; i++) {
      int tmp = dataSet[i];
      int j = i - 1;
      for (; j >= 0; j--) {
        if (dataSet[j] > tmp) {
          dataSet[j + 1] = dataSet[j];
        } else break;
      }
      dataSet[j + 1] = tmp;
    }

    return dataSet;
  }

  public static void main(String[] args) {
    Course03 T = new Course03();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] dataSet = new int[count];
    for (int i = 0; i < count; i++) {
      dataSet[i] = in.nextInt();
    }
    for (int i : T.solution(dataSet)) {
      System.out.print(i + " ");
    }
  }
}
