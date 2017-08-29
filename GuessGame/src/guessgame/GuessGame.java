package guessgame;

public class GuessGame {
	Player p1;	//������ʵ�������ֱ��ʾ3��Player����
	Player p2;
	Player p3;

	public void startGame() {	//������Player����
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;	//����3������������²������
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false;	//����3�������������Ƿ����
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);	//�����յ�����
		System.out.println("I'm thinking of a number between 0 and 9...");

		while(true) {
			System.out.println("Number to guess is " + targetNumber);

			p1.guess();	//����Player��guess()����
			p2.guess();
			p3.guess();

			guessp1 = p1.number;	//ȡ��ÿ��Player�����ֲ������г�
			System.out.println("Player one guessed " + guessp1);

			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);

			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			if(guessp1 == targetNumber) {
				p1isRight = true;
			}
			if(guessp2 == targetNumber) {
				p2isRight = true;
			}
			if(guessp3 == targetNumber) {
				p3isRight = true;
			}

			if(p1isRight || p2isRight || p3isRight) {	//�����һ�����߶����Ҳ���
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break;	//���˲µ���ȷ�𰸣�����Ϸ������ѭ����ֹ
			}
			else {	//��û�µ�����Ϸ��������
				System.out.println("Players will have to try again.");
			}
		}
	}
}