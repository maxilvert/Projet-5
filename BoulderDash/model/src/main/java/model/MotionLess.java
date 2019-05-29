package model;

import java.awt.Image;

public class MotionLess implements IMotionLess {
	static Image sprite;
	static boolean imageloaded;
	static int x;
	static int y;
	static int height ;
	static int width ;
	
	public static Image getSprite() {
		return sprite;
	}
	public static void setSprite(Image sprite) {
		MotionLess.sprite = sprite;
	}
	public static boolean isImageloaded() {
		return imageloaded;
	}
	public static void setImageloaded(boolean imageloaded) {
		MotionLess.imageloaded = imageloaded;
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		MotionLess.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		MotionLess.y = y;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		MotionLess.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		MotionLess.width = width;
	}	
}

