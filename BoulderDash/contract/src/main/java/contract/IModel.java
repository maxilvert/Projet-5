<<<<<<< HEAD:BoulderDash/contract/src/main/java/contract/ILevel.java
package contract;

import java.util.Observable;
import entity.Map;


public interface ILevel {

	
	
	Map getMap();
	
	void loadMap(String code);

	Observable getObservable();
}
=======
package contract;

import java.util.Observable;
import entity.Map;


public interface IModel {

	
	
	Map getMap();
	
	void loadMap(String code);

	Observable getObservable();
}
>>>>>>> parent of 7dca09e... Modification du modèle:BoulderDash/contract/src/main/java/contract/IModel.java
