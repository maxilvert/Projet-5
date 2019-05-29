package model;


import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rockford extends Motion {
	private Image left;
	private Image Right;
	private Image Up;
	private Image Down;
	private Look look = Look.DEFAULT;
	public Rockford(String type) throws IOException {
		super("RockFordLeft");
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