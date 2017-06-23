package org.ncr.api.util;

final public class SequenceRunner {

	private static volatile long id;
	
	static {
		id = 0;
	}
	
	private SequenceRunner(){};
	
	public static synchronized long getNewId() {
		return ++id;
	}
	
}