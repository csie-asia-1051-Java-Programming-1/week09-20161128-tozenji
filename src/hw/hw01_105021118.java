package hw;
import java.util.Scanner;
/*
 * Topic: 讓使?��?�輸?���?�??��?��，利?��?��式呼?��?��?���???續整?��?��??��?�該?��??��?��?�為此�?�??��?��，�?��?�正?��?��並�?�能?��?��??續整?��，若?��不到??��?��?�印?��?�No?��??
 例�??: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author:  105021118  �G�媴
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
