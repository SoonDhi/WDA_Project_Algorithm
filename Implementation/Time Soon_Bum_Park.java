import java.util.*;

public class Time {

	public static void main(String[] args) {
		int h, m, s = 0;
		int cnt = 0;
		int sums = 0;
		int sumh = 0;
		int summ = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {

			for (int j = 0; j < 60; j++) {

				for (int k = 0; k < 60; k++) {

					sumh = i / 10;
					h = i % 10;

					summ = j / 10;
					m = j % 10;

					sums = k / 10;
					s = k % 10;

					if (sumh == 3 || h == 3 || summ == 3 || m == 3 || sums == 3 || s == 3) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
