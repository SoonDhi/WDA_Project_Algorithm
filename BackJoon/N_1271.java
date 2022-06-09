import java.math.BigInteger;
import java.util.Scanner;

public class N_1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		System.out.print(n.divide(m) +"\n"+ n.remainder(m));
	}
}
