package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car [] cars = new Car[3];

		Car car1 = new Car();
		car1.color = "yellow";
		car1.gasoline = 60;

		Car car2 = new Car();
		car2.color = "black";
		car2.gasoline = 45;

		Car car3 = new Car();
		car3.color = "green";
		car3.gasoline = 25;

		cars[0]=car1;
		cars[1]=car2;
		cars[2]=car3;

		final int distance = 300;

		for (int i = 0; i < cars.length; i++) {
			 cars[i].run();

			 int progress = 0;
				int count=0;

				while (progress<distance) {

					progress+=cars[i].run();

					count++;

					if (0>cars[i].gasoline) {

						break;
					}
				}

				if (progress>distance) {
					System.out.println("目的地まで"+count+"時間かかりました。残りのガソリンは、"+cars[i].gasoline+"リットルです");
				} else  {
					System.out.println("目的地に到達できませんでした");
				}

		}

	}
}
