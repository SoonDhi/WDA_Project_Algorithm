import java.util.Scanner;

public class Gridy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n�� �� �Է�");
		int n = sc.nextInt();
		System.out.println("k�� �� �Է�");
		int k = sc.nextInt();
		int cnt = 0;
		while (n != 1) { // n�� 1�� �ɶ����� �ݺ�
			if (n % k != 0) { // n - 1 (n�� k�� �������� ������)
				n -= 1;
				cnt++; // Ƚ�� ����
			} else if (n % k == 0) { // n�� k�� ������ ��
				n = n / k;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}