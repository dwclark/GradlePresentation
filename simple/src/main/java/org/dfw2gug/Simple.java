package org.dfw2gug;

/**
 * @author david
 * Created: Tue Apr 01 20:52:51 CDT 2014
 */
public class Simple {
    final String message;

    public Simple(String message) {
	this.message = message;
    }

    @Override
    public String toString() {
	return message;
    }
}
