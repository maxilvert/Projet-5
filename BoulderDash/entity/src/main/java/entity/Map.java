package entity;

public class Map extends Entity {

	private int id;

	private String key;

	public Map(final int id, final String key, final String message) {
		this.setId(id);
		this.setKey(key);
		this.setMessage(message);
	}

	
		
	
	
	public Map() {
		this(0, "", "");
	}

	
	public int getId() {
		return this.id;
	}

	
	public void setId(final int id) {
		this.id = id;
	}

	
	public String getKey() {
		return this.key;
	}

	
	public void setKey(final String key) {
		this.key = key;
	}

	
	public String getMessage() {
		return this.getMessage();
	}

	
	public void setMessage(final String message) {
	}

}
