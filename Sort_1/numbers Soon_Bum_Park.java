import java.util.*;

public class numbers {

	public static void main(String[] args) {
		ArrayList<Character> li = new ArrayList<Character>();
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int i = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a * b * c;
		String num = sum + "";
		for (int j = 0; j <= 10; j++) {

			if (i >= 1) {
				System.out.println(cnt);
				cnt = 0;
			}

			for (i = 0; i < num.length(); i++) {
				int s = num.charAt(i) - '0';
				if (s == j) {
					cnt++;

				}
			}
		}

	}
}
