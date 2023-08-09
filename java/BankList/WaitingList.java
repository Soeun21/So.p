package BankList;

import java.util.LinkedList;
import java.util.Queue;

public class WaitingList implements BankWaiting{
	Queue<Human> a = new LinkedList<Human>();	// 은행의 대기줄
	static final int MAXPERSON = 10;	// 대기줄의 크기
	static int index = 0;	// 대기번호
	
	
	// 대기순서에 해당하는 객체를 부르는 메서드
	public void call() {
		Human h = new Human();
		if(!a.isEmpty()) {	// 대기줄이 비어있지 않으면
			h = a.poll();	// 대기자를 꺼내고
			index--;		// 대기번호를 -1한다
			System.out.println(h.getName() + " 님 순서입니다. ");
		}else{
			System.out.println("대기가 없습니다");
		}
		System.out.println();
	}
	
	
	// 대기자를 추가하는 메서드
	public void addQueue(Human h){
		
		if(a.size() == 10) {	// 대기자가 있는 리스트가 꽉차있을 경우 
		System.out.println("대기 인원이 많아 대기가 불가능합니다");	// 출력
		}
		else if(a.size() == 9) {	// 빈자리가 하나 남았을때 대기자가 추가된다면 대기가 꽉찼음을 알린다
			a.add(h);
			index++;
			addQueueAge(h.getName(), h.getAge());
			System.out.println("대기번호  " + index + "번  대기자 : " + h.getName() + ", 대기가 가득 찼습니다");
		}
		else {	// 대기인원의 여유가 있는경우
			a.add(h);	// 대기자를 추가시키고
			index++;	// 대기번호를 추가하여 부여한다
			addQueueAge(h.getName(), h.getAge());
			System.out.println("대기번호  " + index + "번  대기자 : " + h.getName());
		}
		System.out.println();
	}
	
	// 대기자 명단을 출력하는 메서드
	public void selectList() {
		System.out.println("[대기자 명단]");
		// 명단에 객체가 있으면
		if(!a.isEmpty()) {
			// 하나씩 꺼내서 출력
			for(Human h : a) {
				System.out.print( "[ "+ h.getName() + " ]");
			}System.out.println();
			
		// 대기명단이 비어있는 경우 리스트는 출력안함
		}else {
			System.out.println("대기자가 없습니다");
		}
		System.out.println();
	}
	
	
	// 대기자가 추가되면 대기자의 이름과 나이를 받아와서 출력문을 수행하는 메서드
	@Override
	public void addQueueAge(String a,int i) {
		if(i < 20) {
			System.out.println("20살 미만의 미성년자는 보호자를 동반하여 주세요");
		}
		else
			System.out.println("어서오세요 " + a + " 님 환영합니다");
		
		
	}
	
}
