import java.util.*;
 


public class Main {

	public static ArrayList<Man> M = new ArrayList<Man>();
	public static ArrayList<Woman> W = new ArrayList<Woman>();

	
	public static boolean AllMatched() {
		for(Woman w: W) {
			if(w.getMate()==null)
				return false;
		}
		return true;
	}
	
	public static void printFinalMatching() {
		for(Man m: M) {
			System.out.printf("%-5s is matched with %5s\n",m.getName(), m.getMate().getName());
		}
	}
	
	
	public static void main(String[] args) {
	
	Man m1 = new Man(1, "Jack");
	Man m2 = new Man(2, "Steve");
	Man m3 = new Man(3, "Paul");
	
	M.add(m1);
	M.add(m2);
	M.add(m3);
	
	Woman w1 = new Woman(1, "Elena");
	Woman w2 = new Woman(2, "Megan");
	Woman w3 = new Woman(3, "Elizabeth");
	
	
	
	W.add(w1);
	W.add(w2);
	W.add(w3);
	

	m1.setPreference_list(new ArrayList<Entity>(Arrays.asList(w1,w2,w3)));
	m2.setPreference_list(new ArrayList<Entity>(Arrays.asList(w1,w2,w3)));
	m3.setPreference_list(new ArrayList<Entity>(Arrays.asList(w1,w2,w3)));
	
	w1.setPreference_list(new ArrayList<Entity>(Arrays.asList(m2,m3,m1)));
	w2.setPreference_list(new ArrayList<Entity>(Arrays.asList(m1,m3,m2)));
	w3.setPreference_list(new ArrayList<Entity>(Arrays.asList(m2,m3,m1)));
	
	
	int run_number = 1;
	while(!AllMatched()) {
		
		System.out.println("\n\n\tRun number "+run_number);
		
		for (Man man : M) {
			if (man.getMate()==null) {
			
				Woman w = (Woman) man.getPreference_list().get(0);
				man.MatchUp(w);
				
			}
			
		}
		run_number++;
	}
	
	
	System.out.println("\n--------------------------\n");
	printFinalMatching();
	
	
	
}

	
	
	

}
