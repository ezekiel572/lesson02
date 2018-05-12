package pl.lesson;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] A = {1, 3, 5, 8, -9};
    int K = 3;

    int aLength = A.length; //5

    //System.out.println("aLength: " + aLength);
    System.out.println(Arrays.toString(A));
    System.out.println("Marker: " + K);
    System.out.println(Arrays.toString(moveElementsMarker(A, K)));
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


}

