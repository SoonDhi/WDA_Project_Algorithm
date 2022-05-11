import java.util.Scanner;

/*
  	상근이와 선영이는 동시에 가지고 있는 CD를 팔려고 한다. CD를 몇 개나 팔 수 있을까?
	입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스의 첫째 줄에는 상근이가 가지고 있는 CD의 수 N, 선영이가 가지고 있는 CD의 수 M이 주어진다. N과 M은 최대 백만이다. 다음 줄부터 N개 줄에는 상근이가 가지고 있는 CD의 번호가 오름차순으로 주어진다. 다음 M개 줄에는 선영이가 가지고 있는 CD의 번호가 오름차순으로 주어진다. CD의 번호는 십억을 넘지 않는 양의 정수이다. 입력의 마지막 줄에는 0 0이 주어진다.
	상근이와 선영이가 같은 CD를 여러장 가지고 있는 경우는 없다.
	출력
	두 사람이 동시에 가지고 있는 CD의 개수를 출력한다.
 */

public class CD {

	static int n, m;
	static int[] list_1, list_2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String caseTest;
		String[] temp;
		while(true) {
			caseTest = sc.nextLine();
			if("0 0".equals(caseTest)) break;
			else {
				temp = caseTest.split(" ");
				n = Integer.parseInt(temp[0]);
				m = Integer.parseInt(temp[1]);
				list_1 = new int[n];
				list_2 = new int[m];
				for(int i = 0; i < n; i++)
					list_1[i] = sc.nextInt();
				for(int i = 0; i < n; i++)
					list_2[i] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		int cnt = 0;
		int start, end, mid;
		
		for(int i = 0; i < list_1.length; i++) {
			start = 0;
			end = m-1;
			
			while(start <= end) {
				mid = (start+end) / 2;
				if(list_1[i] > list_2[mid])
					start = mid + 1;
					
				else if(list_1[i] < list_2[mid])
					end = mid - 1;
				
				else if(list_1[i] == list_2[mid]) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
