package br.com.cesarschool.poo.titulos.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu frame = new TelaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 714);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ação Mediator");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaAcao frame = new TelaAcao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(380, 182, 138, 40);
		contentPane.add(btnNewButton);
		
		JButton btnEntidadeOperadoraMediator = new JButton("Entidade Mediator");
		btnEntidadeOperadoraMediator.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaEntidadeOperadora frame = new TelaEntidadeOperadora();
				frame.setVisible(true);
				dispose();
			}
		});
		btnEntidadeOperadoraMediator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEntidadeOperadoraMediator.setForeground(new Color(0, 0, 0));
		btnEntidadeOperadoraMediator.setBackground(new Color(192, 192, 192));
		btnEntidadeOperadoraMediator.setBounds(380, 232, 138, 40);
		contentPane.add(btnEntidadeOperadoraMediator);
		
		JButton btnOperaoMediator = new JButton("Operação Mediator");
		btnOperaoMediator.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaOperacao frame = new TelaOperacao();
				frame.setVisible(true);
				dispose();
			}
		});
		btnOperaoMediator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOperaoMediator.setForeground(new Color(0, 0, 0));
		btnOperaoMediator.setBackground(new Color(192, 192, 192));
		btnOperaoMediator.setBounds(380, 332, 138, 40);
		contentPane.add(btnOperaoMediator);
		
		JButton btnTtuloMediator = new JButton("Título Mediator");
		btnTtuloMediator.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaTituloDivida frame = new TelaTituloDivida();
				frame.setVisible(true);
				dispose();
			}
		});
		btnTtuloMediator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTtuloMediator.setForeground(new Color(0, 0, 0));
		btnTtuloMediator.setBackground(new Color(192, 192, 192));
		btnTtuloMediator.setBounds(380, 282, 138, 40);
		contentPane.add(btnTtuloMediator);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblNewLabel.setBounds(376, 100, 152, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBackground(new Color(128, 0, 0));
		btnSair.setBounds(380, 382, 138, 40);
		contentPane.add(btnSair);
	}
}
