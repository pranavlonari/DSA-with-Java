import java.util.*;

public class Main {
    public static void main(String[] args) {
  
      String boxes[]={"a", "b", "c", "d",};
      
      logallpairs(boxes);
    }

  static void logallpairs(String[] array)
{
  for(int i=0;i<array.length;i++)
  
  {
    for (int j=0;j<array.length;j++)
    {
      System.out.println(array[i]+" "+array[j]);
    }
  }
}
  
}

/*


Array Declaration:

String[] boxes = {"a", "b", "c", "d", "e"};
This line declares and initializes an array named boxes with the elements 'a', 'b', 'c', 'd', and 'e'.
Function Definition:

static void logAllPairs(String[] array) {
    // ...
}
This defines a static method named logAllPairs that takes a String array (array) as a parameter.
Nested Loops:

for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array.length; j++) {
        System.out.println(array[i] + " " + array[j]);
    }
}
The method contains two nested for loops.
The outer loop (i) iterates over each element of the array.
The inner loop (j) also iterates over each element of the array.
Inside the inner loop, System.out.println prints the pairs of elements from the array.
Function Invocation:

logAllPairs(boxes);
This line calls (invokes) the logAllPairs method, passing the boxes array as an argument.
As a result, the method prints all possible pairs of elements from the boxes array.

*/
