import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Game> myGames = new ArrayList<Game>();
		myGames.add(new Game(1));
		myGames.add(new Game(2));
		
		for(Game g : myGames){
			g.initGame();
		}
		
		int gameID;
		String playerName;
		Scanner sc = new Scanner(System.in);
		
		//Menu
		System.out.println("--- What would you like to do?--");
		System.out.println("1. View one player's hand ");
		System.out.print("2. View all players' hands ");
		
		int choice = sc.nextInt();
		
		switch(choice){
			case 1: 
				System.out.print("Enter the game ID: ");
				gameID = sc.nextInt();
				sc.nextLine();  // Consume newline left-over
				System.out.print("Enter the player's name: ");
				playerName = sc.nextLine();		
				
				//search for the right game
				for(Game g : myGames){
					if(g.getId() == gameID){
						ArrayList<Player> players = g.getPlayers();
						for(Player p : players){
							if(p.getName().equals(playerName)){
								for(Card c : p.getHand()){
									System.out.print(c.color);
									System.out.print(" - ");
									System.out.println(c.value);
								}
							} 
						}
					}
				}	
				break;
			case 2:
				System.out.print("Enter the game ID: ");
				gameID = sc.nextInt();
				
				for(Game g : myGames){
					if(g.getId() == gameID){
						ArrayList<Player> players = g.getPlayers();
						for(Player p : players){
							System.out.println(p.getName() + "'s Hand from Game #" + g.getId());
								for(Card c : p.getHand()){
									System.out.print(c.color);
									System.out.print(" - ");
									System.out.println(c.value);
								}
						}
					}
				}	
				break;
		}
		
	}

}
