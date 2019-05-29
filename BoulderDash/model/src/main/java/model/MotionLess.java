package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MotionLess implements IMotionLess {
	protected Image sprite;
	static boolean imageloaded;
	static int x;
	static int y;
	static int height ;
	static int width ;
	public MotionLess(String type) throws IOException {
		// TODO Auto-generated constructor stub
		sprite = ImageIO.read(new File("src/Image/"+type+".png"));
	}
	public Image getSprite() {
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

