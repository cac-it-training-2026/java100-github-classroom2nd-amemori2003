/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		int sitoronPersent = (int) ((250 * sitoron) / buyprice * 100);
		int shokoraPersent = (int) ((280 * shokora) / buyprice * 100);
		int pistaPersent = (int) ((320 * pista) / buyprice * 100);

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

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味    ・・・" + sitoronPersent + "%");
		System.out.println("ショコラの味      ・・・" + shokoraPersent + "%");
		System.out.println("ピスターシュの味  ・・・" + pistaPersent + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + (buyprice / (int) buycount / 10 * 10) + "です。");

	}
}