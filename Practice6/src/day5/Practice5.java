package day5;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) 
	{
				//Uoc so le
				System.out.println("Enter an number:");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int usl = 0;
				// Cau 2 -- DONE
				usl = checkUSL(n);
				System.out.println("Tich Uoc so le : " + usl);
				System.out.println("Enter a and b : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				//Cau 7 -- DONE
				int max =0 ;
				max = findMax(a,b);
				System.out.println("Max : " + max);
				// Uoc so chung - Cau 8 -- DONE
				int usc = gcd(a,b); 
				System.out.println("Uoc so chung : " + usc);
				// Boi so chung - Cau 9 -- DONE
				int bsc = lcm(a,b);
				System.out.println("Boi so chung : " + bsc);
				//Cau 6 --DONE
				int rev = 0;
				rev = reverseNum(n);
				System.out.println("Reverse number : " + rev);
				// Cau 1 -- DONE
				int s = Sum(n);
				System.out.println("Sum ans 1 : " + s);
				// Cau 5 -- DONE
				int first = findFirstNum(n);
				System.out.println("First number : " + first);
				//Cau 3 -- DONE
				int UCNN = checkUCNN(n);
				System.out.println("UCNN : " + UCNN);
		
	}

	public static int checkUCNN(int n3)
    {
        int sumN3 = 0;
        for(int i = 1; i <= n3; i++)
        {
            if(n3 % i == 0)
            {
                sumN3 += i;

            }
        }
        return sumN3;
    }

	public static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}

	public static int Sum(int n){
		int s = 0;
		for(int i = 1; i <= n; i++){
			s += ((float)i)/(i+1);
		}
		return s ;
	}

	public static int reverseNum(int n)
	{
		int rev = 0;
		while(n!=0)
		{
			rev = rev*10 + n%10;
			n = n/10;
		}
		return rev;
	}

	public static int findFirstNum(int n)
	{
		int first = 0;
		while(n!=0)
		{
			first = n%10;
			n = n/10;
		}
		return first;
	}

	public static int lcm(int a, int b)
	{
		return a*b/gcd(a,b);
	}
	
	public static int checkUSL(int n)
	{
		int usl = 0;
			for(int i = 1; i < n; i++)
			{
				if(n % i == 0)
					{
						if(i % 2 == 1)
						{
							usl = i;
						}
					}
					usl++;
				}
			return usl;
		}


		public static int findMax(int a , int b){
			if(a > b)
				return a;
			else
				return b;
		}

		public static int checkSL(int n)
		{
			int sum = 1;
			for(int i = 1; i <= n; i++)
			{
				if(n%i != 0){
					sum *= i;
				}
			}
			return sum;
		}
		
}



