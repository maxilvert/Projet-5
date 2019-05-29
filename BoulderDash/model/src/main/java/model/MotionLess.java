package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MotionLess implements IMotionLess {
	protected Image sprite;
	protected int x=0;
	protected int y=0;
	
	public MotionLess(String type) {
		try {
			sprite = ImageIO.read(new File("src/Image/"+type+".png"));
		} catch (Exception e) {
//			Je suis sur!!!!
		}
	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	
	
}

