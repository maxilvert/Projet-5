package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.ILevel;

public class ViewFrame extends JFrame {

	private ILevel model;

	private IController controller;

	private static final long serialVersionUID = -697358409737458175L;

	public ViewFrame(final ILevel model) throws HeadlessException, FileNotFoundException {
		this.buildViewFrame();
	}

	public ViewFrame(final ILevel model, final GraphicsConfiguration gc) throws FileNotFoundException {
		super(gc);
		this.buildViewFrame();
	}

	public ViewFrame(final ILevel model, final String title) throws HeadlessException, FileNotFoundException {
		super(title);
		this.buildViewFrame();
	}

	public ViewFrame(final ILevel model, final String title, final GraphicsConfiguration gc)
			throws FileNotFoundException {
		super(title, gc);
		this.buildViewFrame();
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

	ViewPanel pan = new ViewPanel();

	private void buildViewFrame() throws FileNotFoundException {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(pan);
		this.addKeyListener(pan);
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
	}

	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
