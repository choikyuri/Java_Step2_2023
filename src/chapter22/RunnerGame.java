package chapter22;

import java.util.Random;



public class RunnerGame {
	
	Player[] players;
	Player winner;
	int winDistance;
	
	public RunnerGame(int winDistance) {
		
		this.winDistance = winDistance;
		
		players = new Player[5];
		
		for(int i=0; i<players.length; i++) {
			players[i] = new Player();
		}
	}
	
	public void start() {
		while(winner == null) {
			
			//0.1초 간격으로 휴식
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("-------------------------");
			for(Player p : players) {
				int distance = new Random().nextInt(4);
				p.jump(distance);
				
				if(distance > 0)
					System.out.println(p.getPlayerJump() + p.getPlayerId() + "🏃");
				else
					System.out.println(p.getPlayerJump() + p.getPlayerId() + "🏃>-<O");
				
				if(p.getPlayerJump().length() >= winDistance) {
					winner = p;
				}
			}
			//System.out.println("-------------------------");
			
		}
		
		System.out.println(winner.getPlayerId() + "번 선수 승리~");
	}

}
