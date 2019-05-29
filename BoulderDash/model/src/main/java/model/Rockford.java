package model;

import java.awt.Image;
import java.io.IOException;

public class Rockford extends Motion {
	
	public Rockford(String type) throws IOException {
		super(type);
		// TODO Auto-generated constructor stub
	}
	public static void setX(int x) {
		MotionLess.x = x;
	}
	public static void setHeight(int height) {
		MotionLess.height = height;
	}
	public static void setY(int y) {
		MotionLess.y = y;
	}
	public static void setSpeed(int speed) {
		Motion.setSpeed(speed);
	}
	public void setWidth(int width) {
		MotionLess.width = width;
	}
	
	public static void setSprite(Image sprite) {
		MotionLess.sprite = sprite;
	} 
	
}
