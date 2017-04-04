import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	private int id;
	private Deck gameDeck;
	private ArrayList<Player> players;
	private int nbPlayers;
	
	public Game(int id) {
		super();
		this.id = id;
	}

	public void initGame(){
		gameDeck = new Deck();
		gameDeck.shuffle();
		this.initPlayers();
		gameDeck.Deal(players);
	}
	
	public void initPlayers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("How many players for game #" + this.getId() + "? (3 to 6 players)");
		nbPlayers = sc.nextInt();
		players = new ArrayList<Player>();
		
		for(int i = 0; i < nbPlayers; i++){
			Player player = new Player("Player " + (i+1), new ArrayList<Card>());
			players.add(player);
		}	
		//for testing
//		for(Player p : players){
//			System.out.println(p.getName());
//		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Deck getGameDeck() {
		return gameDeck;
	}

	public void setGameDeck(Deck gameDeck) {
		this.gameDeck = gameDeck;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}

	public int getNbPlayers() {
		return nbPlayers;
	}

	public void setNbPlayers(int nbPlayers) {
		this.nbPlayers = nbPlayers;
	}
	
	

}
