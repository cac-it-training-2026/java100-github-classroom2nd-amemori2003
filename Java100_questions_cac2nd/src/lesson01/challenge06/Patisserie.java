/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		int sitoron = Integer.parseInt(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		int shokora = Integer.parseInt(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		int pista = Integer.parseInt(str3);

		System.out.println("シトロン     " + sitoron + "個");
		System.out.println("ショコラ     " + shokora + "個");
		System.out.println("ピスターシュ " + pista + "個");

		int buycount = sitoron + shokora + pista;
		int buyprice = 250 * sitoron + 280 * shokora + 320 * pista;

		System.out.println("\n合計個数    " + buycount + "個");
		System.out.println("合計金額  " + buyprice + "円");

		System.out.println("\nをお買い上げですね");
		System.out.println("承りました。");

		sitoron = num1 - sitoron;
		shokora = num2 - shokora;
		pista = num3 - pista;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン		\\250・・・残り" + sitoron + "個");
		System.out.println("ショコラ		\\280・・・残り" + shokora + "個");
		System.out.println("ピスターシュ	\\320・・・残り" + pista + "個");

	}

}
