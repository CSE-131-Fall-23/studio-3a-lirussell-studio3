package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Find prime numbers up until?");
		int n = in.nextInt();

		boolean[] numbers = new boolean [n+1];
		
		for (int a = 2; a < n; a++)
		{
			for (int i = a; i <= (n/a); i++)
			{
				numbers[a*i] = true;
			}
		}

		for (int i = 2; i < numbers.length; i++)
		{
			if (numbers[i] == false)
			{
				System.out.println(i);
			}
		}
	}




}

