package u2pp;

import java.util.Scanner; //Allows you to use the Scanner objects

/**
 * Created Scanner and used system.in to take in the user's numbers
 */

class Main {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Gimme the mpg: ");
      Double anEfficiency = Double.parseDouble(sc.nextLine());
      System.out.println("Gimme the make of the car: ");
      String carMake = sc.nextLine();
      System.out.println("Make of car: " + carMake);
      System.out.println("Gimme the model of the car: ");
      String carModel = sc.nextLine();
      System.out.println("Model of car: " + carModel);
	  Car bob = new Car(anEfficiency, carMake, carModel);
      System.out.println("Gimme the gas in the car: ");
      double gaser = sc.nextDouble();
      bob.addGas(gaser);
      System.out.println("Gas in car: " + gaser);
      String distance = sc.nextLine();
      System.out.println("Distance driven: " + distance);
      double distancer = sc.nextDouble();
      bob.drive(distancer);
      System.out.println("Your " + carMake + " " + carModel + " " + "has " + anEfficiency + "gallons of gas left in the tank");
	  sc.close();
  }
  
  /**
   * YOUR COMMENT HERE
   * @param word1 The first string to take a piece out of
   * @param start1 The starting index of the substring of word1
   * @param end1 The ending index of the substring of word1 (inclusive)
   * @param word2 The second string to take a piece out of
   * @param start2 The starting index of the substring of word2
   * @param end2 The ending index of the substring of word2 (inclusive)
   * @return YOUR COMMENT HERE
   */
  public static String wordChanger(String word1, int start1, int end1, String word2, int start2, int end2) {
	  String str1 = "Brian";
	  String str2 = "Wade";
	  String str3 = wordChanger(str1, 2, 3, str2, 0, 2);
	  System.out.println(str3); //Will print out iaWad
  }
}