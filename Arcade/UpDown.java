package arcade;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class UpDown extends Arcade {
	// 상속 : 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
	// 자바에서는 하나의 조상에서만 상속을 받을 수 있는 단일 상속을 사용
	
	
	private static int Count;
	private static int answerCount;
	private int answer;
	private Scanner sc; 
	
	// 오버라이딩
	// 조상클래스로부터 상속받은 메서드의 내용을 변경하는 것
	// 조상클래스의 메서드와 이름, 매개변수, 반환타입이 같아야 한다
	@Override
	public void record() {
		System.out.println("UpDown게임 녹화중입니다");
	}
	
	@Override
	void greeting(String userName) {
		// TODO Auto-generated method stub
	System.out.printf("%s님 UpDown게임에 오신 것을 환영합니다\n",userName);	
	}
	
	public UpDown() {
		// super() : 조상클래스의 생성자를 호출하는데 사용된다
		super();
		this.setName("UpDown");
		this.answer = answer;
		this.sc = new Scanner(System.in);
		// static메서드는 호출된 시점에 인스턴스가 존재하지 않을 수 있기 때문에 
		// this사용이 아닌 클래스명.으로 사용가능하다
		UpDown.answerCount = 0;
		UpDown.Count = 0;
		Arcade.setAsset(Arcade.getAsset() + 100);
	}
	public void  game(String userName) {
		greeting(userName);
		answer = new Random().nextInt(100)+1;
		System.out.println(answer);
		System.out.println("[  UpDown game  ]");
		System.out.println("1-100 사이의 정수를 입력해주세요");
		while(true) {
			int num = sc.nextInt();
			if(num < 1 || 100 < num){
				System.out.println("정답의 범위를 넘었습니다 다시 입력해주세요");
				
			}
			else {
				
				if(answer > num) {
					System.out.printf("입력하신 %s보다 UP하세요\n",num);
					Count += 1;
				}
				else if (answer < num) {
					System.out.printf("입력하신 %s보다 Down하세요\n",num);
					Count += 1;
				}else {
					break;
				}
			}
		}
		answerCount += 1;
		System.out.println(toString());
		System.out.println(currentMusic());
	}
	
	@Override
	public String toString() {
		
		String format = "[%s 게임 : 총 입력 시도 횟수 =  %s, 정답을 맟춘 횟수= %s]";
		Object[] args = {getName(),Count, answerCount};
		return String.format(format, args);
	}
	@Override
	public String currentMusic() {
		
		return super.currentMusic();
	}
	
	public static int getCount() {
		return Count;
	}
	public static void setCount(int count) {
		Count = count;
	}
	public static int getAnswerCount() {
		return answerCount;
	}
	public static void setAnswerCount(int answerCount) {
		UpDown.answerCount = answerCount;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
}
