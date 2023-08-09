package BankList;



public class Bank {
	public static void main(String[] args) {
		
		WaitingList wl = new WaitingList();
		Human h1 = new Human("김지수",29);
		Human h2 = new Human("박소이",5);
		Human h3 = new Human("남다름",10);
		Human h4 = new Human("김소현",16);
		Human h5 = new Human("김유정",15);
		Human h6 = new Human("임영웅",25);
		Human h7 = new Human("박은빈",30);
		Human h8 = new Human("이준호",35);
		Human h9 = new Human("송강호",40);
		Human h10 = new Human("조규성",50);
		Human h11 = new Human("손흥민",80);
		Human h12 = new Human("김연아",80);
		
		wl.selectList();
		wl.addQueue(h1);
		wl.addQueue(h2);
		wl.addQueue(h3);
		wl.addQueue(h4);
		wl.addQueue(h5);
		wl.addQueue(h6);
		wl.addQueue(h7);
		wl.addQueue(h8);
		wl.addQueue(h9);
		wl.addQueue(h10);
		wl.addQueue(h11);
		wl.addQueue(h12);

		wl.selectList();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		wl.call();
		
		wl.addQueue(h4);
		wl.addQueue(h5);
		wl.addQueue(h6);
		wl.call();
		wl.call();
		wl.addQueue(h8);
		wl.selectList();
	}

}
