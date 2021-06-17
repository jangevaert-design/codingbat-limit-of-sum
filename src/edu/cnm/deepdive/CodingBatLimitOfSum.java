package edu.cnm.deepdive;

/*

Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.

sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
 */

public class CodingBatLimitOfSum {

  public static void main(String[] args) {
    System.out.printf("with the ints %d and %d, the result is " + sumLimit(2, 3) + ".\n", 2, 3);
    System.out.printf("with the ints %d and %d, the result is " + sumLimit(8, 3) + ".\n", 8, 3);
    System.out.printf("with the ints %d and %d, the result is " + sumLimit(8, 1) + ".\n", 8, 1);
  }

  public static int sumLimit(int a, int b) {
    if (String.valueOf(a+b).length() > String.valueOf(a).length()) {
      return a;
    } else {
      return a + b;
    }
  }


}
