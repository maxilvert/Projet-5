package entity;

public class Map extends Entity {

	private int id;

	private String key;

	private String message;
	private String L1;
	private String L2;
	private String L3;
	private String L4;
	
	

	public Map(final int id, final String key, final String message) {
		this.setId(id);
		this.setKey(key);
		this.setMessage(message);
	}

	public String decoupe() {
		L1 = message.substring(0, 19);
		L2 = message.substring(20, 39);
		L3 = message.substring(40, 59);
		L4 = message.substring(50, 69);
		System.out.println(L1+'\n'+L2+"\n"+L3+"\n"+L4);
		return (L1+'\n'+L2+"\n"+L3+"\n"+L4);
		
	
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
		return this.decoupe();
	}

	
	public void setMessage(final String message) {
		this.message = message;
	}

}
