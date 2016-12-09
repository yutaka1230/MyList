package myList;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Dimension;
import javax.swing.JLabel;

public class myList extends JFrame implements ListSelectionListener {
	private JLabel lblNewLabel;
	private JList list;
	
	@SuppressWarnings("deprecation")
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	    Object[] arr = list.getSelectedValues();
	    String result = "";
	    for(Object obj:arr){
	      result += (String)obj + " ";
	    }
	    lblNewLabel.setText(result);
	}
	public myList() {
		setSize(new Dimension(364, 299));
		getContentPane().setSize(new Dimension(364, 299));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] data = {"Windows","Linux","Mac OS X"};
		list = new JList(data);
		
		lblNewLabel = new JLabel("New label");
	
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(list, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(12)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(48, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
	}

}
