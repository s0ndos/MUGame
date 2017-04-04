import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> hand;
	
	public Player(){
		
	}
	
	public Player(String name, ArrayList<Card> hand) {
		super();
		this.name = name;
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	
	public void displayHand(Game game, String playerName){
		System.out.println("Hand for " + this.name);
			for(Card c : hand){
				System.out.print(c.color);
				System.out.print(" - ");
				System.out.println(c.value);
			}
	}
	
			
}
