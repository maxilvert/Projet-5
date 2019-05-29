package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.ILevel;


class ViewFrame extends JFrame implements KeyListener {

	
	private ILevel model;

	
	private IController controller;
	
	private static final long	serialVersionUID	= -697358409737458175L;

	
	public ViewFrame(final ILevel model) throws HeadlessException {
		this.buildViewFrame(model);
	}

	
	public ViewFrame(final ILevel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	
	public ViewFrame(final ILevel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	
	public ViewFrame(final ILevel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	
	private IController getController() {
		return this.controller;
	}

	
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	
	protected ILevel getModel() {
		return this.model;
	}

	private void setModel(final ILevel model) {
		this.model = model;
	}

	
	private void buildViewFrame(final ILevel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this));
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
	}

	
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	
	public void keyTyped(final KeyEvent e) {

	}

	
	public void keyPressed(final KeyEvent e) {
		this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
	}

	
	public void keyReleased(final KeyEvent e) {

	}
}
