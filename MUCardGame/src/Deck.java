import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
	
	private ArrayList<Card> cards;

	public Deck() {
		
		cards = new ArrayList<Card>();
		
		for (Color c : Color.values()) {
		    for (CardValue v : CardValue.values()) {
		         Card card = new Card(c,v.getValue());
		         cards.add(card);
		    }  
		}
	}
	
	public void shuffle(){
		Collections.shuffle(this.cards);
	}
	
	public Card dealTopCard(){
		Card cardDealt = cards.get(0);
		cards.remove(0);
		
		return cardDealt;
	}
	
	public void Deal(ArrayList<Player> players){
		while(!cards.isEmpty()){
			for(Player p : players){
				Card cardDealt = dealTopCard();
				ArrayList<Card> playerHand = p.getHand();
				playerHand.add(cardDealt);
			}
		}
	}
	
	

}
