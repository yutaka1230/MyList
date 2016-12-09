package myList;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myList frame = new myList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
