package com.kh;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Popup extends JFrame{
	
//	 public Practice() {
//	      super("NULL ���̾ƿ� ����");
//	      this.setBounds(100, 100, 300, 300);
//	      this.setLayout(null);
//	  
//	 }    
	 
	public Popup() {
		super("������ �׽�Ʈ�� �Ϸ��߽��ϴ�.");
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

		
		JPanel panelpopup = new JPanel();
		panelpopup.setBounds(50, 200, 300, 200);
		panelpopup.setBackground(new Color(237, 237, 237));
		this.setLayout(null);
		
		JTextField tfWord = new JTextField("!");
		tfWord.setBounds(190,240, 30, 30);
		tfWord.setFont(new Font("Serif", Font.BOLD, 20));
		tfWord.setForeground(Color.BLACK);
		tfWord.setBackground(Color.YELLOW);
		tfWord.setHorizontalAlignment(JTextField.CENTER);
		this.setLayout(null);
	
		JLabel labelCenter = new JLabel("<html>������ �׽�Ʈ��<br/>�Ϸ��ϼ̽��ϴ�.</html>");
		labelCenter.setBounds(140, 250, 220, 100);
		labelCenter.setForeground(Color.BLACK);
		labelCenter.setFont(new Font("Serif", Font.BOLD, 16));
		this.setLayout(null);
		
		
		
		JButton btpopup = new JButton("���� �ޱ�");
		btpopup.setBounds(140, 340, 130, 50);
		btpopup.setFont(new Font("Serif", Font.BOLD, 20));
		btpopup.setBackground(new Color(36, 107, 220));
		btpopup.setBackground(new Color(36, 107, 220));
		btpopup.setForeground(Color.WHITE);
		this.setLayout(null);
		
		btpopup.addActionListener(new ActionListener() {//�͸�
			@Override
			public void actionPerformed(ActionEvent e) {
				gui f2 = new gui();
			}
		});
	
	
		
		this.add(tfWord);
		this.add(labelCenter);
		this.add(btpopup);
		this.add(panelpopup);
		this.add(lbTop);
		this.add(panelTitle);
		this.add(panelBackground);
		
		//������ ����
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

	public static void main(String[] args) {
		new Popup();
	}
}