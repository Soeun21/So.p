package arcade;
// 클래스 : 객체를 정의해 놓은 것, 객체를 생성하는데 사용한다
// 객체 : 실제로 존재하는 것 (사물 또는 개념) , 클래스에 정의된 내용대로 메모리에 생성된 것을 의미

// 객체와 인스텀스
// 책상은 객체이고 책상은 책상 클래스의 인스턴스이다.
// 객체는 모든 인스턴스를 대표하는 포괄적인 의미이고, 인스턴스는 어떤 클래스로부터 만들어진 것인지를 강조하는 구체적 의미

// 클래스는 객체를 정의한 것으로 클래스에는 객체의 모든 속성과 기능이 정의되어 있다
// 속성은 멤버변수, 필드, 상태라고도 하며,
// 기능은 메서드, 함수, 행위라고 한다
import java.util.Stack;
/*
1. 클래스를 설계할 때,멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static를 붙인다
2. 클래스 변수(static변수)는 인스턴스를 생성하지 않아도 사용할 수 있다
3. 클래스 메서드(static메서드)는 인스턴스변수를 사용할 수 없다
4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면 satic를 붙이는 것을 고려한다
 */
abstract public  class Arcade implements Recodable{
//	abstract class: 추상클래스
// 추상클래스에는 추상메서드가 존재하며 이는 상속을 통해 구현해주어야 한다
// 추상클래스 자체로는 인스턴스를 생성할 수 없고, 상속을 통해 만들어야 한다
	
	
	// 인스턴스 변수. 클래스의 인스턴스를 생성할 때 만들어진다 
	// 각각의 각각의 독립적인 저장공간을 가지기 때문에, 
	// 인스턴스마다 고유한 상태를 유지해야하는 속성은 인스턴스 변수로 선언한다
	private String name;	// 가게이름
	private boolean open;	// 영업중 /영업끝
	private static int asset;		// 게임의 총비용
	private boolean music;	// 노래 온오프
	private int music_volume = 0;	// 볼륨조절할 상수
	final int MAX_VOLUME = 30;	// 볼륨 최대치
	final int MIN_VOLUME = 0;	// 볼륨 최저치
	Stack<String> musicList = new Stack<String>();	// 가게에서 나오는 노래 리스트
	// 클래스 변수(static변수, 공유변수) 
	// 모든 인스턴스가 공통된 저장공간(변수)를 공유하게 된다
	// 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우 클래스변수로 선언해야 한다
	// 클래스명.클래스변수로 사용한다 Arcade.musicName
	static String musicName;
	
	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("녹화중입니다");
	}

	abstract void  greeting(String name);
	
	
	public boolean openOnOff() {
		//가게의 영업중/영업끝을 수행할 수 있는 함수
		open = !open;
		return open;
	}
	public boolean musicOnOff() {
		//music을 on/off할 수 있는 함수
		return music = !music;
	}
	
	//music volume을 조절할 수 있는 함수
	public int musicUp() {
		if(music_volume < MAX_VOLUME) {
			++music_volume;
		}
		else music_volume = MAX_VOLUME;
		
		return open == true ? music_volume : -1;
	}
	
	
	public int musicDown() {
		if(music_volume > MIN_VOLUME) {
			--music_volume;
		}
		else music_volume = MIN_VOLUME;
		
		return open == true ? music_volume : -1;
	}
	
	//가게에 나올 노래를 추가하는 함수
	public Stack<String> musicListAdd(String a){
		musicList.push(a);
		return musicList;
	}
	
	//가게에서 나오는 노래의 제목을 반환하는 함수
	public String currentMusic() {
		musicName = (String) musicList.peek();
		String format = "[playlist : %s, 현재 볼륨 : %d]";
		Object[] args = {open == true || musicOnOff()== true ? musicName:"음악없음",
				open ==true || musicOnOff()== true ?  music_volume :0};
		return String.format(format, args);
	
	}
	//가게에서 나오는 노래를 다음 노래로 바꾸는 함수
	public String nextMusic() {
		musicList.pop();
		musicName = (String) musicList.peek();
		return musicName;
	}
	
	public  String toString() {
		String onOff = "영업중";
		if(open == false) {
			onOff = "영업종료";
			musicName = "음악없음";
		}
		String format = "%s는 현재 %s 입니다. [playlist : %s]";
		Object[] args = {name, onOff , musicName};
		return String.format(format, args);
	}
	
	
	// 오버로딩 
	// 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것
	// 생성자 : 인스턴스가 생성될 때 호출 되는 '인스턴스 초기화 메서드
	public Arcade() {
		// 매개변수가 없는 기본 생성자
		// 생성자가 정의되어 있으면 기본생성자는 따로 제공되지 않으니 별도로 생성해야 함
}
	// 매개변수가 있는 생성자
	public Arcade(String name, boolean open, boolean music, int music_volume, Stack<String> musicList) {
		this.name = name;
		this.open = open;
		this.music = music;
		this.music_volume = music_volume;
		this.musicList = musicList;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isOpen() {
		return open;
	}



	public void setOpen(boolean open) {
		this.open = open;
	}



	public static int getAsset() {
		return asset;
	}



	public static void setAsset(int asset) {
		Arcade.asset = asset;
	}



	public boolean isMusic() {
		return music;
	}



	public void setMusic(boolean music) {
		this.music = music;
	}



	public int getMusic_volume() {
		return music_volume;
	}



	public void setMusic_volume(int music_volume) {
		this.music_volume = music_volume;
	}



	public Stack<String> getMusicList() {
		return musicList;
	}



	public void setMusicList(Stack<String> musicList) {
		this.musicList = musicList;
	}



	public static String getMusicName() {
		return musicName;
	}



	public static void setMusicName(String musicName) {
		Arcade.musicName = musicName;
	}



	public int getMAX_VOLUME() {
		
		return MAX_VOLUME;
	}



	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	
	
}
