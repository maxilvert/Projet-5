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

	public Rockford() {
		super("RockFordLeft");
		try {
			left = ImageIO.read(new File("src/Image/RockFordLeft.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void moveUp() {

		y = y - 32;
		look = Look.UP;

	}

	public void moveRight() {
		x = x + 32;
		look = Look.RIGHT;

	}

	public void moveLeft() {
		x = x - 32;
		look = Look.LEFT;

	}

	public void moveDown() {
		y = y + 32;
		look = Look.DOWN;

	}
}
