package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelParser {

	public Level readFile(){

		String FileName = "src/Image/text.txt";
		int largeur = 25;
		int longueur = 25;

		Level level = new Level(largeur, longueur);


		File text = new File(FileName);
		int k = 0;
		String lineStr = "";
		try {
			Scanner scnr = new Scanner(text);
			lineStr = scnr.nextLine();
			scnr.close();
		} catch (FileNotFoundException e) {
//			 Je suis sur de moi !!!
		}

		for (int i = 0; i < longueur; i++) {
			for (int j = 0; j < largeur; j++) {

				char elem = lineStr.charAt(k);
//				tabImg[i][j].setX(j * 32);
//				tabImg[i][j].setY(i * 32);
				System.out.println(i + "," + j);
				switch (elem) {

				case 'a': {
					level.getCases()[i][j] = new Wall();
//							tabImg[i][j].setImage(wall);
					break;
				}
				case 'b': {
					level.getCases()[i][j] = new Dirt();
//					tabImg[i][j].setImage(ground);
					break;
				}

				case 'r': {
					level.getCases()[i][j] = new Rockford();
//					tabImg[i][j].setImage(ground);
					break;
				}

				}
				k += 1;
				level.getCases()[i][j].setX(j*32);
				level.getCases()[i][j].setY(i*32);
			}

		}
		return level;
	}

}
