/**
* The Candy class is a representational model for a candy.
* 
* @author Ioana Guna, Mary Safowah, Jaelee Jones & McKenzie Custer
* @version October 26th
*/ 
class Candy{
  private String name;

  /**
  * Constructor with no parameters: sets name to blank
  */
  Candy() {
    name = "";
  }

  /**
  * Constructor with one parameter
  * @param aName This is the name of the candy
  */
  Candy(String aName) {
    name = aName;
  }

  /**
  * Accesor method for the name variable
  * @return the name of the candy
  */
  String getName() {
    return name;
  }

  /**
  * Mutator method to set name to theName
  * @param theName This is the value at which the name is updated
  */
  void setName(String theName) {
    name = theName;
  }

  /**
  * Print method prints the name of the candy
  */
  void print() {
    System.out.println(name);
  }
}