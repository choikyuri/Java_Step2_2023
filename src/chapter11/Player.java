package chapter11;

public class Player {
	
	private PlayLevel level;
	
	public Player() {
		level=new BeginnerLevel(); //PlayLevel level=new BeginnerLavel();
		level.showLevelMessage();
	}
	
	public PlayLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayLevel level) {
		this.level=level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}

}
