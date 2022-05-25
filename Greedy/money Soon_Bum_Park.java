import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10의배수 ss값 : ");
		int money = sc.nextInt();
		int cnt = 0;
		int h = 0;
		int dong[] = {500, 100, 50 , 10};
		for (int i = 0; i < dong.length; i++) {
			h = money / dong[i]; // 동전당 거슬러준 개수
			money = money%dong[i];
			cnt += h; // 총 개수 = 동전당 개수 합친거
		}
		System.out.println("거슬러 준 횟수 : " + cnt);
	}
}
