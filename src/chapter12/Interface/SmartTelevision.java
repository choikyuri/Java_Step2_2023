package chapter12.Interface;

public class SmartTelevision implements Remote, Searchable{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) {
			this.volume=Remote.MAX_VOLUME;
		}else if(volume < Remote.MAX_VOLUME) {
			this.volume=Remote.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨 : "+this.volume);
		
	}

	@Override
	public void seatch(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}
	
}
