package model;

public class Level {
	private Rockford rockford;
	int largeur = 25;
	
	int longueur = 25;
	
	private MotionLess[][] cases;
	
	
	public Level(int largeur, int longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
		cases = new MotionLess[longueur][largeur];
	}
	
	public MotionLess[][] getCases() {
		return cases;
	}

	public Rockford getRockford() {
		return rockford;
	}

	public void setRockford(Rockford rockford) {
		this.rockford = rockford;
	}
	

}
