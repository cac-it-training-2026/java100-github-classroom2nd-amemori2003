/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計    \\" + buyprice);
		System.out.println("\n内訳");

		System.out
				.println("シトロン    \\" + (int) (250 * sitoron) + "・・・" + (int) ((250 * sitoron) / buyprice * 100) + "%");
		System.out
				.println("ショコラ    \\" + (int) (280 * shokora) + "・・・" + (int) ((280 * shokora) / buyprice * 100) + "%");
		System.out.println("ピスターシュ\\" + (int) (320 * pista) + "・・・" + (int) ((320 * pista) / buyprice * 100) + "%");
	}

}
