package jp.co.f1.superintro.ch8;

import java.util.Scanner;

public class HighAndLow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num =1;
		while (num<2) {
		
		
			//タイトル等最初に表示する部分。
			System.out.println("**************");
			System.out.println("* High & Low *");
			System.out.println("**************");
			System.out.println("");
			System.out.println("[問題表示]");
			
	
			//自分のカードを表示
			
			
			int myCard = (int)(Math.random()*8+1);
			
			//デバック用
			//System.out.println(myCard);
			
			
			int dealerCard = (int)(Math.random()*8+1);
			//デバック用
			//System.out.println(dealerCard);
			
			System.out.println("*****  *****");
			System.out.println("*   *  *   *");
			System.out.println("* "+myCard+" *  *   *");
			System.out.println("*   *  *   *");
			System.out.println("*****  *****");
			
			//ｈかｌを入力し予想
			int count=0;
			System.out.print("High　　or　　Low ?(h/l) >");
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			if(line.equals("h") ){
				System.out.println("→Highを選択しました。");
				count=1;
			}else if(line.equals("l")) {
				System.out.println("→Lowを選択しました。");
				count=2;
			}
			System.out.println(" ");
			
			//同じか結果が正しければ勝ち
			System.out.println("[結果表示]");
			
			System.out.println("*****  *****");
			System.out.println("*   *  *   *");
			System.out.println("* "+myCard+" *  * "+dealerCard+" *");
			System.out.println("*   *  *   *");
			System.out.println("*****  *****");
			
		
			if(count==1) {
				if(myCard<=dealerCard){
					System.out.println("→You Win!");
					
				}
				if(myCard>dealerCard){
					System.out.println("→You Lose!");
					num=2;
				}
			}
			if(count==2) {
				if(myCard>=dealerCard){
					System.out.println("→You Win!");
					
				}
				if(myCard<dealerCard){
					System.out.println("→You Lose!");
					num=2;
				}
			}
		}
		System.out.println("--ゲーム終了--");
		
		
		
	}
	

}
