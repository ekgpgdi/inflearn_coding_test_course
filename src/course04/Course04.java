package course04;

import java.util.*;
import java.util.Scanner;

public class Course04 {
  public boolean checkAnagram(
      HashMap<Character, Integer> checkPointCountList,
      HashMap<Character, Integer> checkStrCountList) {
    return checkPointCountList.equals(checkStrCountList);
  }

  public int solution(String checkStr, String checkPoint) {
    int answer = 0;
    HashMap<Character, Integer> checkPointCountList = new HashMap<>();
    HashMap<Character, Integer> checkStrCountList = new HashMap<>();

    for (char c : checkPoint.toCharArray()) {
      checkPointCountList.put(c, checkPointCountList.getOrDefault(c, 0) + 1);
    }

    int lt = 0;
    int rt = 0;

    for (rt = 0; rt < checkPoint.length() - 1; rt++) {
      char c = checkStr.charAt(rt);
      checkStrCountList.put(c, checkStrCountList.getOrDefault(c, 0) + 1);
    }

    for (; rt < checkStr.length(); rt++) {
      char key = checkStr.charAt(rt);
      checkStrCountList.put(key, checkStrCountList.getOrDefault(key, 0) + 1);

      if (checkAnagram(checkPointCountList, checkStrCountList)) {
        answer++;
      }

      char preKey = checkStr.charAt(lt);
      checkStrCountList.put(preKey, checkStrCountList.get(preKey) - 1);
      if (checkStrCountList.get(preKey) == 0) checkStrCountList.remove(preKey);
      lt++;
    }

    return answer;
  }

  public static void main(String[] args) {
    Course04 T = new Course04();
    Scanner in = new Scanner(System.in);
    String checkStr = in.next();
    String checkPoint = in.next();

    System.out.println(T.solution(checkStr, checkPoint));
  }
}
