import java.util.*;

public class Man extends Entity {

	public Man(int id, String name) {
		super(id, name);
	
	}
	
	public Man(int id, String name, ArrayList<Entity> preference) {
		super(id, name, preference);
	}
	
	
	
	public void MatchUp(Woman potential_mate) {
		
		if(potential_mate.getMate() ==  null) {
			this.setMate(potential_mate);;
			potential_mate.setMate(this);
			System.out.printf("%-5s is matched with %5s\n", this.getName(), potential_mate.getName());
			
		}
			
		else {
			
			Entity current_mate = potential_mate.getMate();
			
			int current_mate_rank = potential_mate.getIndex(current_mate);
			int this_rank = potential_mate.getIndex(this);					
					
			 
			if(current_mate_rank > this_rank) {
				
				this.setMate(potential_mate);
				current_mate.setMate(null);
				System.out.printf("%-5s breaks up with %5s\n",current_mate.getName(),potential_mate.getName());
				this.setMate(potential_mate);
				potential_mate.setMate(this);
				System.out.printf("%-5s is matched with %5s\n", this.getName(), potential_mate.getName());
				return;
			}
			
			else 
				this.preference_list.remove(potential_mate);
				return;
		}
		
			
			
		
		
	}
	
	
	
	
	
	
	
}
