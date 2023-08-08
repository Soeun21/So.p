package arcade;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {
	// 인스턴스 메서드 public boolean openOnOff() 
	// 반드시 객체를 생성해야만 호출할 수 있다
	// 인스턴트 변수와 관련된 작업을 하는 즉, 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드이다
	
	// 클래스 메서드 public static void main(String[] args
	// 객체를 생성하지 않고도 "클래스이름.메서드이름"과 같은 식으로 호출이 가능하다
	// 인스턴스와 관계없는 (인스턴스 변수나 인스턴스 메서드를 사용하지 않는)메서드를 클래스 메서드(static메서드)로 정의한다
	public static void main(String[] args) {
		// 클래스 타입의 참조변수를 선언하고, 인스턴스를 생성한 후, 그 주소를 참조변수에 저장한다
		Scanner sc = new Scanner(System.in);
		String userName;
		int gameNumber;
		
		while(true) {
			System.out.println("유저명을 입력하세요");
			userName = sc.nextLine();
			System.out.println("게임을 선택해 주세요");
			System.out.println("1. UpDown | 2. 참참참 | 0. 게임종료");
			gameNumber = sc.nextInt();
			
			switch (gameNumber) {
			case 1:
				UpDown player1 = new UpDown();
				player1.musicList.push("Likey");
				player1.musicList.push("너 그리고 나");
				player1.musicList.push("HARD");
				player1.musicList.push("FEARLESS");
				player1.musicList.push("JUICE");
				player1.musicList.push("손오공");
				player1.musicList.push("가솔린");
				player1.toString();
				player1.game(userName);
				System.out.println(player1.getMusicList());
				player1.musicUp();
				player1.musicUp();
				player1.musicUp();
				player1.nextMusic();
				player1.nextMusic();
				System.out.println(player1.currentMusic());
				
				break;
			case 0: 
				System.out.printf("게임을 종료합니다 총 게임 성공 횟수는 %d번 입니다",UpDown.getAnswerCount());
				return;
			default:
				System.out.println("선택하신 게임이 없습니다");
				break;
			}
		}
		
	}

}
