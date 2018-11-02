/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		 Collections.shuffle(player);

		 int GK = 0;
		 int DF = 0;
		 int MF = 0;
		 int FW = 0;

		 for (int i = player.size()-1; i >=0; i--) {

			 player.get(i).getPosition();



			 if (player.get(i).getPosition().equals("GK")&& GK<1 ) {
				 System.out.println(player.get(i));
				 GK ++;
				}

			 if (player.get(i).getPosition().equals("DF")&& DF<4 ) {
				 System.out.println(player.get(i));
				 DF ++;
				}

			 if (player.get(i).getPosition().equals("MF")&& MF<4 ) {
				 System.out.println(player.get(i));
				MF ++;
				}

			 if (player.get(i).getPosition().equals("FW")&& FW<2) {
				 System.out.println(player.get(i));
				 FW ++;
				}
		}






	}
}
