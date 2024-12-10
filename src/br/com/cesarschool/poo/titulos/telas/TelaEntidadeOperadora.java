package br.com.cesarschool.poo.titulos.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.cesarschool.poo.titulos.entidades.EntidadeOperadora;
import br.com.cesarschool.poo.titulos.mediators.MediatorEntidadeOperadora;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaEntidadeOperadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEntidadeOperadora frame = new TelaEntidadeOperadora();
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
	public TelaEntidadeOperadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEntidadeOperadora = new JLabel("Entidade Operadora");
		lblEntidadeOperadora.setForeground(Color.BLACK);
		lblEntidadeOperadora.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblEntidadeOperadora.setBounds(214, 10, 518, 31);
		contentPane.add(lblEntidadeOperadora);
		
		JLabel lblNewLabel_1 = new JLabel("Incluir:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(143, 53, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Identificador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(194, 69, 111, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(315, 74, 291, 19);
		contentPane.add(textField);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(245, 98, 60, 24);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(315, 103, 291, 19);
		contentPane.add(textField_1);
		
		JLabel lblAutorizarAo = new JLabel("Autorizar Ação:");
		lblAutorizarAo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutorizarAo.setBounds(194, 127, 126, 24);
		contentPane.add(lblAutorizarAo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(315, 132, 291, 19);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setBounds(407, 215, 111, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Alterar:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(143, 243, 60, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Identificador:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(194, 266, 111, 24);
		contentPane.add(lblNewLabel_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(315, 271, 291, 19);
		contentPane.add(textField_5);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome_1.setBounds(245, 300, 60, 24);
		contentPane.add(lblNome_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(315, 305, 291, 19);
		contentPane.add(textField_6);
		
		JLabel lblAutorizarAo_1 = new JLabel("Autorizar Ação:");
		lblAutorizarAo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAutorizarAo_1.setBounds(184, 329, 126, 24);
		contentPane.add(lblAutorizarAo_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(315, 334, 291, 19);
		contentPane.add(textField_7);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(407, 424, 111, 31);
		contentPane.add(btnAlterar);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Buscar:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(143, 480, 60, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Identificador:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(194, 492, 111, 24);
		contentPane.add(lblNewLabel_2_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(315, 497, 291, 19);
		contentPane.add(textField_10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(407, 526, 111, 31);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Excluir:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(143, 571, 60, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Identificador:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(194, 584, 111, 24);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(315, 589, 291, 19);
		contentPane.add(textField_11);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(407, 618, 111, 31);
		contentPane.add(btnExcluir);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaMenu frame = new TelaMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBackground(new Color(128, 0, 0));
		btnSair.setBounds(723, 612, 138, 40);
		contentPane.add(btnSair);
		
		JLabel lblSaldoAo = new JLabel("Saldo Ação:");
		lblSaldoAo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaldoAo.setBounds(214, 154, 126, 24);
		contentPane.add(lblSaldoAo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(315, 161, 291, 19);
		contentPane.add(textField_3);
		
		JLabel lblSaldoTtuloDvida = new JLabel("Saldo Título Dívida:");
		lblSaldoTtuloDvida.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaldoTtuloDvida.setBounds(174, 181, 146, 24);
		contentPane.add(lblSaldoTtuloDvida);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(315, 186, 291, 19);
		contentPane.add(textField_4);
		
		JLabel lblSaldoAo_1 = new JLabel("Saldo Ação:");
		lblSaldoAo_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaldoAo_1.setBounds(214, 358, 126, 24);
		contentPane.add(lblSaldoAo_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(315, 363, 291, 19);
		contentPane.add(textField_8);
		
		JLabel lblSaldoTtuloDvida_1 = new JLabel("Saldo Título Dívida:");
		lblSaldoTtuloDvida_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaldoTtuloDvida_1.setBounds(159, 388, 146, 24);
		contentPane.add(lblSaldoTtuloDvida_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(315, 395, 291, 19);
		contentPane.add(textField_9);
		
		btnNewButton.addActionListener(e -> {
		    long identificador;
		    String nome = textField_1.getText();
		    boolean autorizacaoAcao;
		    double saldoAcao;
		    double saldoTituloDivida;

		    try {
		        autorizacaoAcao = Boolean.parseBoolean(textField_2.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Autorizar ação inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        identificador = Long.parseLong(textField.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        saldoAcao = Double.parseDouble(textField_3.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Saldo ação inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        saldoTituloDivida = Double.parseDouble(textField_4.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Saldo título dívida inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    EntidadeOperadora entidadeOperadora = new EntidadeOperadora(identificador, nome, autorizacaoAcao, saldoAcao, saldoTituloDivida);
		    MediatorEntidadeOperadora mediatorEntidadeOperadora = MediatorEntidadeOperadora.getInstanciaSingleton();
		    
		    String resposta = mediatorEntidadeOperadora.incluir(entidadeOperadora);
		    
		    if(resposta == null) {
		    	JOptionPane.showMessageDialog(this, "Entidade operadora incluída com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		
		btnAlterar.addActionListener(e -> {
		    long identificador;
		    String nome = textField_6.getText();
		    boolean autorizacaoAcao;
		    double saldoAcao;
		    double saldoTituloDivida;

		    try {
		        autorizacaoAcao = Boolean.parseBoolean(textField_7.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Autorizar ação inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        identificador = Long.parseLong(textField_5.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        saldoAcao = Double.parseDouble(textField_8.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Saldo ação inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        saldoTituloDivida = Double.parseDouble(textField_9.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Saldo título dívida inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    EntidadeOperadora entidadeOperadora = new EntidadeOperadora(identificador, nome, autorizacaoAcao, saldoAcao, saldoTituloDivida);
		    MediatorEntidadeOperadora mediatorEntidadeOperadora = MediatorEntidadeOperadora.getInstanciaSingleton();
		    
		    String resposta = mediatorEntidadeOperadora.alterar(entidadeOperadora);
		    
		    if(resposta == null) {
		    	JOptionPane.showMessageDialog(this, "Entidade operadora alterada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		
		btnBuscar.addActionListener(e -> {
		    long identificador;
		    
		    try {
		        identificador = Long.parseLong(textField_10.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    MediatorEntidadeOperadora mediatorEntidadeOperadora = MediatorEntidadeOperadora.getInstanciaSingleton();
		    
		    EntidadeOperadora entidadeOperadoraBusca = mediatorEntidadeOperadora.buscar(identificador);
		    
		    if(entidadeOperadoraBusca != null) {
		    	JOptionPane.showMessageDialog(this, "Busca efetuada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    	JOptionPane.showMessageDialog(this, entidadeOperadoraBusca.getIdentificador() + ";" + entidadeOperadoraBusca.getNome() + ";" + entidadeOperadoraBusca.isAutorizacaoAcao() + ";" + entidadeOperadoraBusca.getSaldoAcao() + ";" + entidadeOperadoraBusca.getSaldoTituloDivida(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, "Erro ao tentar buscar entidade operadora!\n", "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
		
		btnExcluir.addActionListener(e -> {
		    long identificador;
		    
		    try {
		        identificador = Long.parseLong(textField_11.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    MediatorEntidadeOperadora mediatorEntidadeOperadora = MediatorEntidadeOperadora.getInstanciaSingleton();
		    
		    String entidadeExcluida = mediatorEntidadeOperadora.excluir(identificador);
		    
		    if(entidadeExcluida == null) {
		    	JOptionPane.showMessageDialog(this, "Exclusão efetuada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, entidadeExcluida, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
	}
}
