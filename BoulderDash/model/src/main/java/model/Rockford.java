package model;


import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rockford extends Motion {
	private Image left;
	private Look look = Look.RIGHT;
	public Rockford(String type) throws IOException {
		super("RockFordRight");
		left = ImageIO.read(new File("src/Image/RockFordLeft.png"));
	}
	
	@Override
	public Image getSprite() {
		switch (look) {
		case LEFT:
			return left;

		default:
			break;
		}
		throw new RuntimeException("pas normal!!!!");
	}
}
