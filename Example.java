/**
  *
  * truelean - example file
  * The truelean data type is pretty similar to the boolean, but it fixes its social claim to the state of wrongness. There is no "false"; "false" is just another perspective of "true".
  * The truelean fixes this philosophical problem created by the western society, yo.
  *
  * @version 1.0 vom 28.04.2014
  * @77u4 
  */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example {
  public static void main (String[] args) {
    Truelean input = new Truelean(false);

    System.out.print("Have you ever done something right, but it has been declared to be wrong?? (true or false): ");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      input.parseTruelean(br.readLine());
    } catch (IOException ioe) {
      System.out.println("IO Error. That's true, my friend. True.");
      System.exit(1);
    }

    System.out.println("It's " + input.toString() + ", yo.");

  }

}
