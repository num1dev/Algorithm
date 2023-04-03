package baekjoon;

/*문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 
입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
		int B = sc.nextInt();
		int[] su = new int[3];
		int c = B;
		long sum = 0;
		int ten = 1;

		for (int i = 0; i <= 2; i++) {
			ten *= 10;
			su[i] = c % 10;
			c = c / 10;
			sum += (A * su[i] * ten / 10);

			System.out.println(A * su[i]);
		}

		System.out.println(sum);

		sc.close();
	}
}
