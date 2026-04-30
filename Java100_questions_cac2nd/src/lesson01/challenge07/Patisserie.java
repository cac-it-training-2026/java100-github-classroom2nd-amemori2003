/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int num1 = 30;
		int num2 = 30;
		int num3 = 30;

		System.out.println("\n本日のおすすめの商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + num1 + "個");
		System.out.println("ショコラ		\\280・・・残り" + num2 + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + num3 + "個");

		System.out.println("それぞれ何個ずつ買いますか？(最大30個まで)\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String str1 = reader.readLine();
		double sitoron = Double.parseDouble(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		double shokora = Double.parseDouble(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		double pista = Double.parseDouble(str3);

		System.out.println("シトロン     " + sitoron + "個");
		System.out.println("ショコラ     " + shokora + "個");
		System.out.println("ピスターシュ " + pista + "個");

		double buycount = sitoron + shokora + pista;
		int buyprice = (int) (250 * sitoron + 280 * shokora + 320 * pista);

		System.out.println("\n合計個数    " + buycount + "個");
		System.out.println("合計金額  " + buyprice + "円");
		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		num1 = (int) (num1 - sitoron);
		num2 = (int) (num2 - shokora);
		num3 = (int) (num3 - pista);

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + num1 + "個");
		System.out.println("ショコラ		\\280・・・残り" + num2 + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + num3 + "個");

	}
}
