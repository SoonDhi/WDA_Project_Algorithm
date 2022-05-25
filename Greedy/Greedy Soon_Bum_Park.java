import java.util.Scanner;

public class Gridy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n의 값 입력");
		int n = sc.nextInt();
		System.out.println("k의 값 입력");
		int k = sc.nextInt();
		int cnt = 0;
		while (n != 1) { // n이 1이 될때까지 반복
			if (n % k != 0) { // n - 1 (n이 k로 나눠지지 않을때)
				n -= 1;
				cnt++; // 횟수 증가
			} else if (n % k == 0) { // n이 k로 나눠질 때
				n = n / k;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}