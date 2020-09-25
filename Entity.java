import java.util.*;

public abstract class Entity {

	protected int id;
	protected String name;
	protected Entity mate;
	protected ArrayList<Entity> preference_list;
	
	
	public Entity(int id, String name) {
		this.id = id;
		this.name = name;
		this.mate = null;
		
	}
	
	public Entity(int id, String name, ArrayList<Entity> preference) {
		this.id = id;
		this.name = name;
		this.mate = null;
		this.preference_list = preference;
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Entity> getPreference_list() {
		return preference_list;
	}

	public void setPreference_list(ArrayList<Entity> preference_list) {
		this.preference_list = preference_list;
	}
	
	
	public Entity getMate() {
		return mate;
	}

	public void setMate(Entity mate) {
		this.mate = mate;
	}

	
	
	public int getIndex(Entity person) {
		return this.preference_list.indexOf(person);
		}
	
	
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name;
	}
	
	
	
}
