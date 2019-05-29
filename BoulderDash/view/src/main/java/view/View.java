//package view;
//
//import java.awt.HeadlessException;
//import java.awt.event.KeyEvent;
//import java.io.FileNotFoundException;
//
//import javax.swing.SwingUtilities;
//
//import contract.ControllerOrder;
//import contract.IController;
//import contract.ILevel;
//import contract.IView;
//
//
//public final class View implements IView, Runnable {
//
//	
//	private final ViewFrame viewFrame;
//
//	
////	public View(final ILevel level) throws HeadlessException, FileNotFoundException {
////		this.viewFrame = new ViewFrame(level);
////		SwingUtilities.invokeLater(this);
////	}
//
//	
//	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
//		switch (keyCode) {
//			case KeyEvent.VK_UP:
////				viewmoveUp();
//				return ControllerOrder.UP;
//				
//			case KeyEvent.VK_RIGHT:
////				moveRight();
//				return ControllerOrder.RIGHT;
//				
//			case KeyEvent.VK_LEFT:
////				moveLeft();
//				return ControllerOrder.LEFT;
//				
//			case KeyEvent.VK_DOWN:
////				moveDown();
//				return ControllerOrder.DOWN;
//			default:
////				notMove();
//				return ControllerOrder.UP;
//		}
//	}
//
//	
//	public void printMessage(final String message) {
//		this.viewFrame.printMessage(message);
//	}
//
//	
//	public void run() {
//		this.viewFrame.setVisible(true);
//	}
//
//	public void setController(final IController controller) {
//		this.viewFrame.setController(controller);
//	}
//}
//
//
//
