import java.util.Scanner;

/**
* This program implements a simple model for trick or treating
*
* @author Ioana Guna, Mary Safowah, Jaelee Jones & McKenzie Custer
* @version October 26th
*/
class Main {
  public static void main(String[] args) {
    // create a pillowcase for storing candy
    Pillowcase pillowcase = new Pillowcase();

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    
    // determine how many classes we trick or treat at
    Scanner scanner = new Scanner(System.in);
    int houseTt = scanner.nextInt();
    scanner.close();

    // loop through houses
    while(houseTt > 0) {
      pillowcase.getCandy();
      houseTt--;
    }
    
    // print the total number of candies and how many of each candy are in the pillowcase
    System.out.println("We have " + pillowcase.getCandyNumber() + " candies.");
    pillowcase.printNumCandies();
  }
}