package course02;

import java.util.Scanner;

public class Course03 {
  // 1:가위, 2:바위, 3:보로
  private String[] solution(int[] aDataSet, int[] bDataSet) {
    String[] answer = new String[aDataSet.length];

    for (int i = 0; i < aDataSet.length; i++) {
      if(aDataSet[i] == bDataSet[i]) {
        answer[i] = "D";
      } else if(!(aDataSet[i] == 3 && bDataSet[i] ==1) && !(aDataSet[i] == 1 && bDataSet[i] ==3)) {
        if(aDataSet[i] < bDataSet[i]) {
          answer[i] = "B";
        } else {
          answer[i] = "A";
        }
      } else {
        if(aDataSet[i] == 3 && bDataSet[i] == 1) {
          answer[i] = "B";
        } else if(aDataSet[i] == 1 && bDataSet[i] == 3) {
          answer[i] = "A";
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Course03 T = new Course03();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();
    int[] aDataSet = new int[count];
    int[] bDataSet = new int[count];
    for (int i = 0; i < count; i++) {
      aDataSet[i] = in.nextInt();
    }
    for (int i = 0; i < count; i++) {
      bDataSet[i] = in.nextInt();
    }

    for(String s : T.solution(aDataSet, bDataSet)) {
      System.out.println(s);
    }
  }
}
