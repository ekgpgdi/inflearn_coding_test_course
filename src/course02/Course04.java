package course02;

import java.util.Scanner;

// 피보나치 수열 : 앞 2개의 수를 합하여 다음 숫자가 되는 수열
public class Course04 {
  private int[] solution(int count) {
    int[] answer = new int[count];
    answer[0] = 1;
    answer[1] = 1;

    for (int i = 2; i < count; i++) {
      answer[i] = answer[i-2] + answer[i-1];
    }
    return answer;
  }

  public static void main(String[] args) {
    Course04 T = new Course04();
    Scanner in = new Scanner(System.in);
    int count = in.nextInt();

    for(int a : T.solution(count)) {
      System.out.print(a + " ");
    }
  }
}
