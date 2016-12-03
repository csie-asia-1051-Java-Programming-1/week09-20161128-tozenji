package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021118  鄭曉玫
 */

public class ex03_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		int a,c=0;
		int n=scn.nextInt();
		for(a=1;a<=n;a++){
			if(a%2==0){
				c=c+1;
				System.out.println(a);
			}
		}
		if(c==2){
			System.out.println("為質數");
		}else{
			System.out.println("非質數");
		}
	}

}
