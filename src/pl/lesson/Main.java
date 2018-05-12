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
  /*
   *Method return unpaired element in Array.
   */
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

