package chapter22;

public class Player {
	
	private static int num = 0;
	private int playerId = 0;
	private String playerJump = "";
	
	public Player() {
		playerId = ++Player.num;
	}
	
	public void jump(int jumpDistance) {
		for(int i=0; i<jumpDistance; i++) {
			playerJump += " ";
		}
	}
	
	public int getPlayerId() {
		return playerId;
	}
	
	public String getPlayerJump() {
		return playerJump;
	}

}
