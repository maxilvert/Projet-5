package model;

public class Motion extends MotionLess implements IMotion {
	static int speed;
	
	public static int getSpeed() {
		return speed;
	}

	public static void setSpeed(int speed) {
		Motion.speed = speed;
	}	
}
