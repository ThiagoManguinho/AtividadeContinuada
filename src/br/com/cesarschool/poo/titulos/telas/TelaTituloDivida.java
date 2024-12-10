package br.com.cesarschool.poo.titulos.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.cesarschool.poo.titulos.entidades.TituloDivida;
import br.com.cesarschool.poo.titulos.mediators.MediatorTituloDivida;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaTituloDivida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTituloDivida frame = new TelaTituloDivida();
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
	public TelaTituloDivida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtuloDvida = new JLabel("Título Dívida");
		lblTtuloDvida.setBounds(287, 10, 338, 31);
		lblTtuloDvida.setForeground(Color.BLACK);
		lblTtuloDvida.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		contentPane.add(lblTtuloDvida);
		
		JLabel lblNewLabel_1 = new JLabel("Incluir:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(151, 75, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Identificador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(188, 92, 111, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(309, 97, 291, 19);
		contentPane.add(textField);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(236, 121, 63, 24);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(309, 126, 291, 19);
		contentPane.add(textField_1);
		
		JLabel lblDataDeValidade = new JLabel("Data de Validade:");
		lblDataDeValidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeValidade.setBounds(166, 150, 133, 24);
		contentPane.add(lblDataDeValidade);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(309, 155, 291, 19);
		contentPane.add(textField_2);
		
		JLabel lblTaxaDeJuros = new JLabel("Taxa de Juros:");
		lblTaxaDeJuros.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTaxaDeJuros.setBounds(186, 179, 133, 24);
		contentPane.add(lblTaxaDeJuros);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(309, 184, 291, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Alterar:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(151, 255, 55, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Identificador:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(188, 272, 111, 24);
		contentPane.add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(309, 277, 291, 19);
		contentPane.add(textField_4);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome_1.setBounds(236, 301, 63, 24);
		contentPane.add(lblNome_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(309, 306, 291, 19);
		contentPane.add(textField_5);
		
		JLabel lblDataDeValidade_1 = new JLabel("Data de Validade:");
		lblDataDeValidade_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeValidade_1.setBounds(166, 330, 133, 24);
		contentPane.add(lblDataDeValidade_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(309, 335, 291, 19);
		contentPane.add(textField_6);
		
		JLabel lblTaxaDeJuros_1 = new JLabel("Taxa de Juros:");
		lblTaxaDeJuros_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTaxaDeJuros_1.setBounds(188, 359, 133, 24);
		contentPane.add(lblTaxaDeJuros_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(309, 364, 291, 19);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setBounds(401, 213, 111, 31);
		contentPane.add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(401, 393, 111, 31);
		contentPane.add(btnAlterar);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Buscar:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(151, 438, 71, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Identificador:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(188, 456, 111, 24);
		contentPane.add(lblNewLabel_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(309, 461, 291, 19);
		contentPane.add(textField_8);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(401, 490, 111, 31);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Excluir:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(151, 528, 71, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Identificador:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(188, 544, 111, 24);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(309, 549, 291, 19);
		contentPane.add(textField_9);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(401, 578, 111, 31);
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
		btnSair.setBounds(722, 608, 138, 40);
		contentPane.add(btnSair);
		
		btnNewButton.addActionListener(e -> {
		    int identificador;
		    String nome = textField_1.getText();
		    LocalDate dataValidade;
		    double taxaJuros;

		    try {
		        dataValidade = LocalDate.parse(textField_2.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Data de validade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        identificador = Integer.parseInt(textField.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        taxaJuros = Double.parseDouble(textField_3.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Taxa de juros inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    TituloDivida tituloDivida = new TituloDivida(identificador, nome, dataValidade, taxaJuros);
		    MediatorTituloDivida mediatorTituloDivida = MediatorTituloDivida.getInstanciaSingleton();
		    
		    String resposta = mediatorTituloDivida.incluir(tituloDivida);
		    
		    if(resposta == null) {
		    	JOptionPane.showMessageDialog(this, "Título dívida incluída com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		
		btnAlterar.addActionListener(e -> {
			int identificador;
		    String nome = textField_5.getText();
		    LocalDate dataValidade;
		    double taxaJuros;

		    try {
		        dataValidade = LocalDate.parse(textField_6.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Data de validade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        identificador = Integer.parseInt(textField_4.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        taxaJuros = Double.parseDouble(textField_7.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Taxa de juros inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    TituloDivida tituloDivida = new TituloDivida(identificador, nome, dataValidade, taxaJuros);
		    MediatorTituloDivida mediatorTituloDivida = MediatorTituloDivida.getInstanciaSingleton();
		    
		    
		    String resposta = mediatorTituloDivida.alterar(tituloDivida);
		    
		    if(resposta == null) {
		    	JOptionPane.showMessageDialog(this, "Titulo dívida alterado com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		
		btnBuscar.addActionListener(e -> {
		    int identificador;
		    
		    try {
		        identificador = Integer.parseInt(textField_8.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
 
		    MediatorTituloDivida mediatorTituloDivida = MediatorTituloDivida.getInstanciaSingleton();
		    TituloDivida tituloDividaBusca = mediatorTituloDivida.buscar(identificador);
		    
		    if(tituloDividaBusca != null) {
		    	JOptionPane.showMessageDialog(this, "Busca efetuada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    	JOptionPane.showMessageDialog(this, tituloDividaBusca.getIdentificador() + ";" + tituloDividaBusca.getNome() + ";" + tituloDividaBusca.getDataValidade() + ";" + tituloDividaBusca.getTaxaJuros(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, "Erro ao tentar buscar título dívida!\n", "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
		
		btnExcluir.addActionListener(e -> {
		    int identificador;
		    
		    try {
		        identificador = Integer.parseInt(textField_9.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    MediatorTituloDivida mediatorTituloDivida = MediatorTituloDivida.getInstanciaSingleton();
		    String tituloDividaExcluido = mediatorTituloDivida.excluir(identificador);
		    
		    if(tituloDividaExcluido == null) {
		    	JOptionPane.showMessageDialog(this, "Exclusão efetuada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, tituloDividaExcluido, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
	}
}
