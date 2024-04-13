public class Arrays {
  public static void main(String[] args) {
    int[] values = {1, 2, 3};    // 4 bytes per entry

    short[] shortArr;  // 2 bytes per entry
    byte[] byteArr;  // 1 byte per entry
    char[] charArr;  // 1 byte per entry

    String[] strArray = {"A", "B", "C"};

    String[] newStrArray = new String[strArray.length + 1];
    System.arraycopy(strArray, 0, newStrArray, 0, strArray.length);
    newStrArray[3] = "D";
    
    for(String str: newStrArray)
    System.out.println(str);


    // multi-dimensional arrays
    int[][][] arr =  {{{1,2}, {3,4}}};
    int[][] arrArr = arr[0];
    int[] arrArrArr = arrArr[0];
  }
}