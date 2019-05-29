package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.Map;


public final class Model extends Observable implements IModel {

	
	private Map map;

	
	public Model() {
		this.map = new Map();
	}

	
	public Map getMap() {
		return this.map;
	}

	
	private void setMap(final Map map) {
		this.map = map;
		this.setChanged();
		this.notifyObservers();
	}

	
	public void loadMap(final String code) {
		try {
			final DAOMap daoMap = new DAOMap(DBConnection.getInstance().getConnection());
			this.setMap(daoMap.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	
	public Observable getObservable() {
		return this;
	}
}
