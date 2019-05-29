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
	} }
	
//>>>>>>> parent of 7dca09e... Modification du modèle
//}
//=======
//}
//>>>>>>> branch 'master' of https://github.com/maxilvert/Projet-5.git
