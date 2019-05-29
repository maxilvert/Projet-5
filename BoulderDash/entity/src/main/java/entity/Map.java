package entity;

import java.util.Scanner;

public class Map extends Entity {

	private int id;

	private String key;

	private String message;

	
	public Map(final int id, final String key, final String message) {
		this.setId(id);
		this.setKey(key);
		this.setMessage(message);
	}

	
	public Map() {
		this(0, "", "");
	}

	
	public int getId() {
		return this.id;
	}

	
	public void setId(final int id) {
		this.id = id;
	}

	
	public String getKey() {
		return this.key;
	}

	
	public void setKey(final String key) {
		this.key = key;
	}

	
	public String getMessage() {
		return this.message;
	}

	
	public void setMessage(final String message) {
		this.message = message;
	}

//	public void readMap() {
//		char[][] line = new char[19][4];
//		int x = 0;
//		for (int i = 0; i < 19; i++) {
//			for (int j = 0; j < 4; j++) {
//				Scanner scnr = new Scanner (message);
//				line[i][j]= scnr.nextLine().charAt(x);
//				scnr.close();
//				System.out.println(line[i][j]);
//			}
//		}
//		
//
//	}
}
