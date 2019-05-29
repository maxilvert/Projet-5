package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MotionLess implements IMotionLess {
	protected Image sprite;
	
	public MotionLess(String type) throws IOException {
		// TODO Auto-generated constructor stub
		sprite = ImageIO.read(new File("src/Image/"+type+".png"));
	}

	public Image getSprite() {
		return sprite;
	}

	public void setSprite(Image sprite) {
		this.sprite = sprite;
	}


	
	
}

