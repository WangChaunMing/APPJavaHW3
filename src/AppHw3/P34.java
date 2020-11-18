package AppHw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P34 {
		public static void main(String[] args) throws IOException
		{
			System.out.println("請輸入一個整數");
			
			BufferedReader br1=	
					new BufferedReader(new InputStreamReader(System.in));
			
			String str1=br1.readLine();
			int num=Integer.parseInt(str1);
			
			System.out.println("你輸入的數字是"+num);
			
		}
	}
