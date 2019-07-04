package uk.co.nerdprogramming.util;

import java.io.*;
import java.util.ArrayList;

public class IO {
	private IO() {}
	
	static String getAppData() {
		return SYS.getEnv("%APPDATA%");
	}
	
	static String getHome() {
		return SYS.getEnv("${HOME}");
	}
	
	static String[] loadStrings(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		ArrayList<String> buffer = new ArrayList<String>();
		while((line = br.readLine()) != null) buffer.add(line);
		br.close();
		return buffer.toArray(new String[buffer.size()]);
	}
	
	static void saveStrings(String[] data, String path) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		for(String line : data) bw.write(line);
		bw.close();
	}
	
	static void saveBytes(byte[] data, String path) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		for(byte line : data) bw.write(line);
		bw.close();
	}
	
	static void saveShorts(short[] data, String path) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(path));
		for(short line : data) bw.write(line);
		bw.close();
	}
	
	
	static short[] loadUnsignedBytes(String path) throws IOException {
		DataInputStream br = new DataInputStream(new FileInputStream(path));
		String line;
		ArrayList<Short> buffer = new ArrayList<Short>();
		
		File f = new File(path);
		short[] out = new short[(int) f.length()];
		for(int i = 0; i < f.length(); i++) out[i] = (short) br.readUnsignedByte();
		br.close();
		return out;
	}
	
	static byte[] loadBytes(String path) throws IOException {
		DataInputStream br = new DataInputStream(new FileInputStream(path));
		String line;
		ArrayList<Short> buffer = new ArrayList<Short>();
		
		File f = new File(path);
		byte[] out = new byte[(int) f.length()];
		for(int i = 0; i < f.length(); i++) out[i] = (byte) br.readByte();
		br.close();
		return out;
	}
	
	static int[] loadUnsignedShorts(String path) throws IOException {
		DataInputStream br = new DataInputStream(new FileInputStream(path));
		String line;
		ArrayList<Short> buffer = new ArrayList<Short>();
		
		File f = new File(path);
		int[] out = new int[(int) f.length()];
		for(int i = 0; i < f.length(); i++) out[i] = (int) br.readUnsignedShort();
		br.close();
		return out;
	}
	
	
	
	
	
	
}
