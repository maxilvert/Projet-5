
package main;

import model.Level;
import model.LevelParser;
import model.Model;
import view.ViewFrame;


public abstract class Main {

    
    public static void main(final String[] args) {
//        final Model model = new Model();
//        final View view = new View(model);
//        final Controller controller = new Controller(view, model);
//        view.setController(controller);
//
//        controller.control();
//        controller.orderPerform(ControllerOrder.DEFAULT);
    	LevelParser levelParser = new LevelParser();
    	Level level = levelParser.readFile();
    	ViewFrame view = new ViewFrame();
    }
}
