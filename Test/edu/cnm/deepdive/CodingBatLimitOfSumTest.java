package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatLimitOfSumTest {

  private int[][] limitParams = {
      {2, 3},
      {8, 3},
      {8, 1},
      {11, 39},
      {11, 99},
      {0, 0},
      {99, 0},
      {99, 1},
      {123, 1},
      {1, 123},
      {23, 60},
      {23, 80},
      {9000, 1},
      {90000000, 1},
      {9000, 1000}
  };


  private int[] limitExpected = {5, 8, 9, 50, 11, 0, 99, 99, 124, 1, 83, 23, 9001, 90000001, 9000};

  @Test
  void testLimit() {
    for (int i = 0; i < limitParams.length; i++) {
      int actual = CodingBatLimitOfSum.sumLimit(limitParams[i][0], limitParams[i][1]);
      Assertions.assertEquals(actual, limitExpected[i]);
    }
  }


}