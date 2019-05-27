package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall extends MotionLess {
	private int x;
	private int y;
	private int height;
	private int width;
	private Image sprite;
	
	 public Wall() {
		 System.out.println("wall");

	        loadImage();
	    }

	    private void loadImage() {
	        
	        ImageIcon ii = new ImageIcon("src/resources/wall.png");
	        System.out.println(ii);
	        sprite = ii.getImage();
	        System.out.println(ii);
	        x= 400;
	        y=400;
	      
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

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public Image getSprite() {
			return sprite;
		}

		public void setSprite(Image sprite) {
			this.sprite = sprite;
		}}

