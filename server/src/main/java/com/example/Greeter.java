package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
	throw new UnsupportedOperationException("Implement");
  }

/**
* @param someone the name of a person
* @return greeting string
*/

  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
