package course04;

import java.util.HashMap;
import java.util.Scanner;

// 투표에 따른 학급회장
public class Course01 {
  public char solution(int n, String str) {
    char answer = 0;
    HashMap<Character, Integer> voteCountList = new HashMap<>();

    for(char c : str.toCharArray()) {
      voteCountList.put(c, voteCountList.getOrDefault(c, 0) + 1);
    }

    int max = 0;
    for(char c : voteCountList.keySet()) {
      if(voteCountList.get(c) > max) {
        max = voteCountList.get(c);
        answer = c;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Course01 T = new Course01();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String str = in.next();

    System.out.println(T.solution(n, str));
  }
}
