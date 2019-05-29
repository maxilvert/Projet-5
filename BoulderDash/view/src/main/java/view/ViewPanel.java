package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

class ViewPanel extends JPanel implements KeyListener {

//	private Level level;

	ViewPanel(/*Level level*/){
		setSize(25*32, 25*32);
		
//		setPreferredSize(new Dimension(100, 100));
		setForeground(Color.GREEN);
	}

	

	
	public void paint(Graphics g) {
//		super.paintComponent(g);

		System.out.println("decors");
//		for (int i = 0; i < longueur; i++) {
//			for (int j = 0; j < largeur; j++) {
//
//				g.drawImage(tabImg[i][j].getImage(), i * 32, j * 32, 32, 32, this);
//			}
//		}
//		System.out.println("rockford");
//		g.drawImage(Rockford, this.xRockford, this.yRockford, 32, 32, this);
	}



	@Override
	public void keyPressed(KeyEvent arg7) {
		int code = arg7.getKeyCode();

		switch (code) {
		case KeyEvent.VK_UP:
//			map.getRockford().moveUp();
//			moveUp();
			break;
//		case KeyEvent.VK_RIGHT:
//
//			moveRight();
//			break;
//		case KeyEvent.VK_LEFT:
//
//			moveLeft();
//			break;
//
//		case KeyEvent.VK_DOWN:
//
//			moveDown();
//			break;
//
		}
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}

}
