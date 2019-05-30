package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rockford extends Motion {
	private Image left;
	private Image right;
	private Image up;
	private Image down;
	private Look look = Look.DEFAULT;

	public Rockford() {
		super("RockFord");
		try {
			left = ImageIO.read(new File("src/Image/RockFordLeft.png"));
			right = ImageIO.read(new File("src/Image/RockFordRight.png"));
			up =	ImageIO.read(new File("src/Image/RockFordUp.png"));
			down =	ImageIO.read(new File("src/Image/RockFordDown.png"));
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
			
		case RIGHT:
			return right;
			
		case UP:
			return up;
			
		case DOWN:
			return down;
			
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
