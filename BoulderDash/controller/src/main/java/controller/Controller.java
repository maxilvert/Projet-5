package controller;

//import contract.ControllerOrder;
import contract.IController;
import contract.ILevel;

//import contract.ILevel;
import contract.IView;

public final class Controller implements IController {

	private IView view;

	private ILevel model;

	public Controller(final IView view, final ILevel model) {
		this.setView(view);
		this.setModel(model);
	}

	public void instruction() {
		this.view.printMessage("regles du jeu : bla bla \r\n Pour jouer appuie sur OK");
	}

	private void setView(final IView pview) {
		this.view = pview;
	}

	private void setModel(final ILevel model) {
		this.model = model;
	}

//	public void orderPerform(final ControllerOrder controllerOrder) {
//		this.model.loadMap("M1");
//		// instruction();

//	}

	@Override
	public void control() {
		// TODO Auto-generated method stub

	}

}
