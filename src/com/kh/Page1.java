package com.kh;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Page1 extends JFrame{
	
//	 public Practice() {
//	      super("NULL ���̾ƿ� ����");
//	      this.setBounds(100, 100, 300, 300);
//	      this.setLayout(null);
//	  
//	 }    
	 
	public Page1() {
		super("�ܾ� TEST");
		this.setBounds(650, 100, 400, 700);
		this.setLayout(null);
		
		
		//���
		JPanel panelBackground = new JPanel();
		panelBackground.setSize(400, 700);
		panelBackground.setBackground(new Color(123, 185, 237));
		this.setLayout(null);
		//������� �г� "�ܾ� TEST"
		JPanel panelTitle = new JPanel();
		panelTitle.setBounds(100, 0, 200, 50);
		panelTitle.setBackground(new Color(36, 107, 220));
		this.setLayout(null);
	
		
		//��� ���� "�ܾ� TEST"
		JLabel lbTop = new JLabel("�ܾ� TEST");
		lbTop.setBounds(140, 0, 200, 50);
		lbTop.setSize(400, 45);
		lbTop.setForeground(Color.WHITE);
		lbTop.setFont(lbTop.getFont().deriveFont(22f));
		this.setLayout(null);
//		lbTop.setFont(new Font(" ", Font.BOLD, 10));

		// TEST ���� �ܾ� ǥ�� -> JtextFiled �� ���� !!!!!
		JTextField tfWord = new JTextField("1");
		tfWord.setBounds(175,165, 30, 30);
		tfWord.setFont(new Font("Serif", Font.BOLD, 20));
		tfWord.setBackground(new Color(255, 255, 225));
		tfWord.setFont(tfWord.getFont().deriveFont(16.0f));
		tfWord.setHorizontalAlignment(JTextField.RIGHT);
		this.setLayout(null);
		
		JLabel lbNumber = new JLabel("/ 10");
		lbNumber.setBounds(210, 150, 60, 60);
		lbNumber.setFont(new Font("Serif", Font.BOLD, 20)); // ���� ��Ʈ
		lbNumber.setFont(lbNumber.getFont().deriveFont(16.0f));
		this.setLayout(null);
		
		//JtextField �� ���� !!!!! 
		JTextField tfVoca = new JTextField("Explain");
		tfVoca.setBounds(45, 220, 300, 100);
		tfVoca.setFont(new Font(" ", Font.BOLD, 10)); // ���� ��Ʈ
		tfVoca.setFont(tfVoca.getFont().deriveFont(45.0f));
		tfVoca.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		//��ȣ
		JLabel lbcenter1 = new JLabel("��");
		lbcenter1.setBounds(50, 350, 30, 30);
		lbcenter1.setForeground(Color.BLACK);
		lbcenter1.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);
		
		JLabel lbcenter2 = new JLabel("��");
		lbcenter2.setBounds(200, 350, 30, 30);
		lbcenter2.setForeground(Color.BLACK);
		lbcenter2.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);
		
		JLabel lbcenter3 = new JLabel("��");
		lbcenter3.setBounds(50, 400, 30, 30);
		lbcenter3.setForeground(Color.BLACK);
		lbcenter3.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);
		
		JLabel lbcenter4 = new JLabel("��");
		lbcenter4.setBounds(200, 400, 30, 30);
		lbcenter4.setForeground(Color.BLACK);
		lbcenter4.setFont(new Font("Serif", Font.BOLD, 25));
		this.setLayout(null);
		
		// �ܾ� ��
		JTextField tfsouth1 = new JTextField("�ܾ�1");
		tfsouth1.setBounds(80, 350, 100, 30);
		tfsouth1.setForeground(Color.BLACK);
		tfsouth1.setBackground(new Color(123, 185, 237));
		tfsouth1.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ
		tfsouth1.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		JTextField tfsouth2 = new JTextField("�ܾ�2");
		tfsouth2.setBounds(230, 350, 100, 30);
		tfsouth2.setForeground(Color.BLACK);
		tfsouth2.setBackground(new Color(123, 185, 237));
		tfsouth2.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ
		tfsouth2.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		JTextField tfsouth3 = new JTextField("�ܾ�3");
		tfsouth3.setBounds(80, 400, 100, 30);
		tfsouth3.setForeground(Color.BLACK);
		tfsouth3.setBackground(new Color(123, 185, 237));
		tfsouth3.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ	
		tfsouth3.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		JTextField tfsouth4 = new JTextField("�ܾ�4");
		tfsouth4.setBounds(230, 400, 100, 30);
		tfsouth4.setForeground(Color.BLACK);
		tfsouth4.setBackground(new Color(123, 185, 237));
		tfsouth4.setFont(new Font("Serif", Font.BOLD, 10)); // ���� ��Ʈ		
		tfsouth4.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
		
		JTextArea tasouth1 = new JTextArea("������ �Է��ϼ���.");
		tasouth1.setBounds(80, 450, 250, 30);
		tasouth1.setFont(new Font("Serif", Font.BOLD, 20)); // ���� ��Ʈ		
		this.setLayout(null);
		
		JButton btsouth1  = new JButton("����");
		btsouth1.setBounds(150, 520, 100, 50);
		btsouth1.setFont(new Font("Serif", Font.BOLD, 20));
		btsouth1.setBackground(new Color(36, 107, 220));
		btsouth1.setForeground(Color.WHITE);
		this.setLayout(null);
		

		
	
		
		btsouth1.addActionListener(new ActionListener() {//�͸�
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Popup a1 = new Popup ();
			}
		});
		
		
		
		this.add(tfsouth4);
		this.add(tfsouth3);
		this.add(tfsouth2);
		this.add(tfsouth1);
		this.add(tasouth1);
		this.add(btsouth1);
		this.add(lbcenter1);
		this.add(lbcenter2);
		this.add(lbcenter3);
		this.add(lbcenter4);
		this.add(tfWord);
		this.add(tfVoca);
		this.add(lbNumber);
		this.add(lbTop);
		this.add(panelTitle);
		this.add(panelBackground);

		
		//������ ����
		this.setResizable(false);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	public static void main(String[] args) {
		new Page1();

	}

}