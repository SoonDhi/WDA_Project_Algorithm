import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10�ǹ�� ss�� : ");
		int money = sc.nextInt();
		int cnt = 0;
		int h = 0;
		int dong[] = {500, 100, 50 , 10};
		for (int i = 0; i < dong.length; i++) {
			h = money / dong[i]; // ������ �Ž����� ����
			money = money%dong[i];
			cnt += h; // �� ���� = ������ ���� ��ģ��
		}
		System.out.println("�Ž��� �� Ƚ�� : " + cnt);
	}
}
