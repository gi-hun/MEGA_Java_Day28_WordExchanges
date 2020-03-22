/*
 * # �ܾ� ��ü�ϱ�(replace)
 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
 * 2. ��ü���ִ� ����� �����Ѵ�.
 * ��)
 * 		Life is too short.
 * 		�����ϰ� ���� �ܾ��Է� : Life
 * 		�ٲ� �ܾ��Է� : Time
 * 
 * 		Time is too short.
 */
package day_28;

import java.util.Scanner;

public class StringEx17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = sc.nextLine();
	
		
		char[] arr = new char[text.length()];
		
		int size = word.length();
		int check = -1;
		int idx = 0;
		
		for(int i=0;i<text.length();i++)
		{
			arr[i] = text.charAt(i);
		}
		
		for(int i=0;i<arr.length-size+1;i++)
		{
			int count = 0;
			for(int j=0;j<size;j++)
			{
				if(arr[i+j] == word.charAt(j))
				{
					count++;
				}
			}
			
			if(count == size)
			{
				idx = i;
				check = 1;
			}
		}
		
		if(check == 1)
		{
			System.out.println("�ش� �ܾ �ֽ��ϴ�.");
			
			int firstIdx = idx;
			int lastIdx = idx + size;
			
			int leng = lastIdx - firstIdx + 1;
			
			System.out.println("�������� �ٲٽðڽ��ϱ�?");
			String change = sc.nextLine();
			int length = change.length();
			
			char[] temp = arr;
			String front = "";
			
			for(int i=0; i<firstIdx; i++)
			{
				front += temp[i];
			}
			
			String back = "";
			for(int i=lastIdx; i<temp.length; i++)
			{
				back += temp[i];
			}
			
			String result = front + change + back;
			System.out.println(result);
		}
		else
		{
			System.out.println("�ش� �ܾ �����ϴ�.");
		}
	}
}
