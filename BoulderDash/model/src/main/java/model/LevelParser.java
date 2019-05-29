package model;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import model.GameBoard;

public class LevelParser {
	
	int largeur = 25;
	int longueur = 25;
	private GameBoard[][] tabImg = new GameBoard[longueur][largeur];
	Wall wall = new Wall();
	Dirt ground = new Dirt();
	
	public void readFile() throws FileNotFoundException {
		String FileName = "src/Image/text.txt";

		File text = new File(FileName);
		int k = 0;
		Scanner scnr = new Scanner(text);
		String lineStr = scnr.nextLine();
		scnr.close();

		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {

				char elem = lineStr.charAt(k);
//				tabImg[i][j].setX(j * 32);
//				tabImg[i][j].setY(i * 32);
				System.out.println(i + "," + j);
				switch (elem) {

				case 'a': {
					tabImg[i][j] = new GameBoard(wall.getSprite(), j*32, i*32);
//							tabImg[i][j].setImage(wall);
					break;
				}
				case 'b': {
					tabImg[i][j] = new GameBoard(ground.getSprite(), j*32, i*32);
//					tabImg[i][j].setImage(ground);
					break;
				}

				}
				k += 1;
			}
		}
	}

}
