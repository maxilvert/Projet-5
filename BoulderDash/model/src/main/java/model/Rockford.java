package model;

import java.awt.Image;

public class Rockford extends Motion {
	
	
	
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
