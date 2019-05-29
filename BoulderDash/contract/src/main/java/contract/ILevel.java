package contract;

import java.util.Observable;
import entity.Map;


public interface ILevel {

	
	
	Map getMap();
	
	void loadMap(String code);

	Observable getObservable();
}
