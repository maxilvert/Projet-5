package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;


public final class View implements IView, Runnable {

	
	private final ViewFrame viewFrame;

	
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_UP:
				return ControllerOrder.UP;
			case KeyEvent.VK_RIGHT:
				return ControllerOrder.RIGHT;
			case KeyEvent.VK_LEFT:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_DOWN:
				return ControllerOrder.DOWN;
			default:
				return ControllerOrder.UP;
		}
	}

	
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	
	public void run() {
		this.viewFrame.setVisible(true);
	}

	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
