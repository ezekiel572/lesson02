package pl.lesson;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] A = {1, 3, 5, 8, -9};
    int K = 3;

    int[] B = {9, 3, 9, 3, 9, 7, 9};

    int aLength = A.length; //5

    //System.out.println("aLength: " + aLength);
    System.out.println("moving with marker");
    System.out.println(Arrays.toString(A));
    System.out.println("Marker: " + K);
    System.out.println(Arrays.toString(moveElementsMarker(A, K)));
    System.out.println();
    System.out.println();
    System.out.println("unpairedElements");
    System.out.println(Arrays.toString(B));
    System.out.println(Arrays.toString(unpairedElementsArray(B)));


  }


  /*
   *Method moving element in Array with marker.
   */
  static int[] moveElementsMarker(int[] A, int K) {

    int aLength = A.length; //5

    int[] newArray = new int[aLength]; //5


    for (int i = 0; i < aLength; i++) {
      //System.out.println("i : " + i);
      int _temp = i + K;
      // System.out.println("i + K : " + _temp);

      if ((i + K) < (aLength)) {
        newArray[i + K] = A[i];
        // System.out.println("newArray[dla i]" + newArray[i + K]);
        // System.out.println("newArray: " + Arrays.toString(newArray));
      } else {
        newArray[i + K - aLength] = A[i];
        //System.out.println("newArray: " + Arrays.toString(newArray));
      }

    }

    return newArray;
  }

  static int[] unpairedElementsArray(int[] A) {

    Arrays.sort(A);
    int[] _temp = {0};
    for (int i = 0; i < A.length - 2; i += 2) {

      if (A[i] != A[i + 1]) {
        _temp[0] = A[i];
        return _temp;
      }


    }

    return _temp;

  }


}

//  Task description
//
//  A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
//
//        For example, in array A such that:
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//
//        the elements at indexes 0 and 2 have value 9,
//        the elements at indexes 1 and 3 have value 3,
//        the elements at indexes 4 and 6 have value 9,
//        the element at index 5 has value 7 and is unpaired.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//        For example, given array A such that:
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//
//        the function should return 7, as explained in the example above.
//
//        Assume that:
//
//        N is an odd integer within the range [1..1,000,000];
//        each element of array A is an integer within the range [1..1,000,000,000];
//        all but one of the values in A occur an even number of times.
//
//        Complexity:
//
//        expected worst-case time complexity is O(N);
//        expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
//
//        Copyright 2009–2018 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
