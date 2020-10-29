import java.util.Random;
import java.util.ArrayList;

/**
* The Pillowcase class stores and keeps track of the total number of candies collected
* 
* @author Ioana Guna, Mary Safowah, Jaelee Jones & McKenzie Custer
* @version October 26th
*/ 
class Pillowcase{

  private ArrayList<Candy> candyStore;
  private int candyNumber;

  /**
  * Pillowcase constructor method
  */
  Pillowcase() {
    candyStore = new ArrayList<Candy>();
    candyNumber = 0;
  }

  /** Accesor method
  * @return the total number of candies
  */
  int getCandyNumber() {
    return candyNumber;
  }

  /**
  * getCandy method create one new candy and add it to the pillowcase
  */
  void getCandy() {
    System.out.println("Trick or Treat!");

    // generate a number in the interval [1 - 100]
    Random r = new Random();
    int randomNum = r.nextInt(100)+1;

    // choose the type of candy according to the randomly selected number
    Candy newCandy;
    if (randomNum >= 1 && randomNum <= 7) {
      newCandy = new Candy("Kit Kat");
    }
    else if (randomNum >= 8 && randomNum <= 15) {
      newCandy = new Candy("Milky Way");
    }
    else if (randomNum >= 16 && randomNum <= 25) {
      newCandy = new Candy("M&Ms");
    }
    else if (randomNum >= 26 && randomNum <= 45) {
      newCandy = new Candy ("Pink Starburst");
    }
    else if (randomNum >= 46 && randomNum <= 58) {
      newCandy = new Candy ("Twix");
    }
    else if (randomNum >= 59 && randomNum <= 75) {
      newCandy = new Candy ("Hershey's Bar");
    }
    else {
      newCandy = new Candy ("Reese's");
    }

    // add the new candy to the pillowcase
    candyStore.add(newCandy);
    candyNumber++;
  }

  /**
  * printNumCandies method prints out the total number of each candy collected
  */
  void printNumCandies() {
    int candyCount[] = new int[7];

    for (Candy i : candyStore) {
      if (i.getName().equals("Kit Kat")) {
        candyCount[0]++;
      }
      else if (i.getName().equals("Milky Way")) {
        candyCount[1]++;
      }
      else if (i.getName().equals("M&Ms")) {
        candyCount[2]++;
      }
      else if (i.getName().equals("Pink Starburst")) {
        candyCount[3]++;
      }
      else if (i.getName().equals("Twix")) {
        candyCount[4]++;
      }
      else if (i.getName().equals("Hershey's Bar")) {
        candyCount[5]++;
      }
      else {
        candyCount[6]++;
      }
    }

    System.out.println("We got...");
    if (candyCount[0]!=0) {
      System.out.println(candyCount[0]+ " Kit Kat");
    }
    if (candyCount[1]!=0) { 
      System.out.println(candyCount[1]+ " Milk Way");
    }
    if (candyCount[2]!=0) {
      System.out.println(candyCount[2]+ " M&Ms");
    }
    if (candyCount[3]!=0) {
      System.out.println(candyCount[3]+ " Pink Starburst");
    }
    if (candyCount[4]!=0) {
      System.out.println(candyCount[4]+ " Twix");
    }
    if (candyCount[5]!=0) {
      System.out.println(candyCount[5]+ " Hershey's Bar");
    }
    if (candyCount[6]!=0) {
      System.out.println(candyCount[6]+ " Reese's");
    }
  }
}