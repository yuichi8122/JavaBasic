/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> player = new ArrayList<Player>();
		 try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();

	                Player er = new Player();
	                String[]soccer = line.split(",");

	                er.setPosition(soccer[0]);
	                er.setName(soccer[1]);
	                er.setCountry(soccer[2]);
	                er.setTeam(soccer[3]);


	                player.add(er);


	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }
		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		   //分割した文字を画面出力する
		 for (int i = player.size()-1; i >= 0; i--) {
			player.get(i).getTeam();

			if (player.get(i).getTeam().equals("レアル・マドリード") ||player.get(i).getTeam().equals("バルセロナ") ) {
				player.remove(i);
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		 for (Player player2 : player) {
				System.out.println(player2.toString());
			}

	}
}
