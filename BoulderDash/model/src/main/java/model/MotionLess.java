package model;

import java.awt.Image;

public class MotionLess implements IMotionLess {
	Image sprite;
	String imagename;
	boolean imageloaded;

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}

	public String getImagename() {
		return imagename;
	}

	public void setImagename(String imagename) {
		this.imagename = imagename;
	}

	public boolean isImageloaded() {
		return imageloaded;
	}

	public void setImageloaded(boolean imageloaded) {
		this.imageloaded = imageloaded;
	}

}
