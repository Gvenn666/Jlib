package uk.co.nerdprogramming.util;

import java.io.*;
import java.util.*;

public class SYS {
	private SYS() {}
	
	static PrintStream getStdOut() {return System.out;}
	static Scanner getStdIn() {return new Scanner(System.in);}
	static PrintStream getStdErr() {return System.err;}
	
	static void setStdOut(PrintStream out) {
		System.setOut(out);
	}
	
	
	static void setStdErr(PrintStream err) {
		System.setErr(err);
	}
	
	static void setStdOut(InputStream in) {
		System.setIn(in);
	}
	
	static String getEnv(String key) {
		return System.getenv(key);
	}
	private static Queue<Character> charBuffer;
	static char getChar() {
		if(charBuffer.isEmpty()) {
			String temp = getStdIn().next();
			for(char c : temp.toCharArray()) {
				charBuffer.add(c);
			}
		}
		
		return charBuffer.remove();
	}
	
}
