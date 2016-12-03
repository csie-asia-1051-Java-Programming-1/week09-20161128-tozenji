package hw;
import java.util.Scanner;
/*
 * Topic: è®“ä½¿?”¨?…è¼¸?…¥ä¸?æ­??•´?•¸ï¼Œåˆ©?”¨?‡½å¼å‘¼?«?‰¾?‡ºä¸???çºŒæ•´?•¸?•¸??—è?“è©²?•¸??—ç?„å?Œç‚ºæ­¤ä?æ­??•´?•¸ï¼Œæ?‰ä?›æ­£?•´?•¸ä¸¦ä?èƒ½?‰¾?‡º??çºŒæ•´?•¸ï¼Œè‹¥?‰¾ä¸åˆ°??‚ï?Œè?‹å°?‡º?ŒNo?ã??
 ä¾‹å??: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author:  105021118  ¾G¾åª´
 */
public class hw01_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		fun(n);
	}
	public static void fun(int x){
		String str=" ";
		int sum=0,count=0;
		for(int i=1;i<x;i++){
			sum=0;
			str=" "+i;
			int j=i;
			while(sum<x){
				sum+=j++;
				if(sum<x){
					str+="+"+j;
				}
				if(sum==x){
					count++;
					System.out.println(str);
				}
			}
			if(count==0){
				System.out.println("No");
			}
		}
	}

}
