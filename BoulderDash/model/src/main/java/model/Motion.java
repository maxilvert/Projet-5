package model;

import java.io.IOException;

public class Motion extends MotionLess implements IMotion {
	public Motion(String type) throws IOException {
		super(type);
		// TODO Auto-generated constructor stub
	}

	static int speed;
	
	public static int getSpeed() {
		return speed;
	}

	public static void setSpeed(int speed) {
		Motion.speed = speed;
	}	
}
