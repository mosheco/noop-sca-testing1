package com.backslash.noop;

/**
 * A calls that contains a static noop method.
 */
public class Noop {
    /**
     * Just a noop. Prints a message to verify the code has been called and returns
     * a dummy string.
     * @return      a dummy string
     */
    static public String noop() {
	System.out.println("Hi, in noop ");
	return "string returned from noop";
    }
}
